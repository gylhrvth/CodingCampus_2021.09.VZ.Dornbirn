package Plamena.week8.Camera;

public class CamLens {
    private int focalLengthMin;
    private int focalLengthMax;
    private double luminosity;

    public CamLens(int focalLengthMin, int focalLengthMax, double luminosity) {
        this.focalLengthMin = focalLengthMin;
        this.focalLengthMax = focalLengthMax;
        this.luminosity = luminosity;
    }

    public void setFocalLengthMin(int focalLengthMin) {
        this.focalLengthMin = focalLengthMin;
    }
}

