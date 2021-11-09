package Stefan.WeekNine.CameraObjektivSpeicher;

public class Objektiv {
    private int focalLength;
    private double lightIntensity;
    private double blende;

    public Objektiv(int focalLength, double lightIntensity, double blende) {
        this.focalLength = focalLength;
        this.lightIntensity = lightIntensity;
        this.blende = blende;
    }

    public int getFocalLength() {
        return focalLength;
    }

    public void setFocalLength(int focalLength) {
        this.focalLength = focalLength;
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
        return String.format("Brennweite:%5s Lichtstärke:%4s Blende:%9s ", getFocalLength(), getLightIntensity(), getBlende());
    }
}
