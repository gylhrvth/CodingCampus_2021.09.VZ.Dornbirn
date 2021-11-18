package Bartosz.oop.exercise3;

public class Fotoapparat {
    private String model;
    private String brand;
    private int mp;

    public Fotoapparat(String model, String brand, int mp) {
        this.model = model;
        this.brand = brand;
        this.mp = mp;
    }


    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public int getMp() {
        return mp;
    }
    public void setMp(int mp) {
        this.mp = mp;
    }

    @Override
    public String toString() {
        return String.format("Hersteller: %s  Model: %s  Megapixel: %d ", brand, model, mp);
    }

}

