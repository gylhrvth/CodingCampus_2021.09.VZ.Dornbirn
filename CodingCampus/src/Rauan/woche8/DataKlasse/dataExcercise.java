package Rauan.woche8.DataKlasse;

import Lukas.week8.day3.excerciseDataclass.MinMaxAverage;

import java.util.Random;

public class dataExcercise {
    public static void main(String[] args) {

        Random random = new Random();
        int[] numbersArray = new int[10];
        for (int i = 0; i < numbersArray.length; i++) {
            numbersArray[i] = random.nextInt(101) - 50;
        }
        //System.out.println(Arrays.toString(numbersArray));

        MinMaxAverage minMaxAverage = getMinMaxAverage(numbersArray);
        System.out.println(minMaxAverage);
    }

    private static MinMaxAverage getMinMaxAverage(int[] numbers) {
        int minValue = numbers[0];
        int maxValue = numbers[0];
        double sum = 0;
        for(int number : numbers) {
            if(number < minValue) {
                minValue = number;
            }
            if(number > maxValue) {
                maxValue = number;
            }
            sum += number;
        }
        double average = sum / numbers.length;

        return new MinMaxAverage(minValue, maxValue, average);
    }
}
