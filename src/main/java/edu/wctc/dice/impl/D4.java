package edu.wctc.dice.impl;
import edu.wctc.dice.iface.Dice;
public class D4 implements Dice {
    private int sides=4;
    public int getSides(){
        return this.sides;
    }
}
