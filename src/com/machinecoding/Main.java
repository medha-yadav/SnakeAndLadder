package com.machinecoding;

import com.machinecoding.model.Ladder;
import com.machinecoding.model.Player;
import com.machinecoding.model.Snake;
import com.machinecoding.service.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        List<Player> players = new ArrayList<Player>();

/*      TO READ PLAYER DETAILS

        System.out.println("Enter no of players : ");
        int np = s.nextInt();
        for(int i = 0 ; i < np; i++)
        {
            System.out.println("Enter name of player " + (i+1) + " : ");
            players.add(new Player(s.next()));
        }*/

        players.add(new Player("Alpha"));
        players.add(new Player("Beta"));

        List<Snake> snakes = new ArrayList<Snake>();

/*       TO READ SNAKE INPUT

        System.out.println("Enter no of snakes : ");
        int ns = s.nextInt();
        for(int i = 0 ; i < ns; i++)
        {
            System.out.println("Enter head and tail of snake : " + (i+1) + " : ");
            snakes.add(new Snake(s.nextInt(),s.nextInt()));
        }*/
        snakes.add(new Snake(62 ,5));
        snakes.add(new Snake(33 ,6));
        snakes.add(new Snake(49 ,9));
        snakes.add(new Snake(88 ,16));
        snakes.add(new Snake(56 ,53));
        snakes.add(new Snake(98 ,64));
        snakes.add(new Snake(93 ,73));
        snakes.add(new Snake(95 ,75));
        snakes.add(new Snake(41 ,20));


        List<Ladder> ladders = new ArrayList<Ladder>();
/*      TO READ LADDER INPUT

        System.out.println("Enter no of ladder : ");
        int nl = s.nextInt();
        for(int i = 0 ; i < nl; i++)
        {
            System.out.println("Enter start and end of ladder : " + (i+1) + " : ");
            ladders.add(new Ladder(s.nextInt(),s.nextInt()));
        }*/


        ladders.add(new Ladder(2,37));
        ladders.add(new Ladder(27,46));
        ladders.add(new Ladder(10,32));
        ladders.add(new Ladder(61,79));
        ladders.add(new Ladder(65,84));
        ladders.add(new Ladder(71,91));
        ladders.add(new Ladder(81,100));
        ladders.add(new Ladder(51,68));




        SLGameService game = new SLGameService(players,snakes,ladders);

        game.startGame();






    }
}
