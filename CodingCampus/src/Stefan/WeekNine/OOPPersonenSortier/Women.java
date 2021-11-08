package Stefan.WeekNine.OOPPersonenSortier;

import Stefan.WeekNine.OOPPersonenSortier.Person;

public class Women extends Person {

    private String bust;


    public Women(String name, int age, int height, int weight, String bust) {
        super(name, age, height, weight);
        this.bust = bust;
    }

    public String getBust() {

        return bust;
    }

    public void setBust(String bust) {

        this.bust = bust;
    }

    @Override
    public String toString() {
        return String.format("Name:%11s\nALter:%6s\nGrösse:%6s\nGewicht:%4s\nKörbchen:%2s\n", getName(), getAge(), getHeight(), getWeight(), getBust());
    }
}
