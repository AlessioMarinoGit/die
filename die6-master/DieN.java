
/**
 * Abstracts one six-sided die (plural is dice)
 * 
 * @Mr. Jaffe
 * @1.0 2017-07-13
 */
public class DieN
{
    /**
     * Contains the current value of the die
     */
    private int sidesToRoll;
    private int value;

    /**
     * Constructor to do an initial roll to set the first value
     */
    public DieN(int sides) {
        this.roll();
    }

    /**
     * Getter for value
     * @return Die value
     */

    public void setSides(int sides) {
        if (sides != 0) {
            sidesToRoll = Math.abs(sides);
        }
    }

    public int getValue() {
        return value;
    }

    /**
     * Roll the die! Generate random number 1 <= x <= 6 and assign to value
     * Note that roll does NOT return the new value
     */
    public void roll() {
        this.value = (int)(Math.random() * sidesToRoll) + 1;
    }

    /**
     * Roll the die and return the new value
     * @return Die value
     */
    public int rollAndGetValue() {
        roll();
        return getValue();
    }

}

