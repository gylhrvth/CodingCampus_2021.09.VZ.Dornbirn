package Sandro.oopAufgaben;

import java.util.Arrays;
import java.util.Random;

public class Datenklasse {

    public static void main(String[] args) {

        int[] arrayRandom = new int[10];

        createRandomArray(arrayRandom);
        System.out.println(Arrays.toString(arrayRandom));
        MinMaxAverage minMaxAverage = getMinMaxAverage(arrayRandom);
        System.out.println(minMaxAverage);
    }

    public static MinMaxAverage getMinMaxAverage(int[] array) {
        int length = array.length;
        int min = array[0];
        int max = array[0];
        double sum = 0;

        for (int i = 0; i < array.length; i++) {

            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            } else
                sum += array[i];
        }
        double average = sum / length;

        return new MinMaxAverage(min, max, average);
    }

    public static int[] createRandomArray(int[] array) {

        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(101) - 50;
        }
        return array;
    }
}
