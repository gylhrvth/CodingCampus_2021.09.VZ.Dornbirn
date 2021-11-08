package Mahir.objektorientierung.dataclass;

import java.util.Random;

public class Exercise {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numArray = new int[10];
        for (int i = 0; i < numArray.length; i++) {
            numArray[i] = random.nextInt(100) - 50;

        }
        Dataclass minMaxAvrg = minMaxAvrg(numArray);
        System.out.println(minMaxAvrg);
    }

    private static Dataclass minMaxAvrg(int[] numbers) {
        int min = numbers[0];
        int max = numbers[0];
        double summ = numbers[0];

        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] < numbers[i + 1]) {
                min = numbers[i];
            }
            if (numbers[i] > numbers[i + 1]) {
                max = numbers[i];
            }
            summ += numbers[i];
        }
        double avg = numbers.length / summ;

        return new Dataclass(min, max, avg);

    }
}
