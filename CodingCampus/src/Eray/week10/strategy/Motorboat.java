package Eray.week10.strategy;

public class Motorboat implements CanSwim, CanStartAndStop {

    private SwimBehavior swimBehavior = new SwimBehavior(this);

    @Override
    public void swim(int km) {
      swimBehavior.swim(km);
    }

    @Override
    public void start() {
        System.out.println("Starte das Boot");
    }

    @Override
    public void stop() {
        System.out.println("Stelle das Boot ab");
    }
}
