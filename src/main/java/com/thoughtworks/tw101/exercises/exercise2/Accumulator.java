package com.thoughtworks.tw101.exercises.exercise2;

public class Accumulator {
    private int timesIncrementIsCalled;

    public Accumulator(){
        timesIncrementIsCalled = 0;
    }

    public void increment(){
        timesIncrementIsCalled++;
    }

    public int total(){
        return timesIncrementIsCalled;
    }

}
