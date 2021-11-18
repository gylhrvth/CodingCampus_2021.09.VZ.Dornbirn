package Danny.classes.taskCarSimulation;

public class RepairStation {

    public void repairCar(Car repairCar) {
        repairCar.engine.setWearValue(0);
        repairCar.engine.setRandomBound(2);
    }
}
