package Ingo.week7.testRadio;

import java.time.LocalDateTime;

public class Radio {
    // Attribute
    private String name = "";
    private boolean isOn;
    private double frequency;
    private int volume;
    private int age;
    private int clock;

    public Radio() {
    }

    // Setter / Getter
    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    int getVolume() {
        return volume;
    }

    void setFrequency(double newFrequency) {
        if (newFrequency > 0)
            frequency = newFrequency;
    }

    double getFrequency() {
        return frequency;
    }

    @Override
    public String toString() {
        return "Radio{" +
                "name='" + name + '\'' +
                ", isOn=" + isOn +
                ", frequency=" + frequency +
                ", volume=" + volume +
                ", age=" + age +
                ", clock=" + clock +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println(name);
        this.name = name;

    }

    // Sonstiges
    public void volumeUp() {
        volume++;
    }

    public void volumeDown() {
        if (volume > 0)
            volume--;
    }

    public void setAge() {

    }

    public void setClock() {
        for (int i = 1; i <= 12; i++) {
            System.out.println(i);
        }
    }

    public static void getClock() {
        LocalDateTime time = LocalDateTime.now();
        System.out.println(time);
    }

}
