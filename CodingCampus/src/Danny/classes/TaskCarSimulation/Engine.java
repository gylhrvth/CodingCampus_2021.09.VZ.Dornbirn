package Danny.classes.TaskCarSimulation;

import java.util.Random;

public class Engine {

    private int kW;
    private DRIVE_TYP DRIVETYP;
    private int wearValue;
    private int randomBound;
    private int wearValueToRepair;
    private final Random random = new Random();
    private boolean engineIsRunning = false;

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

    public void startEngine(Tank tank, int weight){
        engineIsRunning = true;
        tank.setTankCapacity(tank.getTankCapacity() - consumptionOf1Km(weight, getkW(), getDriveTyp()));
    }



    public void stopEngine(){
        engineIsRunning = false;
    }

    //Verbrauch pro Km in Liter
    public double consumptionOf1Km(int weight, int kW, DRIVE_TYP DRIVETYP) {
        if (DRIVETYP == DRIVE_TYP.gasoline) {
            double consumptionOf100Km = (weight + kW) / 182;
            double consumptionOf1Km = ((consumptionOf100Km / 100) * 100) / 100;
            return consumptionOf1Km;
        } else if (DRIVETYP == DRIVE_TYP.diesel) {
            double consumptionOf100Km = (weight + kW) / 290;
            double consumptionOf1Km = ((consumptionOf100Km / 100) * 100) / 100;
            return consumptionOf1Km;
        } else if (DRIVETYP == DRIVE_TYP.gas) {
            double consumptionOf100Km = (weight + kW) / 140;
            double consumptionOf1Km = ((consumptionOf100Km / 100) * 100) / 100;
            return consumptionOf1Km;
        } else if (DRIVETYP == DRIVE_TYP.electricity) {
            double consumptionOf100Km = (weight + kW) / 20;
            double consumptionOf1Km = ((consumptionOf100Km / 100) * 100) / 100;
            return consumptionOf1Km;
        }
        return 0;
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
