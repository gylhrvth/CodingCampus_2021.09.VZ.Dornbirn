package Eray.week10.strategy;

public class SwimBehavior {

    private CanStartAndStop canStartAndStop;

    public SwimBehavior(CanStartAndStop canStartAndStop) {
        this.canStartAndStop = canStartAndStop;
    }

    public void swim(int km) {
        canStartAndStop.start();
        for (int i = 0; i < km; i++) {
            if (i % 10 == 0) {
                System.out.println("Swimming kilometer: " + i);
            }
        }
        canStartAndStop.stop();
    }
}
