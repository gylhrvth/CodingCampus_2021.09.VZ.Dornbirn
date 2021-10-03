package Stjepan;

import java.util.Scanner;

public class starray2 {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        schlaueMenge();
    }

    public static void schlaueMenge() {
        System.out.println("Wie viele Teilnehmer sind dabei?");
        int teilnehmer = scanner.nextInt();



        int[] teilnehmerAnzahl = new int[teilnehmer];

        double summe=0;

        for (int i = 0; i < teilnehmerAnzahl.length; i++) {

            System.out.println("Bitte geben sie eine Schätzung ein: ");
            double schätzung = scanner.nextDouble();

            summe += schätzung;


        }

        double mittelWert = summe / teilnehmerAnzahl.length;

        System.out.println("Der Mittelwert von "+ teilnehmerAnzahl.length + " teilnemer beträgt " + mittelWert);
    }



}
