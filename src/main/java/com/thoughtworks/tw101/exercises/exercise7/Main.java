package com.thoughtworks.tw101.exercises.exercise7;

// Write a program that chooses a random number between 1 and 100. Then asks the user to enter a guess. If they guess
// right then tell them they win, otherwise tell them if they guessed too high or low. Keep asking the user to guess
// until they get the right answer. Use classes to separate the different concerns of this program.

/* Separate concerns:
 * generate a random number between 1 and 100 -- GuessingGame constructor
 * user guesses a number -- Main
 * compare guess to the number -- GuessingGame checkGuess method
 * give high/low feedback to user -- Main
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        GuessingGame game = new GuessingGame();

        System.out.println("New game started! Guess a number between 1 and 100.");
        boolean correctGuess = false;
        int guess;

        while(!correctGuess){
            guess = Integer.parseInt(input.next());

            int check = game.checkGuess(guess);
            if(check == 0){
                System.out.println("You're correct!");
                correctGuess = true;
            }
            else if(check == 1){
                System.out.println("You guess too high. Try again.");
            }
            else if(check == -1){
                System.out.println("You guessed too low. Try again.");
            }
            else{
                System.out.println("Error. Try again.");
            }


        }

    }
}
