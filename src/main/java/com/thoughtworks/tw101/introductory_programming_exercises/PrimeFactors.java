package com.thoughtworks.tw101.introductory_programming_exercises;

//  Prime Factors Exercise
//  Write a method generate(int n) that given an integer N will return a list of integers such that the numbers
//  are the factors of N and are arranged in increasing numerical order.
//
//  For example, generate(1) should return an empty list and generate(30) should return the numbers: 2,3,5.

import java.util.LinkedList;
import java.util.List;

public class PrimeFactors {
    public static void main(String[] args) {
        List<Integer> primeFactors = generate(30);
        for(Integer prime : primeFactors){
            System.out.print(prime + " ");
        }
    }

    private static List<Integer> generate(int n) {
        List<Integer> primes = new LinkedList<Integer>();

        while(n%2 == 0){
            primes.add(2);
            n /= 2;
        }

        // now n is odd
        for(int i = 3; i <= Math.sqrt(n); i += 2){
            while(n%i == 0){
                primes.add(i);
                n /= i;
            }
        }
        if(n > 2){
            primes.add(n);
        }
        return primes;
    }
}
