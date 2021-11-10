package Danny.classes.TaskCarSimulation;

public class Tank {
    private double tankCapacity;

    public Tank(double tankCapacity) {
        this.setTankCapacity(tankCapacity);
    }

    public int getTankCapacity() {
        return (int) tankCapacity;
    }

    public void setTankCapacity(double tankCapacity) {
        this.tankCapacity = tankCapacity;
    }
}
