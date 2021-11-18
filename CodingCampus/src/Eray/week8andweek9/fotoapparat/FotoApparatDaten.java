package Eray.week8andweek9.fotoapparat;

public class FotoApparatDaten {

    private String model;
    private String hersteller;
    private double megaPixel;
    private double speicherKarte;

    public double getMegaPixel() {
        return megaPixel;
    }

    public String getHersteller() {
        return hersteller;
    }

    public String getModel() {
        return model;
    }

    public void setHersteller(String hersteller) {
        this.hersteller = hersteller;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setMegaPixel(double megaPixel) {
        this.megaPixel = megaPixel;
    }

    public FotoApparatDaten(String model, String hersteller, double megaPixel) {
        this.model = model;
        this.hersteller = hersteller;
        this.megaPixel = megaPixel;

    }

    static SpeicherKarteDatenUebung2 speicherKarteDaten = new SpeicherKarteDatenUebung2(500.00);
    static FotoApparatStativUebung2 fotoApparatStativ = new FotoApparatStativUebung2("15-45", "Nikon");

    @Override
    public String toString() {
        return "Das Foto wurde mit der Kamera " + model + " vom Hersteller " + hersteller + " mit " + megaPixel + " MegaPixel gemacht \n" +
                "die aktueller SpeicherKarte beträgt " + speicherKarteDaten.getSpeicherKarte() + " MB \n" +
                "und ein Kamera Stativ von der Marke" + fotoApparatStativ.getStativName() + " mit einer Brennweite von " + fotoApparatStativ.getStativBrennWeite() + " mm";
    }
}
