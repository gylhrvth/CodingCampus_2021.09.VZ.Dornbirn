package Eray.week8andweek9.datenKlasse;

import java.util.Random;

public class MainForDatenKlasse {

    public static void main(String[] args) {
        printAll();
    }

    public static void printAll(){

        Random random = new Random();
        int[] randomNumbers = new int[10];

        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = random.nextInt(100);
        }

        System.out.println(getAllValues(randomNumbers));

    }


    public static DatenKlasse getAllValues(int[] numbers) {
        int maxValue = numbers[0];
        int lowestValue = numbers[0];
        double sum = 0;
        for (int number : numbers) {

            if (number > maxValue) {
                maxValue = number;
            }

            if (number < lowestValue) {
                lowestValue = number;
            }

            sum += number;

        }
        double average = sum / numbers.length;


        return new DatenKlasse(lowestValue,maxValue,average);
    }
}
