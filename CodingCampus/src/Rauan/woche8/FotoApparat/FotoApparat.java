package Rauan.woche8.FotoApparat;

import Eray.week8.fotoapparat.FotoApparatStativUebung2;
import Eray.week8.fotoapparat.SpeicherKarteDatenUebung2;

public class FotoApparat {

    private String Model;
    private String Hersteller;
    private double Memorycard;
    private double MegaPixel;

    public FotoApparat( String model, String hersteller,  double megaPixel) {
        this.Model = model;
        this.Hersteller = hersteller;
        this.Memorycard = Memorycard;
        this.MegaPixel = megaPixel;
    }

    public String getModel() {
        return Model;
    }

    public String getHersteller() {
        return Hersteller;
    }

    public double getMegaPixel() {
        return MegaPixel;
    }
     static MemoryCardDetails memoryCardDetails =new MemoryCardDetails(400.00);
    @Override
    public String toString() {
        return String.format("Model %s Hersteller %s Memorycard %.2f MegaPixel %.2f", Model, Hersteller, Memorycard, MegaPixel);
    }
}
