package Bartosz.week8.oop.exercise3;

public class Photo {
    private double photoSize;
    private String img;

    public Photo(double size, String img) {

        this.photoSize = size;
        this.img = img;
    }

    public double getPhotoSize() {
        return photoSize;
    }
    public void setPhotoSize(double photoSize) {
        this.photoSize = photoSize;
    }

    public String getImg() {
        return img;
    }
    public void setImg(String img) {
        this.img = img;
    }
}
