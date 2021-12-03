package Gerhard.week10.selbstKontrolle.UEBUNG3;

import Gerhard.week10.selbstKontrolle.uebung2.Person;

import java.util.ArrayList;
import java.util.List;

public class House {
    private int doors;
    private int windows;
    private String adressen;
    private String person;

    public House(int doors, int windows, String adress) {

        this.doors = doors;
        this.windows = windows;
        this.adressen = adressen;
        this.person = person;


    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getWindows() {
        return windows;
    }

    public void setWindows(int windows) {
        this.windows = windows;
    }

    public String getAdressen() {
        return adressen;
    }

    public void setAdressen(String adressen) {
        this.adressen = adressen;
    }


}

