package Gerhard.week9;


import com.github.sarxos.webcam.Webcam;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Camera {


    private String herSteller;
    private String modell;
    private double megapixel;
    private int minBrennweite;
    private int maxBrennweite;


    public Camera(String herSteller, String modell, double megapixel, int minBrennweite, int maxBrennweite) {
        this.herSteller = herSteller;
        this.modell = modell;
        this.megapixel = megapixel;
        this.minBrennweite = minBrennweite;
        this.maxBrennweite = maxBrennweite;
    }




    // GETTER
    public String getHerSteller() {
        return herSteller;
    }

    public String getModell() {
        return modell;
    }

    public double getMegapixel() {
        return megapixel;
    }

    public int getMinBrennweite() {
        return minBrennweite;
    }

    public int getMaxBrennweite() {
        return maxBrennweite;
    }




    //SETTER

    public void setHerSteller(String herSteller) {
        this.herSteller = herSteller;
    }

    public void setModell(String modell) {
        this.modell = modell;
    }

    public void setMegapixel(double megapixel) {
        this.megapixel = megapixel;
    }

    public void setMinBrennweite(int minBrennweite) {
        this.minBrennweite = minBrennweite;
    }

    public void setMaxBrennweite(int maxBrennweite) {
        this.maxBrennweite = maxBrennweite;
    }



    public static void takePhoto(){

    }
}
