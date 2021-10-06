package Eray.week4;

import java.util.Random;

public class Elevator {
    public static Random random = new Random();

    public static void main(String[] args) {
        int[] personsKg = new int[30];
        for (int i = 0; i < personsKg.length; i++) {
            personsKg[i] = random.nextInt(10);
        }

        elevatorMaxWeight(personsKg);
    }

    public static void elevatorMaxWeight(int[] personsKg) {
        int maxWeight = 1600;

        int sum = 0;
        while (sum <= maxWeight) {
            for (int i = 0; i < personsKg.length; i++) {
                sum += personsKg[i];


            }
            System.out.println("Das aktuelle Gewicht beträgt : " + sum);
        }

        System.out.println("Das MaximalGewicht wurde überschritten");
    }
}
