package Sandro.oopAufgaben.motorrad;

public class Reifen {

    //Attribute bzw. Objekteigenschaften
    private double durchmesser;
    private double profiltiefe;
    private String jahreszeit;

    //Konstruktor
    public Reifen(double durchmesser, double profiltiefe, String jahreszeit) {
        this.durchmesser = durchmesser;
        this.profiltiefe = profiltiefe;
        this.jahreszeit = jahreszeit;
    }

    //Getter
    public double getDurchmesser() {
        return durchmesser;
    }

    public double getProfiltiefe() {
        return profiltiefe;
    }

    public String getJahreszeit() {
        return jahreszeit;
    }

    // Ausgabe
    public void schreibeInfoReifen() {
        System.out.println("Durchmesser: " + durchmesser);
        System.out.println("Profiltiefe: " + profiltiefe);
        System.out.println("Jahreszeit:  " + jahreszeit);
    }

    //Umwandlung to String
    @Override
    public String toString() {
        return jahreszeit + "reifen mit " + durchmesser + " cm Durchmesser und "
                + profiltiefe + " Profiltiefe";
    }
}
