package Lena.FirstObjects.Camera;

public class CamObject {

    private double minFocalDistance;
    private double maxFocalDistance;

    public CamObject(double minFocalDistance, double maxFocalDistance){
        setMinFocalDistance(minFocalDistance);
        setMaxFocalDistance(maxFocalDistance);
    }

    public double getMinFocalDistance() {
        return minFocalDistance;
    }

    public void setMinFocalDistance(double minFocalDistance) {
        if(minFocalDistance<=0){
            throw new IllegalArgumentException("Min focal Distance can not be zero or bellow");
        }

        this.minFocalDistance = minFocalDistance;
    }

    public double getMaxFocalDistance() {
        return maxFocalDistance;
    }

    public void setMaxFocalDistance(double maxFocalDistance) {

        if(minFocalDistance>=maxFocalDistance){
            throw new IllegalArgumentException("The max focal Distance can not be lower or the same as min focal Distance");
        }else if(maxFocalDistance<=0){
            throw new IllegalArgumentException("Max focal Distance can not be zero or bellow");
        }
        this.maxFocalDistance = maxFocalDistance;
    }
}
