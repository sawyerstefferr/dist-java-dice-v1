package edu.wctc.dice.impl;
import edu.wctc.dice.iface.Dice;
public class D20 implements Dice {
    private int sides=20;
    public int getSides(){
        return this.sides;
    }
}
