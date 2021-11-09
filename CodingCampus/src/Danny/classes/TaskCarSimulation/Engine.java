package Danny.classes.TaskCarSimulation;

import java.util.Random;

public class Engine {
    private int kW;
    private DRIVE_TYP DRIVETYP;


    public void randomDefekt() {
        Random random = new Random();

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
