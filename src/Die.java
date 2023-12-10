import java.util.concurrent.ThreadLocalRandom;

public class Die {
    private static int numSides;
    private static int value;

    public Die () {
        numSides = 6;
        value = 1;
    }
    public static int getNumSides() {
        return numSides;
    }

    public static void setNumSides(int numSides) {
        Die.numSides = numSides;
    }

    public int getValue() {
        return value;
    }

    public static void setValue(int value) {
        Die.value = value;
    }

    public Die (int numSides) {
        Die.numSides = numSides;
        value = 1;
    }

    @Override
    public String toString() {
        return "" + this.getNumSides() + this.getValue();
    }


    public static int roll() {
        int randomNum = ThreadLocalRandom.current().nextInt(1, numSides);
        value = randomNum;
        return value;
    }
}
