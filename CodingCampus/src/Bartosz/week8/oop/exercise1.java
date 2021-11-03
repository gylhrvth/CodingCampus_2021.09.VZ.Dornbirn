package Bartosz.week8.oop;

import java.util.Arrays;
import java.util.Random;

public class exercise1 {
    public static void main(String[] args) {
        int[] numbersArray = getArray();
        System.out.println(Arrays.toString(numbersArray));

        MinMaxAverage minMaxAverage = getMinMaxAvg(numbersArray);
        System.out.println(minMaxAverage);
    }

    //
    private static MinMaxAverage getMinMaxAvg(int[] arrayToCheck) {
        int min = arrayToCheck[0];
        int max = arrayToCheck[0];
        double sum = 0;
        for (int number : arrayToCheck) {
             if(min > number){
                 min = number;
             }
            if(max < number){
                max = number;
            }
            sum += number;
        }
        double avg = sum / arrayToCheck.length;

        return new MinMaxAverage(min, max, avg);
    }

    // Array
    private static int[] getArray() {
        Random random = new Random();
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(101) - 50;
        }
        return numbers;
    }
}
