package Ingo.week9.Camera;

public class Camera {
    private String hersteller;
    private String model;
    private int megapixel;
    private int objektiv;
    private double speicherplatz;

    Camera(String hersteller,String model,int megapixel,int objektiv,double speicherplatz){
        this.hersteller = hersteller;
        this.model = model;
        this.megapixel = megapixel;
        this.objektiv = objektiv;
        this.speicherplatz = speicherplatz;

    }

    public String getHersteller() {
        return hersteller;
    }

    public void setHersteller(String hersteller) {
        this.hersteller = hersteller;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMegapixel() {
        return megapixel;
    }

    public void setMegapixel(int megapixel) {
        this.megapixel = megapixel;
    }

    public int getObjektiv() {
        return objektiv;
    }

    public void setObjektiv(int objektiv) {
        this.objektiv = objektiv;
    }

    public double getSpeicherplatz() {
        return speicherplatz;
    }

    public void setSpeicherplatz(double speicherplatz) {
        this.speicherplatz = speicherplatz;
    }

    void makeFoto() {

    }
}
