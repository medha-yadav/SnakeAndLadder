package snakeandladdergame.model;

import snakeandladdergame.Constants;

import java.util.List;
public class Board {

    int[] board;
    public List<Player> players;
    public List<Snake> snakes;
    public List<Ladder> ladders;


    public Board() {

        this.board = new int[Constants.BOARD_LENGTH*Constants.BOARD_BREADTH];

        for(int i = 0 ,count = 1; i < Constants.BOARD_LENGTH* Constants.BOARD_BREADTH; i++)
        {
                board[i] =i+1;
        }
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public List<Snake> getSnakes() {
        return snakes;
    }

    public void setSnakes(List<Snake> snakes) {
        this.snakes = snakes;
    }

    public List<Ladder> getLadders() {
        return ladders;
    }

    public void setLadders(List<Ladder> ladders) {
        this.ladders = ladders;
    }

    public int[] getBoard() {
        return board;
    }

    public void setBoard(int[] board) {
        this.board = board;
    }
}
