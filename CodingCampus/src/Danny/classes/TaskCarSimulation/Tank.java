package Danny.classes.TaskCarSimulation;

public class Tank {
    private double tankCapacity;
    private int maxTank;

    public Tank(int maxTank) {
        this.setTankCapacity(5);
        this.setMaxTank(maxTank);
    }

    public boolean isTankEmpty() {
        return tankCapacity < 1;
    }

    public double getTankCapacity() {
        return tankCapacity;
    }

    public void setTankCapacity(double refuel) {
        if (refuel < 0) {
            throw new IllegalArgumentException("Provided value is invalid!");
        }
        this.tankCapacity = refuel;

    }

    public int getMaxTank() {
        return maxTank;
    }

    public void setMaxTank(int maxTank) {
        if (maxTank < 0) {
            throw new IllegalArgumentException("Provided value is invalid!");
        }
        this.maxTank = maxTank;
    }

}
