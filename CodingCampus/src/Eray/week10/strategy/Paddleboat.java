package Eray.week10.strategy;

public class Paddleboat implements CanSwim, CanStartAndStop {

    SwimBehavior swimBehavior = new SwimBehavior(this);

    @Override
    public void swim(int km) {
        swimBehavior.swim(km);
    }

    @Override
    public void start() {
        System.out.println("Ich paddele los");
    }

    @Override
    public void stop() {
        System.out.println("Ich habe aufgehört zu paddeln");
    }
}
