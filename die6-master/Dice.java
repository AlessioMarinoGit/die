/**
 * Uses the Die6 class to roll 2 dice
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class Dice
{
    private Die6 die1;
    private Die6 die2;

    /**
     * Constructor for objects of class Dice
     */
    public Dice()
    {
        die1 = new Die6();
        die2 = new Die6();
    }
    
    public void roll() {
        die1.roll();
        die2.roll();
    }

    public int getValue() {
        return die1.getValue() + die2.getValue();
    }
    
    public int rollAndGetValue() {
        roll();
        return getValue();
    }
}
