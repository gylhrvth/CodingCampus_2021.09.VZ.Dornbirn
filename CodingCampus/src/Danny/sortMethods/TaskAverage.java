package Danny.sortMethods;

import java.util.Scanner;

public class TaskAverage {
    public static void main(String[] args) {

        //3)
//Schlaue Menge
//Lies dir folgendes durch:
//https://www.brandeins.de/magazine/brand-eins-wirtschaftsmagazin/2005/die-mitte/schlaue-menge
//Entwickle ein Program welches zuerst fragt, wieviele Teilnehmer beim Expirement mitmachen
//erstelle ein Array in der größe der Teilnehmer, der Typ des Arrays soll Float sein.

//Frage jeden Teilnehmer nach seiner Schätzung.
//Am Ende berechne den Durchschnitt (arithmetisches Mittel) aller Werte und gib diesen aus.

        System.out.println("Wieviele Personen nehmen teil?");
        Scanner members = new Scanner(System.in);
        Scanner estimate = new Scanner(System.in);


        float[] memb = new float[members.nextInt()];
        float[] esti = new float[memb.length];
        float sum = 0;

        for (int i = 0; i < memb.length; i++) {
            System.out.println("Person " + (i + 1) + " wie lautet Ihre Schätzung?");
            esti[i] = estimate.nextFloat();
        }
        for (int x = 0; x < esti.length; x++) {
            sum += esti[x];
        }
        System.out.println("Der Durchschnitt beträgt");
        System.out.println(sum / esti.length);
    }
}
