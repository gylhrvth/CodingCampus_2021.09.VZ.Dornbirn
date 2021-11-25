package Rauan.woche10.strategyExcercise;

public class Motorboat implements CanSwim,CanStartAndStop {
    private SwimBehavior swimBehavior= new SwimBehavior(this);
    @Override
    public void swim(int km) {
        swimBehavior.swim(km);
    }

    @Override
    public void start() {
        System.out.println("Das Motorboot startet den Motor und schwimmt los");
    }

    @Override
    public void stop() {
        System.out.println("Das Motorboot hört auf zu schwimmen und treibt weiter und wirft den Anker");
    }
}
