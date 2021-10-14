package Ingo.week3;


import java.util.Scanner;

public class ArrayAverageCalculator {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        averageCalculator();
    }

    public static void averageCalculator() {
        System.out.println("Bitte gebe ein wieviele Leute an der Umfrage teilnehmen sollen?");
        int members = scanner.nextInt();

        float [] subscriber = new float[members];

        float sum = 0;
        for (int i = 0; i < subscriber.length; i++) {

            System.out.println("Bitte gebe deine Schätzung ein: ");
            float estimate = scanner.nextFloat();

            subscriber[i] = estimate;

            sum+=subscriber[i];
        }

        float solution = sum / subscriber.length;

        System.out.println("Der Durchschnittliche Wert von " + subscriber.length + " beträgt " +  solution);
    }

}
