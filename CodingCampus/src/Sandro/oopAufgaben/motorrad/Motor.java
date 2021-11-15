package Sandro.oopAufgaben.motorrad;

public class Motor {

    //Attribute bzw. Objekteigenschaften
    private int leistung;
    private double hubraum;

    //Konstruktor
    public Motor(int leistung, double hubraum) {
        this.leistung = leistung;
        this.hubraum = hubraum;
    }

    //Getter
    public int getLeistung() {
        return leistung;
    }

    public double getHubraum() {
        return hubraum;
    }

    // Ausgabe
    public void schreibeInfoMotor() {
        System.out.println("Leistung: " + leistung);
        System.out.println("Hubraum:  " + hubraum);
    }

    //Umwandlung to String
    @Override
    public String toString() {
        return "Motor mit " + leistung + " PS und " + hubraum + " Liter Hubraum";
    }
}
