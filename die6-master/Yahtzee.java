public class Yahtzee
{
    private Die6[] dice = {
            new Die6(),
            new Die6(),
            new Die6(),
            new Die6(),
            new Die6()
        };

    /**
     * Constructor for objects of class Yahtzee
     */
    public Yahtzee()
    {
        this.roll();
    }

    public void roll(int dieNumber) {
        if (dieNumber > 0 && dieNumber <= dice.length) {
            dice[dieNumber-1].roll();
        }
    }

    public void roll() {
        for (int i = 0; i < dice.length; i++) {
            dice[i].roll();
        }
    }

    public String summarize() {
        String values = "";

        for (int i = 0; i < dice.length; i++) {
            values += (i+1)+"-"+dice[i].getValue();
            if (i < dice.length-1) {
                values += "; ";
            }
        }

        return values;
    }

    public String toString() {
        String values = "Dice values: ";

        for (int i = 0; i < dice.length; i++) {
            values += dice[i].getValue();
        }

        return values;
    }
}
