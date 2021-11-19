package Rauan.woche10.strategyExcercise;

public class Paddleboat implements CanSwim,CanStartAndStop {
    private SwimBehavior swimBehavior= new SwimBehavior(this);
    @Override
    public void swim(int km) {
        swimBehavior.swim(km);
    }

    @Override
    public void start() {
        System.out.println("Paddel inst Wasser und los gehts!!!");
    }

    @Override
    public void stop() {
        System.out.println("Paddel ins Wasser fallen lassen!!!");
    }
}
