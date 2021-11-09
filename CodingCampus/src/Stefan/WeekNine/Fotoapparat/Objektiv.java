package Stefan.WeekNine.Fotoapparat;

public class Objektiv {
    private int focalLength;
    private String lightIntensity;
    private String blende;

    public Objektiv(int focalLength, String lightIntensity, String blende) {
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

    public String getLightIntensity() {
        return lightIntensity;
    }

    public void setLightIntensity(String lightIntensity) {
        this.lightIntensity = lightIntensity;
    }

    public String getBlende() {
        return blende;
    }

    public void setBlende(String blende) {
        this.blende = blende;
    }
}
