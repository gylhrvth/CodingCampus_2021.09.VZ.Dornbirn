package Stefan.Week9.CameraObjektivSpeicher;

public class Objektiv {
    private int focalLengthMin;
    private int focalLengthMax;
    private double lightIntensity;
    private double blende;

    public Objektiv(int focalLength, int focalLengthMax, double lightIntensity, double blende) {
        this.focalLengthMin = focalLength;
        this.focalLengthMax = focalLengthMax;
        this.lightIntensity = lightIntensity;
        this.blende = blende;
    }

    public int getFocalLengthMin() {
        return focalLengthMin;
    }

    public void setFocalLengthMin(int focalLengthMin) {
        this.focalLengthMin = focalLengthMin;
    }

    public int getFocalLengthMax() {
        return focalLengthMax;
    }

    public void setFocalLengthMax(int focalLengthMax) {
        this.focalLengthMax = focalLengthMax;
    }

    public double getLightIntensity() {
        return lightIntensity;
    }

    public void setLightIntensity(double lightIntensity) {
        this.lightIntensity = lightIntensity;
    }

    public double getBlende() {
        return blende;
    }

    public void setBlende(double blende) {
        this.blende = blende;
    }

    @Override
    public String toString() {
        return String.format("Brennweite %3s-->>%3s, Lichtstärke %3s, Blende %3s ", getFocalLengthMin(), getFocalLengthMax(), getLightIntensity(), getBlende());
    }
}
