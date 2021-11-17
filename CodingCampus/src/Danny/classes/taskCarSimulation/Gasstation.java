package Danny.classes.taskCarSimulation;

public class Gasstation {

    public void refuel(Car refuelCar, int fuel) {
        refuelCar.tank.setTankCapacity(refuelCar.tank.getTankCapacity() + fuel);
    }
}
