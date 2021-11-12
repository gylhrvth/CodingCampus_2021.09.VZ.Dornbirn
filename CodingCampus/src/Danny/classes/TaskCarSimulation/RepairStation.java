package Danny.classes.TaskCarSimulation;

public class RepairStation {

    public void repairCar(Car repairCar) {
        repairCar.engine.setWearValue(0);
        repairCar.engine.setRandomBound(2);

    }

}
