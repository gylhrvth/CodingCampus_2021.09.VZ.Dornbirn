package Lukas.week10.day4.strategy;

public class AmphibienVehicle implements CanSwim, CanDrive, CanStartAndStop {
    private DriveBehavior driveBehavior = new DriveBehavior(this);

    @Override
    public void drive(int km) {
        driveBehavior.drive(km);
    }

    @Override
    public void swim(int km) {
        System.out.println("Sie glauben, ich kann nur fahren, aber ich kann auch schwimmen nämlich " + km + " kilometer!!!");
    }

    @Override
    public void start() {
        System.out.println("Ich starte meinen Amphibienmotor!!!");
    }

    @Override
    public void stop() {
        System.out.println("Ich stoppe meinen Amphibienmotor!!!");
    }
}
