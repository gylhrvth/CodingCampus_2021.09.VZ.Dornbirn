package Danny.woche8.day2.AufgabePerson;

public class MinMaxAverage2 {

    private final double avgAge;
    private final double avgSize;
    private final double avgWeight;

    private Person minAgePerson = null;
    private Person maxAgePerson = null;

    private Person minSizePerson = null;
    private Person maxSizePerson = null;

    private Person minWeightPerson = null;
    private Person maxWeightPerson = null;

    public MinMaxAverage2(Person minAgePerson, Person maxAgePerson, double avgAge
            , Person minSizePerson, Person maxSizePerson, double avgSize
            , Person minWeightPerson, Person maxWeightPerson, double avgWeight) {

        this.avgAge = avgAge;
        this.avgSize = avgSize;
        this.avgWeight = avgWeight;
        this.minAgePerson = minAgePerson;
        this.maxAgePerson = maxAgePerson;
        this.minSizePerson = minSizePerson;
        this.maxSizePerson = maxSizePerson;
        this.minWeightPerson = minWeightPerson;
        this.maxWeightPerson = maxWeightPerson;
    }

    public double getavgAge() {
        return avgAge;
    }

    public double getavgSize() {
        return avgSize;
    }

    public double getavgWeight() {
        return avgWeight;
    }

    public Person getMinAgePerson() {
        return minAgePerson;
    }

    public Person getMaxAgePerson() {
        return maxAgePerson;
    }

    public Person getMinSizePerson() {
        return minSizePerson;
    }

    public Person getMaxSizePerson() {
        return maxSizePerson;
    }

    public Person getMinWeightPerson() {
        return minWeightPerson;
    }

    public Person getMaxWeightPerson() {
        return maxWeightPerson;
    }

    @Override
    public String toString() {
        String tmp = "";
        tmp += String.format("Age: Minvalue: %s %d | Maxvalue: %s %d | Average: %.2f", minAgePerson.getName(), minAgePerson.getAge(), maxAgePerson.getName(), maxAgePerson.getAge(), avgAge);
        tmp += "\n";
        tmp += String.format("Size: Minvalue: %s %d | Maxvalue: %s %d | Average: %.2f", minSizePerson.getName(), minSizePerson.getSize(), maxSizePerson.getName(), maxSizePerson.getSize(), avgSize);
        tmp += "\n";
        tmp += String.format("Weight: Minvalue: %s %d | Maxvalue: %s %d | Average: %.2f", minWeightPerson.getName(), minWeightPerson.getWeight(), maxWeightPerson.getName(), maxWeightPerson.getWeight(), avgWeight);
        return tmp;
    }
}
