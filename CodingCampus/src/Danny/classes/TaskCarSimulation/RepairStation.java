package Danny.classes.TaskCarSimulation;

public class RepairStation {
    private Car repairCar;

    public RepairStation(Car repairCar) {
        this.repairCar = repairCar;
    }

    public void repairCar(Car repairCar) {
        repairCar.engine.setWearValue(0);
        repairCar.engine.setRandomBound(2);
    }

    public Car getRepairCar() {
        return repairCar;
    }

    public void setRepairCar(Car repairCar) {
        this.repairCar = repairCar;
    }
}
