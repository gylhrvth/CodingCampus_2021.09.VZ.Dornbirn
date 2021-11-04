package Stefan.WeekEight.Personen;



public class Persons {
    private String name;
    private String gender;
    private int age;
    private int height;
    private int weight;

    public Persons(String name, String gender, int age, int height, int weight) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    //Getter
    String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }


    //Setter
    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
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
        return String.format("Name:%10s\nGender:%3s\nALter:%5s\nGröße:%6s\nGewicht:%3s\n", this.name, this.gender, this.age, this.height, this.weight);
    }


}
