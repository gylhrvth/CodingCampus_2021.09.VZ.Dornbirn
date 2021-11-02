package Eray.week6FerienUebungen.tuermeVonHanoi;

public class TuermeVonHanoi {


    private static int counter;

    static void verschiebeScheiben(int zahlDerScheiben, int quellPlatz, int zwischenPlatz, int zielPlatz) {
        if (zahlDerScheiben > 0) {
            verschiebeScheiben(zahlDerScheiben - 1, quellPlatz, zwischenPlatz, zielPlatz);
            System.out.println("Die scheibe " + zahlDerScheiben + " wurde vom " + quellPlatz + " zum " + zwischenPlatz + " zwischenplatz und dann zum " + zielPlatz + " bewegt");
            verschiebeScheiben(zwischenPlatz-1, zwischenPlatz,zielPlatz,quellPlatz);
            counter++;
        }

    }


    public static void main(String[] args) {
        int zahlDerScheiben = 2;

        verschiebeScheiben(zahlDerScheiben, 1, 2, 3);

        System.out.println("Es werden " + counter + " Verlegevorgänge benötigt ");
    }

}
