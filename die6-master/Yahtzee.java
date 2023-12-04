/**
 * Uses the Die6 class to roll 2 dice
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class Yahtzee
{
    private Die6[] dice;
    private int[] values;

    /**
     * Constructor for objects of class Yahtzee
     */
    public Yahtzee()
    {
        dice[1] = new Die6();
        dice[2] = new Die6();
        dice[3] = new Die6();
        dice[4] = new Die6();
        dice[5] = new Die6();
        int[] diceToRoll = { 1,2,3,4,5 };
        this.roll( diceToRoll );
    }
    
    public void roll(int[] diceToRoll) {
        for (int i = 0; i < diceToRoll.length; i++) {
            this.values[diceToRoll[i]] = dice[diceToRoll[i]].rollAndGetValue();
        }
    }

    public int getTotal() {
        int total = 0;
        for (int i = 0; i < values.length; i++) {
            total += values[i];
        }
        return total;
    }
    
    public int rollAndGetTotal(int[] diceToRoll) {
        roll(diceToRoll);
        return getTotal();
    }
}
