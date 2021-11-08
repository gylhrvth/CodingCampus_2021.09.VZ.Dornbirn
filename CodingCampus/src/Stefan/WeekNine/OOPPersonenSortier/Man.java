package Stefan.WeekNine.OOPPersonenSortier;

public class Man extends Person {

    private String athletic;

    public Man(String name, int age, int height, int weight, String athletic) {
        super(name, age, height, weight);
        this.athletic = athletic;
    }

    public String getAthletic() {
        return athletic;
    }

    public void setAthletic(String athletic) {
        this.athletic = athletic;
    }

    @Override
    public String toString() {
        return String.format("Name:%12s\nALter:%6s\nGrösse:%6s\nGewicht:%4s\nAtletic:%5s\n", getName(), getAge(), getHeight(), getWeight(), getAthletic());
    }
}
