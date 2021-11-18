package Lena.FirstObjects.CarSimulation;

public class Tank {

    static final int MAX_TANKLEVEL = 70;
    private double tanklevel;


    public Tank(double tanklevel){
        setTanklevel(tanklevel);
    }

    public int getMaxTanklevel() {
        return MAX_TANKLEVEL;
    }

    public double getTanklevel() {
        return tanklevel;
    }

    public void setTanklevel(double tanklevel) {
        this.tanklevel = tanklevel;
    }
}
