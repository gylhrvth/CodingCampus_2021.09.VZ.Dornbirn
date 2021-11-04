package Ingo.week7.testRadio;

public class Radio {
    // Attribute
    private String name = "";
    private boolean isOn;
    private double frequency;
    private int volume;
    private int age;

    public Radio() {
    }

    // Setter / Getter
    public boolean isOn() {
        return isOn;
    }
    public void setOn(boolean on) {
        isOn = on;
    }
    int getVolume(){
        return volume;
    }

    void setFrequency(double newFrequency) {
        if (newFrequency > 0)
            frequency = newFrequency;
    }

    double getFrequency() {
        return frequency;
    }

    // @Override
    public String toString() {
        return "Radio{" +
                "name='" + getName() + '\'' +
                ", isOn=" + isOn +
                ", frequency=" + frequency +
                ", volume=" + volume +
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
}
