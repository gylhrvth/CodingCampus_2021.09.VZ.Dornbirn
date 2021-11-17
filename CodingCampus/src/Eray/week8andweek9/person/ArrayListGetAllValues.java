package Eray.week8andweek9.person;

public class ArrayListGetAllValues {

    private final int personMinAge;
    private final double average;
    private final int personMaxAge;

    public ArrayListGetAllValues(int personMinAge, int personMaxAge, double average) {
       this.personMinAge = personMinAge;
       this.personMaxAge = personMaxAge;
       this.average= average;
    }

    public double getAverage() {
        return average;
    }

    public int getPersonMaxAge() {
        return personMaxAge;
    }

    public int getPersonMinAge() {
        return personMinAge;
    }

    @Override
    public String toString() {
        return String.format("Das minimalste Alter beträgt: %d \n Das maximalste Alter beträgt: %d \n Das DurchschnittsAlter beträgt: %.2f", personMinAge, personMaxAge, average);
    }

}
