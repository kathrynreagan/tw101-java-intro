package com.thoughtworks.tw101.exercises.exercise7;
import java.util.Random;

/**
 * Created by Kathryn on 5/31/2016.
 * For TW101 Java intro exercise 7.
 */
public class GuessingGame {
    private int random;

    public GuessingGame(){
        Random rn = new Random();
        random = rn.nextInt(100) + 1; // generates number between 1 and 100, inclusive
    }

    /* Returns an int to indicate if the user's guess is correct.
     * 0 = guess is correct
     * 1 = guess is too high
     * -1 = guess is too low
     */
    public int checkGuess(int guess){
        int diff = guess - random;
        if(diff == 0){
            return diff; // guess is correct
        }
        else if(diff > 0){
            return 1; // guess is greater than the number
        }
        else{
            return -1; // guess is less than the number
        }
    }

}
