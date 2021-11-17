package Eray.week8.carSimulation.aufgabe2new;

public class Motor {
    private boolean isTurnedOn = false;

    public void start() {
        System.out.println("Das Auto wurde gestartet!");
        this.isTurnedOn = true;
    }

    public void stop() {
        System.out.println("Das Auto wurde ausgeschaltet!");
        this.isTurnedOn = false;
    }
    public void setIsTurnedOn(boolean isTurnedOn) {
        this.isTurnedOn = isTurnedOn;
    }

    public boolean isTurnedOn() {
        return isTurnedOn;
    }
}
