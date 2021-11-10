package Danny.classes.TaskCarSimulation;

import java.util.Random;

public class Engine {

    private int kW;
    private DRIVE_TYP DRIVETYP;
    private int wearValue;
    private int randomBound;
    private int wearValueToRepair;

    public Engine(int kW, DRIVE_TYP DRIVETYP) {
        this.setkW(kW);
        this.setDRIVETYP(DRIVETYP);
        this.wearValue = 0;
        this.randomBound = 2;
        this.wearValueToRepair = 10000;
    }

    public int randomDefekt() {
        Random random = new Random();
       return random.nextInt(randomBound);

    }

    public void setDRIVETYP(DRIVE_TYP DRIVETYP) {
        this.DRIVETYP = DRIVETYP;
    }

    public void setkW(int kW) {
        if (kW < 0) {
            throw new IllegalArgumentException("Provided value is invalid!");
        }
        this.kW = kW;
    }

    public int getWearValueToRepair() {
        return wearValueToRepair;
    }

    public void setWearValueToRepair(int wearValueToRepair) {
        this.wearValueToRepair = wearValueToRepair;
    }

    public int getkW() {
        return kW;
    }

    public DRIVE_TYP getDriveTyp() {
        return DRIVETYP;
    }

    public int getWearValue() {
        return wearValue;
    }

    public void setWearValue(int wearValue) {
        this.wearValue = wearValue;
    }

    public int getRandomBound() {
        return randomBound;
    }

    public void setRandomBound(int randomBound) {
        this.randomBound = randomBound;
    }
}
