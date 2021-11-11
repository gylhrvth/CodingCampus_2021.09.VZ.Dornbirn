package Danny.classes.TaskCarSimulation;

public class Tank {
    private double tankCapacity;
    private int minTank;
    private int maxTank;

    public Tank(int minTank, int maxTank) {
        this.setTankCapacity(tankCapacity);
        this.setMinTank(minTank);
        this.setMaxTank(maxTank);
    }

    public boolean isTankEmpty() {
        return tankCapacity < 1;
    }

    public double getTankCapacity() {
        return tankCapacity;
    }

    public void setTankCapacity(double tankCapacity) {
        if (tankCapacity < 0) {
            throw new IllegalArgumentException("Provided value is invalid!");
        }
        this.tankCapacity = tankCapacity;
    }

    public int getMinTank() {
        return minTank;
    }

    public void setMinTank(int minTank) {
        if (minTank < 0) {
            throw new IllegalArgumentException("Provided value is invalid!");
        }
        this.minTank = minTank;
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
