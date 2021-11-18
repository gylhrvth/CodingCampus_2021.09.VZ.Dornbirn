package Sandro.oopAufgaben.motorrad;

public class Motorrad {

    //Attribute bzw. Objekteigenschaften
    private Motor meinMotor;
    private Reifen[] meineReifen;

    //Konstruktor
    public Motorrad(Motor motor, Reifen vorne, Reifen hinten) {
        this.meinMotor = motor;
        meineReifen = new Reifen[2];
        this.meineReifen[0] = vorne;
        this.meineReifen[1] = hinten;
    }


    //Getter
    public Reifen getHinterreifen() {
        return meineReifen[0];
    }

    public Reifen getVorderreifen() {
        return meineReifen[1];
    }


    // Ausgabe
    public void schreibeInfo() {
        System.out.println("Motor:");
        meinMotor.schreibeInfoMotor();
        System.out.println("Reifen:");
        for (int i = 0; i < meineReifen.length; i++) {
            meineReifen[i].schreibeInfoReifen();
        }
    }

    // Umwandlung in String:
    public String toString() {
        return "Motorrad mit einem " + meinMotor + " und vorne einem " + getHinterreifen() + " und hinten einem " + getVorderreifen();
    }

}
