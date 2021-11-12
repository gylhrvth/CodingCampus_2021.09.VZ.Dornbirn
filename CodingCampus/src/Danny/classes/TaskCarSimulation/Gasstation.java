package Danny.classes.TaskCarSimulation;

public class Gasstation {

    public void refuel (Car refuelCar, int fuel){
        refuelCar.tank.setTankCapacity(fuel);
    }
}
