package Rauan.Widerholung.KlassePerson;

public class Person {

    private String name;
    private int age;
    private String gender;

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender= gender;

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String isGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


    @Override
    public String toString() {
        return String.format("Name: " + name +'\n'+
                "age: " + age +'\n'+
                "gender: " + gender+'\n');
    }
}
