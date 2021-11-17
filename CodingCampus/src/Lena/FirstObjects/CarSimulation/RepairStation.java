package Lena.FirstObjects.CarSimulation;

public class RepairStation {

    private String name;


    public RepairStation(String name){
        this.name=name;
    }

    public void repairEngine(Car car){
        System.out.println(car.getManufacturer()+" hat einen neuen Motor bekommen");
        car.setEngine(new Engine(80));

    }

    public void repairTank(Car car){
        car.setTank(new Tank(0));
    }


}
