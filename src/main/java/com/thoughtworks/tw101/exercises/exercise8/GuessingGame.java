package com.thoughtworks.tw101.exercises.exercise8;
import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Kathryn on 5/31/2016.
 * For TW101 Java intro exercise 8.
 */
public class GuessingGame {
    private int random;
    private ArrayList<Integer> wrongGuesses;

    public GuessingGame(){
        Random rn = new Random();
        random = rn.nextInt(100) + 1; // generates number between 1 and 100, inclusive
        wrongGuesses = new ArrayList<Integer>();
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
        else {
            wrongGuesses.add(guess);
            if(diff > 0){
                return 1; // guess is greater than the number
            }
            else{
                return -1; // guess is less than the number
            }
        }
    }

    public String returnWrongGuesses(){
        StringBuilder wrongGuessesString = new StringBuilder();
        for(Integer wrongGuess : wrongGuesses){
            wrongGuessesString.append(wrongGuess).append(" ");
        }
        return wrongGuessesString.toString();
    }

}
