package Rauan.woche8.Car;

public class CarKlasse {
    private String Hersteller;
    private String Modell;
    private String Antriebsart;
    private double Tankinhalt;
    private int Gewicht;
    private int Kilowatt;

    public CarKlasse(String hersteller, String modell, String antriebsart, double tankinhalt, int gewicht, int kilowatt) {
        this.Hersteller = hersteller;
        this.Modell = modell;
        this.Antriebsart = antriebsart;
        this.Tankinhalt = tankinhalt;
        this.Gewicht = gewicht;
        this.Kilowatt = kilowatt;
    }

    public String getHersteller() {
        return Hersteller;
    }

    public String getModell() {
        return Modell;
    }

    public String getAntriebsart() {
        return Antriebsart;
    }

    public double getTankinhalt() {
        return Tankinhalt;
    }

    public int getGewicht() {
        return Gewicht;
    }

    public int getKilowatt() {
        return Kilowatt;
    }

    public void carKlasse(String Hersteller, String Modell, String Antriebsart, double Tankinhalt, int Gewicht, int Kilowatt) {

    }

    @Override
    public String toString() {
        return String.format("Alle Auto Daten" + "Hersteller = " + Hersteller + '\n'
                + "Modell = " + Modell + '\n' +
                "Antribsart= " + Antriebsart + '\n' +
                "Tankinhalt = " + Tankinhalt + "Liter\n" +
                "Gewicht = " + Gewicht + "KG\n" +
                "KilloWatt = " + Kilowatt + '\n');
    }
}
