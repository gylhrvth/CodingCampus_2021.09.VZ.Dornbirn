package Rauan.woche10.strategyExcercise;

public class SwimBehavior {
    private CanStartAndStop canStartAndStop;

    public  SwimBehavior(CanStartAndStop canStartAndStop) {
        this.canStartAndStop = canStartAndStop;
    }

    public void swim(int km) {
        canStartAndStop.start();
        for (int i = 0; i < km; i++) {
            if (i % 10 == 0 || i == km - 1) {
                System.out.println("Swimming kilometer " + i + "->" + (i + 1));
            }
        }
        canStartAndStop.stop();
    }
}
