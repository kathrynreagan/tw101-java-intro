package com.thoughtworks.tw101.exercises.exercise6;

/**
 * Created by Kathryn on 5/31/2016.
 */
public class Orc implements Monster {

    public int hitpoints;

    public Orc() {
        hitpoints = 20; // orcs have 20 initial hitpoints
    }

    @Override
    public void takeDamage(int amount) {
        hitpoints -= amount;
    }

    @Override
    public void reportStatus() {
        System.out.println("The Orc monster has " + hitpoints + " hitpoints.");
    }
}
