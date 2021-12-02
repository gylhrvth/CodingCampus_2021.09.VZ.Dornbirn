package Sandro.oopAufgaben.camera;

public class MemoryCard {

    String manufacturer;
    double memorySize;

    public MemoryCard(String manufacturer, double memorySize) {
        this.manufacturer = manufacturer;
        this.memorySize = memorySize;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getMemorySize() {
        return memorySize;
    }

    public void setMemorySize(double memorySize) {
        this.memorySize = memorySize;
    }

    @Override
    public String toString() {
        return "MemoryCard{" +
                "manufacturer='" + manufacturer + '\'' +
                ", memorySize=" + memorySize +
                '}';
    }
}
