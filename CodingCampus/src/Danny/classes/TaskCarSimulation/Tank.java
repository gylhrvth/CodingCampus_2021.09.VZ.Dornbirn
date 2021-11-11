package Danny.classes.TaskCarSimulation;

public class Tank {
    private double tankCapacity;

    public Tank(double tankCapacity) {
        this.setTankCapacity(tankCapacity);
    }

    public double getTankCapacity() {
        return tankCapacity;
    }

    public void setTankCapacity(double tankCapacity) {
        this.tankCapacity = tankCapacity;
    }
}
