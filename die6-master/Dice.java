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
    private int[] values;

    /**
     * Constructor for objects of class Dice
     */
    public Dice()
    {
        die1 = new Die6();
        die2 = new Die6();
        this.roll();
    }
    
    public void roll() {
        int roll1 = die1.rollAndGetValue();
        int roll2 = die2.rollAndGetValue();
        
        int[] rolls = {roll1, roll2};
        this.values = rolls;
    }

    public int getTotal() {
        int total = 0;
        for (int i = 0; i < values.length; i++) {
            total += values[i];
        }
        return total;
    }
    
    public int rollAndGetTotal() {
        roll();
        return getTotal();
    }
}
