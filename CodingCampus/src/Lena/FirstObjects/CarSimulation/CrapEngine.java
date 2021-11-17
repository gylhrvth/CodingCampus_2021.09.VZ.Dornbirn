package Lena.FirstObjects.CarSimulation;

import java.util.Random;

public class CrapEngine extends Engine{
    public CrapEngine(double kW) {
        super(kW);
    }

    private void motorBreaksMaybe(){
        Random random = new Random();
        if(this.drovenKM/random.nextInt(100)+1>random.nextInt(1)+1) {
            setBroken(true);
        }
    }
}
