package Stefan.thirdWeek.Strings;

import java.util.Scanner;

public class SchlaueMenge {
    public static void main(String[] args) {


        System.out.println("Wieviel Teilnehmer gibt es");
        Scanner teilnehmer = new Scanner(System.in);

        int teilnehmerCount = teilnehmer.nextInt();

        System.out.println("Es sind " + teilnehmerCount + " Teilnehmer");


        float[] mengenAngaben = new float[teilnehmerCount];
        for (int i = 0; i < mengenAngaben.length; i++) {
            System.out.println("Geben sie eine Zahl ein!");
            float zwischenMenge = teilnehmer.nextFloat();
            mengenAngaben[i] = zwischenMenge;
        }

        float gesamtSumme = 0;
        for (int i = 0; i < mengenAngaben.length; i++) {
            gesamtSumme = mengenAngaben[i] + gesamtSumme;

        }
        System.out.println("Der durchschnit beträgt: " + gesamtSumme / mengenAngaben.length);


    }
}
