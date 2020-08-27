package edu.wctc.dice.impl;

import edu.wctc.dice.iface.Dice;
import edu.wctc.dice.iface.GameInput;
import edu.wctc.dice.iface.GameOutput;
import edu.wctc.dice.iface.NumberGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Random;

public class DiceRoller {
    private Dice dice;
    public DiceRoller(Dice dice){
        this.dice=dice;
    }
    public boolean rollDice() {
        int die1 = rollDie();
        int die2 = rollDie();

        // Players win on even totals
        boolean even = (die1 + die2) % 2 == 0;

        String outcome = "Roll was " + die1 + ", " + die2;



//        logger.info(outcome);

        return even;
    }

    private int rollDie() {
        Random random = new Random();
        return random.nextInt(this.dice.getSides()) + 1;
//        return dieRoller.rollDie();
    }
}
