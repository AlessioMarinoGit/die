public class Yahtzee
{
    private Die6[] dice = {
            new Die6(),
            new Die6(),
            new Die6(),
            new Die6(),
            new Die6()
        };
        
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
        int[] amount = {0, 0, 0, 0, 0, 0};
        
        for (int i = 0; i < dice.length; i++) {
            amount[dice[i].getValue()-1]++;
        }
        for (int i = 1; i <= amount.length; i++) {
            values += i+"-"+amount[i-1];
            if (i <= amount.length) {
                values += "; ";
            }
        }

        return values;
    }

    public String toString() {
        String values = "Dice values:";

        for (int i = 0; i < dice.length; i++) {
            values += " " + dice[i].getValue();
        }

        return values;
    }
}
