package Lena.FirstObjects.Camera;

import java.util.Scanner;

public class Camera {

    private String model;
    private String manufacturer;
    private double megapixel;
    private CamObject camObject;
    private Memory memory;
    private static final double MB_PER_MEGAPIXEL = 0.3;


    public Camera(String model, String manufacturer, double megapixel, CamObject camObject, Memory memory) {
        setModel(model);
        setManufacturer(manufacturer);
        setMegapixel(megapixel);
        setCamObject(camObject);
        setMemory(memory);

    }



    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model == null) {
            throw new IllegalArgumentException("Model can not be null");
        }
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        if (manufacturer == null) {
            throw new IllegalArgumentException("Manufacturer can not be null");
        }
        this.manufacturer = manufacturer;
    }

    public double getMegapixel() {
        return megapixel;
    }

    public void setMegapixel(double megapixel) {

        if (megapixel <= 0) {
            throw new IllegalArgumentException("Megapixel can't be zero or bellow");
        }
        this.megapixel = megapixel;
    }

    public CamObject getCamObject() {
        return camObject;
    }

    private void setCamObject(CamObject camObject) {
        this.camObject = camObject;
    }

    public Memory getMemory() {
        return memory;
    }

    private void setMemory(Memory memory) {
        this.memory = memory;
    }

    public void takePicture() {
        if (this.camObject == null) {
            throw new IllegalArgumentException("Camera has no Object");
        }
        if (this.memory == null) {
            throw new IllegalArgumentException("Camera has no Memory");
        }

        Picture picture = null;
        try {
            picture = new Picture(calculateSizeOfPicture());
        } catch (IllegalArgumentException illegalArgumentException) {
            illegalArgumentException.fillInStackTrace();
        }


        try {
            if (picture != null) {
                writeOnMemory(picture);
                System.out.println("--NEW PICTURE FROM " + picture.getMotive().toString() + "--");
            }

        } catch (IllegalArgumentException illegalArgumentException) {
            System.out.println("Picture not saved on Memory");
            illegalArgumentException.fillInStackTrace();
        }


    }

    public double getFreeSpace() {
        return this.memory.getFreeSpaceOnMemory();
    }

    public int numberOfTakenPhotos() {
        return this.memory.amountOfPictures();
    }

    private double calculateSizeOfPicture() {
        return megapixel * MB_PER_MEGAPIXEL;
    }

    private void writeOnMemory(Picture picture) {
        try {
            this.memory.savePicture(picture);
        } catch (IllegalArgumentException illegalArgumentException) {
            System.out.println("Das Bild konnte nicht gespeichert werden");
            illegalArgumentException.fillInStackTrace();
        }
    }

    public void changeCamObject(CamObject camObject) {
        setCamObject(camObject);
        System.out.println("Object chanced");
    }

    public void changeMemory(Memory memory) {
        setMemory(memory);
        System.out.println("Memory changed");
    }

    public void viewGallery() {
        String tab = "    ";
        System.out.println("GALLERY OF PICTURES:");
        if (memory.usedSpaceOnMemory() > 0) {
            for (Picture picture : this.memory.getPictureList()) {
                System.out.println(tab + picture);
            }
        } else {
            System.out.println("### NO PICTURES IN GALLERY ###");
        }
    }

    @Override
    public String toString() {
        String tab = "    ";
        return "CAMERA" + "\n" +
                tab + "Model: " + this.model + "\n" +
                tab + "Manufacturer: " + this.manufacturer + "\n" +
                tab + "Free Space on Memory: " + getFreeSpace() + "MB" + "\n" +
                tab + "Taken Photos: " + numberOfTakenPhotos();

    }
}
