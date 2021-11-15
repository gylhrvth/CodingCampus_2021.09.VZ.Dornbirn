package Sandro.oopAufgaben.camera;

public class Fotoapparat {

    private int brennweiteMin;
    private int getBrennweiteMax;
    private String model;
    private String hersteller;
    private double mp;

    public Fotoapparat(int brennweiteMin, int getBrennweiteMax, String model, String hersteller, double mp) {

        this.brennweiteMin = brennweiteMin;
        this.getBrennweiteMax = getBrennweiteMax;
        this.model = model;
        this.hersteller = hersteller;
        this.mp = mp;
    }

    public int getBrennweiteMin() {
        return brennweiteMin;
    }

    public void setBrennweiteMin(int brennweiteMin) {
        this.brennweiteMin = brennweiteMin;
    }

    public int getGetBrennweiteMax() {
        return getBrennweiteMax;
    }

    public void setGetBrennweiteMax(int getBrennweiteMax) {
        this.getBrennweiteMax = getBrennweiteMax;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getHersteller() {
        return hersteller;
    }

    public void setHersteller(String hersteller) {
        this.hersteller = hersteller;
    }

    public double getMp() {
        return mp;
    }

    public void setMp(double mp) {
        this.mp = mp;
    }

    @Override
    public String toString() {
        return "fotoapparat{" +
                "brennweiteMin=" + brennweiteMin +
                ", getBrennweiteMax=" + getBrennweiteMax +
                ", model='" + model + '\'' +
                ", hersteller='" + hersteller + '\'' +
                ", mp=" + mp +
                '}';
    }

}




