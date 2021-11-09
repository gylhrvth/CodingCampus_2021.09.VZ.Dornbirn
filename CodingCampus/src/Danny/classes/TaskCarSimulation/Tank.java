package Danny.classes.TaskCarSimulation;

public class Tank {
    private int tankCapacity;



    public void setTankCapacity(int tankCapacity) {
        if (tankCapacity < 0) {
            throw new IllegalArgumentException("Provided value is invalid!");
        }
        this.tankCapacity = tankCapacity;
    }
    public int getTankCapacity() {
        return tankCapacity;
    }

}
