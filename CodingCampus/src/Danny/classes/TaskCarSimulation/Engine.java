package Danny.classes.TaskCarSimulation;

import java.util.Random;

public class Engine {

    private int kW;
    private DRIVE_TYP DRIVETYP;
    private int wearValue;
    private int randomBound;
    private int wearValueToRepair;
    private final Random random = new Random();

    public Engine(int kW, DRIVE_TYP DRIVETYP) {
        this.setkW(kW);
        this.setDRIVETYP(DRIVETYP);
        this.wearValue = 0;
        this.randomBound = 2;
        this.wearValueToRepair = 10000;
    }

    public void calculateWearValue(int kmDrive) {
        setWearValue(getWearValue() + randomDefekt());
        if (kmDrive % 20 == 0) {
            setRandomBound(getRandomBound() + 1);
        }
    }

    public boolean isBroken() {
        return getWearValue() >= getWearValueToRepair();
    }

    public int randomDefekt() {
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
