package edu.wctc.dice.impl;
import edu.wctc.dice.iface.Dice;
public class D8 implements Dice {
    private int sides=8;
    public int getSides(){
        return this.sides;
    }
}
