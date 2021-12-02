package Mahir.objektorientierung.camera;

public class CameraLens {
    public String name;
    public int focalLenght;

    public CameraLens(String name, int focalLenght) {
        this.name = name;
        this.focalLenght = focalLenght;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFocalLenght() {
        return focalLenght;
    }

    public void setFocalLenght(int focalLenght) {
        this.focalLenght = focalLenght;
    }

    @Override
    public String toString() {
        return String.format("Name: %s Focal Length: %d",name, focalLenght);
    }
}
