package Stefan.Week10.Selbstkontrolle.oop.excercise3;

import Stefan.Week10.Selbstkontrolle.oop.excercise2.Person;


import java.util.ArrayList;
import java.util.List;

public class House {
    private int door;
    private int windows;
    private String adress;
    private List<Person> persons;

    public House(int door, int windows, String adress) {
        this.door = door;
        this.windows = windows;
        this.adress = adress;
        this.persons = new ArrayList<>();
    }

    public List<Person> getPersons() {
        return persons;
    }

    public void setPersons(List<Person> persons) {
        this.persons = persons;
    }

    public void addPerson(Person person) {
        persons.add(person);
    }

    public int getDoor() {
        return door;
    }

    public void setDoor(int door) {
        this.door = door;
    }

    public int getWindows() {
        return windows;
    }

    public void setWindows(int windows) {
        this.windows = windows;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Override
    public String toString() {
        return String.format("Adr:%2s\nTür:%2s\nFen:%2s\nBewohner:\n%2s", getAdress(), getDoor(), getWindows(),getPersons());
    }
}
