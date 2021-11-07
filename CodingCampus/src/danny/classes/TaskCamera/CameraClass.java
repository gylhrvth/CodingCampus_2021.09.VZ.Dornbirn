package danny.classes.TaskCamera;

public class CameraClass extends java.lang.Object {

    private int focalLengthMin;
    private int focalLengtMax;
    private String model;
    private String manufacturer;
    private double megapixel;

    public CameraClass(int focalLengthMin, int focalLengtMax,
                       String model, String manufacturer, double megapixel) {
        this.focalLengthMin = focalLengthMin;
        this.focalLengtMax = focalLengtMax;
        this.model = model;
        this.manufacturer = manufacturer;
        this.megapixel = megapixel;
    }

    public int getFocalLengthMin() {
        return focalLengthMin;
    }

    public void setFocalLengthMin(int focalLengthMin) {
        this.focalLengthMin = focalLengthMin;
    }

    public int getFocalLengtMax() {
        return focalLengtMax;
    }

    public void setFocalLengtMax(int focalLengtMax) {
        this.focalLengtMax = focalLengtMax;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getMegapixel() {
        return megapixel;
    }

    public void setMegapixel(double megapixel) {
        this.megapixel = megapixel;
    }

    @Override
    public String toString() {
        String tmp = "";
        tmp += "\n";
        tmp += String.format("%s %s", manufacturer, model);
        tmp += "\n";
        tmp += String.format("Focallength: %d - %d mm", focalLengthMin, focalLengtMax);
        tmp += "\n";
        tmp += String.format("Megapixel: %.1f",megapixel);
        tmp += "\n";
        return tmp;
    }

    public static void takePhoto () {
        System.out.println("xxxxxxxxxxxx" );
        System.out.println("x          x" );
        System.out.println("x   VO/    x" );
        System.out.println("x    |     x" );
        System.out.println("x   / V    x" );
        System.out.println("x          x" );
        System.out.println("xxxxxxxxxxxx" );
    }
}
