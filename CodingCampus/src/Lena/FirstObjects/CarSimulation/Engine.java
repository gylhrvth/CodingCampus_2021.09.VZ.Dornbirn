package Lena.FirstObjects.CarSimulation;

import java.util.Random;

public class Engine {

    public int drovenKM=0;
    private boolean isOn = false;
    private boolean isBroken = false;
    private double kW;



    public Engine (double kW){
        setkW(kW);
    }

    public void startEngine() throws EngineDefectException {

        if(this.isBroken){;
            setOn(false);
            throw new EngineDefectException("Der Motor kann nicht gestartet werden, da er defekt ist");
        }else if(this.isOn){
            System.out.println("Der Motor kann nicht gestartet werden, wenn er schon gestartet ist");
        }else {
            System.out.println("Der Motor ist gestartet");
            setOn(true);

        }
    }

    private void motorBreaksMaybe(){
        Random random = new Random();
       if(this.drovenKM/random.nextInt(100)+1>random.nextInt(3)+3) {
           setBroken(true);
       }
    }

    public void stopEngine(int drovenKM){
        if(!this.isOn){
            System.out.println("Der Motor kann nicht gestoppt werden, wenn er nicht gestartet ist");
        }else {
            System.out.println("Der Motor ist gestoppt");
            setOn(false);
            setDrovenKM(drovenKM);
            motorBreaksMaybe();
        }
    }


    public boolean isOn() {

        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public boolean isBroken() {
        return isBroken;
    }

    public void setBroken(boolean broken) {
        isBroken = broken;
    }

    public double getkW() {
        return kW;
    }

    public void setkW(double kW) {
        this.kW = kW;
    }

    public int getDrovenKM() {
        return drovenKM;
    }

    public void setDrovenKM(int drovenKM) {
        this.drovenKM = drovenKM;
    }
}
