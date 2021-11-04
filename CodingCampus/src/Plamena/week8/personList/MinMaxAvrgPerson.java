package Plamena.week8.personList;

public class MinMaxAvrgPerson {
    private final double avrgAge;
    private final double avrgHeight;
    private final double avrgWeight;
    private final int minAge;
    private final int minHeight;
    private final int minWeight;
    private final int maxAge;
    private final int maxHeight;
    private final int maxWeight;
    private final String youngestPers;
    private final String oldestPers;
    private final String heaviestPers;
    private final String tallestPers;
    private final String lightestPers;
    private final String smallestPers;

    public MinMaxAvrgPerson(double avrgAge, double avrgHeight, double avrgWeight, String youngestPers, int minAge, String smallestPers,
                            int minHeight, String lightestPers, int minWeight, String oldestPers, int maxAge, String tallestPers,
                            int maxHeight, String heaviestPers, int maxWeight) {
        this.avrgAge = avrgAge;
        this.avrgHeight = avrgHeight;
        this.avrgWeight = avrgWeight;
        this.minAge = minAge;
        this.minHeight = minHeight;
        this.minWeight = minWeight;
        this.maxAge = maxAge;
        this.maxHeight = maxHeight;
        this.maxWeight = maxWeight;
        this.youngestPers = youngestPers;
        this.heaviestPers = heaviestPers;
        this.lightestPers = lightestPers;
        this.tallestPers = tallestPers;
        this.smallestPers = smallestPers;
        this.oldestPers = oldestPers;
    }

    public double getAvrgAge() {
        return avrgAge;
    }

    public double getAvrgHeight() {
        return avrgHeight;
    }

    public double getAvrgWeight() {
        return avrgWeight;
    }

    public int getMinAge() {
        return minAge;
    }

    public int getMinHeight() {
        return minHeight;
    }

    public int getMinWeight() {
        return minWeight;
    }

    public int getMaxAge() {
        return maxAge;
    }

    public int getMaxHeight() {
        return maxHeight;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    @Override
    public String toString(){
        return String.format("The average age is: %.2f\n" +
                "The average height is: %.2f\n" +
                "The average weight is: %.2f\n" +
                "The youngest person is %s, who is %d years old.\n" +
                "The smallest person is %s, who is %dcm tall.\n" +
                "The lightest person is %s, who weighs %dkg.\n" +
                "The oldest person is %s, who is %d years old.\n" +
                "The tallest person is %s, who is %dcm tall.\n" +
                "The heaviest person is %s, who weighs %dkg.\n", avrgAge,avrgHeight,avrgWeight,
                youngestPers, minAge, smallestPers, minHeight, lightestPers, minWeight,
                oldestPers, maxAge, tallestPers, maxHeight, heaviestPers, maxWeight);
    }
}
