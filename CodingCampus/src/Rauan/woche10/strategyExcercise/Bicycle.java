package Rauan.woche10.strategyExcercise;

public class Bicycle implements CanDrive, CanStartAndStop {
    private DriveBehavior driveBehavior = new DriveBehavior(this);

    @Override
    public void drive(int km) {
        driveBehavior.drive(km);
    }

    @Override
    public void start() {
        System.out.println("Ich steig aufs Rad und tret in die Pedale!!!");
    }

    @Override
    public void stop() {
        System.out.println("Ich bremse und steige langsam ab.");
    }
}
