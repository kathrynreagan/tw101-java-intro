package com.thoughtworks.tw101.exercises.exercise8;

// Exercise #8: Create a new version of Exercise #7 where you also record all of the user’s guesses and print them out
// once they guess correctly. Use an ArrayList to store the guesses. Catch the NumberFormatException and handle the case
// where the user entered a String that is not parseable.

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        GuessingGame game = new GuessingGame();

        System.out.println("New game started! Guess a number between 1 and 100.");
        boolean correctGuess = false;
        int guess;

        while(!correctGuess){
            try {
                guess = Integer.parseInt(input.next());

                int check = game.checkGuess(guess);
                if (check == 0) {
                    System.out.println("You're correct!");
                    System.out.println("These were your incorrect guesses:\n" + game.returnWrongGuesses());
                    correctGuess = true;
                } else if (check == 1) {
                    System.out.println("You guessed too high. Try again.");
                } else if (check == -1) {
                    System.out.println("You guessed too low. Try again.");
                } else {
                    System.out.println("Error. Try again.");
                }
            }
            catch (NumberFormatException e) {
                System.out.println("You did not enter a valid integer, please try again.");
            }


        }

    }
}