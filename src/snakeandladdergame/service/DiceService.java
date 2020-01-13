package snakeandladdergame.service;

import snakeandladdergame.Constants;

import java.util.Random;

public class DiceService {

    public static int roll() {
        return new Random().nextInt(Constants.NO_OF_DICE_FACES) + 1; // The game will have a six sided dice numbered from 1 to 6 and will always give a random number on rolling it.
    }
}
