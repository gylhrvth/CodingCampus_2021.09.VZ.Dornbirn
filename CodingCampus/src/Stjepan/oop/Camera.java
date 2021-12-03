package Stjepan.oop;

public class Camera {
    private int brennweiteMinMax;
    private String model;
    private String hersteller;
    private int megapixel;


    public Camera(int brennweiteMinMax,String model,String hersteller,int megapixel){
        this.brennweiteMinMax = brennweiteMinMax;
        this.model = model;
        this.hersteller = hersteller;
        this.megapixel = megapixel;
    }
}
