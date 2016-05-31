package com.thoughtworks.tw101.exercises.exercise6;

/**
 * Created by Kathryn on 5/31/2016.
 */
public class Troll implements Monster {

    public int hitpoints;

    public Troll() {
        hitpoints = 40; // trolls have 40 initial hitpoints
    }

    @Override
    public void takeDamage(int amount) {
        int actualDamageAmount = amount/2; // trolls only take half hitpoints
        hitpoints -= actualDamageAmount;
    }

    @Override
    public void reportStatus() {
        System.out.println("The Troll monster has " + hitpoints + " hitpoints.");
    }
}
