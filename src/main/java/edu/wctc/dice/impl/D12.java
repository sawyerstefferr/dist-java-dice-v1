package edu.wctc.dice.impl;
import edu.wctc.dice.iface.Dice;
public class D12 implements Dice {
    private int sides=12;
    public int getSides(){
        return this.sides;
    }
}
