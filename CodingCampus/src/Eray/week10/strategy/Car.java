package Eray.week10.strategy;

public class Car implements CanDrive, CanStartAndStop {
    private DriveBehavior driveBehavior = new DriveBehavior(this);

    @Override
    public void drive(int km) {
        driveBehavior.drive(km);
    }

    @Override
    public void start() {
        System.out.println("Ich starte den Motor: brumm und DRÜCK DAS PEDAL");
    }

    @Override
    public void stop() {
        System.out.println("Ich bremse und stelle den Motor ab");
    }
}
