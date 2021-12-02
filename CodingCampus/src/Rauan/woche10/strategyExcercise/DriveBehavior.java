package Rauan.woche10.strategyExcercise;

public class DriveBehavior {
    private CanStartAndStop canStartAndStop;

    public DriveBehavior(CanStartAndStop canStartAndStop) {
        this.canStartAndStop = canStartAndStop;
    }

    public void drive(int km) {
        canStartAndStop.start();
        for (int i = 0; i < km; i++) {
            if (i % 10 == 0 || i == km - 1) {
                System.out.println("Drivin kilometer " + i + "->" + (i + 1));
            }
        }
        canStartAndStop.stop();
    }
}
