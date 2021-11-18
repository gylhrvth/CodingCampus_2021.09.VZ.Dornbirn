package Bartosz.oop.training.basics;

public class Dogs {
    private int age;
    private String name;
    private String race;
    private String color;

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getRace() {
        return race;
    }
    public void setRace(String race) {
        this.race = race;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public Dogs(int age, String name, String race, String color){
        this.age = age;
        this.name = name;
        this.race = race;
        this.color = color;
    }

}


