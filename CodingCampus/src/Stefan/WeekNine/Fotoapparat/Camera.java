package Stefan.WeekNine.Fotoapparat;

public class Camera {
    public String modell;
    public double mp;
    public double focalDistanceMin;
    public double focalDistanceMax;

    public Camera(String modell,  double mp, double focalDistanceMin, double focalDistanceMax) {
        this.modell = modell;
        this.mp = mp;
        this.focalDistanceMin = focalDistanceMin;
        this.focalDistanceMax = focalDistanceMax;
    }

    public String getModell() {
        return modell;
    }

    public void setModell(String modell) {
        this.modell = modell;
    }

    public double getMp() {
        return mp;
    }

    public void setMp(double mp) {
        this.mp = mp;
    }

    public double getFocalDistanceMin() {
        return focalDistanceMin;
    }

    public void setFocalDistanceMin(double focalDistanceMin) {
        this.focalDistanceMin = focalDistanceMin;
    }

    public double getFocalDistanceMax() {
        return focalDistanceMax;
    }

    public void setFocalDistanceMax(double focalDistanceMax) {
        this.focalDistanceMax = focalDistanceMax;
    }

//    @Override
//    public String toString() {
//        return String.format("Model:%2s\nMegapixel:%s2\nBrennweite min:%2s\nBrennweite max:%2s\n", getModell(), getMp(), getFocalDistanceMin(), getFocalDistanceMax());
//    }
}
