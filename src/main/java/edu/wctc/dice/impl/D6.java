package edu.wctc.dice.impl;

import edu.wctc.dice.iface.Dice;

public class D6 implements Dice {
    private int sides=6;
    public int getSides(){
        return this.sides;
    }
}
