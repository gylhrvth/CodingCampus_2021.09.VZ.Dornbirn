package Danny.classes.TaskCarSimulation;

import java.util.Random;

public class Engine {

    private int kW;
    private DRIVE_TYP DRIVETYP;

    public Engine(int kW, DRIVE_TYP DRIVETYP) {
        this.setkW(kW);
        this.setDRIVETYP(DRIVETYP);
    }

    public void randomDefekt() {
        Random random = new Random();
        random.nextInt(10);
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

    public int getkW() {
        return kW;
    }

    public DRIVE_TYP getDriveTyp() {
        return DRIVETYP;
    }

}
