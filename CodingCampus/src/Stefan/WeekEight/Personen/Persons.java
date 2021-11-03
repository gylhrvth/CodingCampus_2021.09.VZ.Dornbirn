package Stefan.WeekEight.Personen;

public class Persons {
    private String name;
    private int age;
    private int height;
    private int weight;

    public Persons(String name, int age, int height, int weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return String.format("%10s %5d %5s %5s", this.name, this.age, this.height, this.weight);
    }







}
