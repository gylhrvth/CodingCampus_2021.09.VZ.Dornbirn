package Eray.week10.strategy;

public class AmphibienVehicle implements CanSwim, CanDrive, CanStartAndStop {
    private DriveBehavior driveBehavior = new DriveBehavior(this);
    private SwimBehavior swimBehavior = new SwimBehavior(this);

    @Override
    public void drive(int km) {
        driveBehavior.drive(km);
    }

    @Override
    public void swim(int km) {swimBehavior.swim(km);}

    @Override
    public void start() {
        System.out.println("Ich starte meinen Amphibienmotor!!!");
    }

    @Override
    public void stop() {
        System.out.println("Ich stoppe meinen Amphibienmotor!!!");
    }
}
