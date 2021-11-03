package Ingo.week7.day2;

import java.util.Arrays;
import java.util.Random;

public class ExcerciseDataClass {

    public static void main(String[] args) {

        Random random = new Random();
        int[] randomArray = new int[24];
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = random.nextInt(100)-50;

        }System.out.println(Arrays.toString(randomArray));

        MinMaxAverage minMaxAverage = getMinMaxAverage(randomArray);
        System.out.println(minMaxAverage);
    }

    private static MinMaxAverage getMinMaxAverage(int[] numbers) {
        int minValue = numbers[0];
        int maxValue = numbers[0];
        double averageValue = 0;
        for(int number : numbers) {
            if(number < minValue) {
                minValue = number;
            }
            if(number > maxValue) {
                maxValue = number;
            }
            averageValue += number;
        }
        double average = averageValue / numbers.length;
        return new MinMaxAverage(minValue, maxValue, average);

    }

}
