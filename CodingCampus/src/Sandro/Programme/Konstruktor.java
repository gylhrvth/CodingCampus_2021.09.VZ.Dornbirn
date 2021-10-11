package Sandro.Programme;

public class Konstruktor {

    public static void main(String[] args) {

        Hund laprador = new Hund(4, "Laprador", "schwarz", true);
        Hund dackerl = new Hund(9, "Dackel", "braun", false);
        Hund mops = new Hund(3, "Mops", "weiß", true);
        Hund[] hunde = {laprador, dackerl, mops};

        for (int i = 0; i < hunde.length; i++) {
            System.out.println(hunde[i].art);
        }
        System.out.println();

        for (int i = 0; i < hunde.length; i++) {
            System.out.println(hunde[i].fellfarbe);
        }


        // Anzahl Hunde (Pfote geben)
        int counter = 0;
        for (int i = 0; i < hunde.length; i++) {
            if (hunde[i].kannPfotegeben) {
                counter++;
            }
        }
        System.out.println("\n" + "Wieviele Hunde können Pfote geben? : " + "\n" + counter);
    }
}