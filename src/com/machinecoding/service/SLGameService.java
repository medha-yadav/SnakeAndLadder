package com.machinecoding.service;

import com.machinecoding.model.*;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;

public class SLGameService {

    public Board snakeAndLadderBoard;
    private Queue<Player> playerQueue;
    private boolean isGameCompleted;
    int noOfPlayers;


    public SLGameService(List<Player> players,List<Snake> snakes,List<Ladder> ladders) {
        this.snakeAndLadderBoard = new Board();
        snakeAndLadderBoard.setSnakes(snakes);
        snakeAndLadderBoard.setLadders(ladders);
        snakeAndLadderBoard.setPlayers(players);
        noOfPlayers = players.size();
        isGameCompleted = false;
        playerQueue = new ArrayDeque<Player>();
        for(int i = 1; i <= noOfPlayers;i++)
        {
            ((ArrayDeque<Player>) playerQueue).addFirst(players.get(i-1));
        }
    }

    private int getTotalValueAfterDiceRolls() {
        // Can use noOfDices and setShouldAllowMultipleDiceRollOnSix here to get total value (Optional requirements)

        int val =  DiceService.roll();

        if( val == 6 ) {
            int secondVal = DiceService.roll();
            val = val + secondVal;
            if(secondVal == 6)
            {
                int thirdVal = DiceService.roll();
                if(thirdVal == 6)
                {
                    val = 0;
                }
                else
                {
                    val = val+thirdVal;
                }
            }
        }
        return val;
    }

    private int getNewPositionAfterGoingThroughSnakesAndLadders(int newPosition)
    {
        for(Snake snake : snakeAndLadderBoard.getSnakes())
        {
            if(snake.getHead()==newPosition)
            {
                return snake.getTail();
            }
        }

        for(Ladder ladder : snakeAndLadderBoard.getLadders())
        {
            if(ladder.getBottom()==newPosition)
            {
                return ladder.getHead();
            }
        }

        return newPosition;
    }

    private void movePlayer(Player player, int positions) {
        int oldPosition = player.currentPosition;
        int newPosition = oldPosition + positions; // Based on the dice value, the player moves their piece forward that number of cells.

        int boardSize = snakeAndLadderBoard.getBoard().length;

        // Can modify this logic to handle side case when there are multiple dices (Optional requirements)
        if (newPosition > boardSize) {
            newPosition = oldPosition; // After the dice roll, if a piece is supposed to move outside position 100, it does not move.
        } else {
            newPosition = getNewPositionAfterGoingThroughSnakesAndLadders(newPosition);
        }

        player.currentPosition = newPosition;
        System.out.println(player.getName() + " rolled a " + positions + " and moved from " + oldPosition +" to " + newPosition);

        if(newPosition == boardSize) {
            System.out.println(player.getName()+ " wins the game ! ");
            playerQueue.remove(player);
            if(playerQueue.size()==1) isGameCompleted = true; // only 1 player is left
        }
        else
        {
            playerQueue.add(player);
        }

    }

    public void startGame()
    {
        while(!isGameCompleted)
        {
            int totalDiceValue = getTotalValueAfterDiceRolls();
            Player currentPlayer = playerQueue.poll();
            movePlayer(currentPlayer, totalDiceValue);
        }
    }
}
