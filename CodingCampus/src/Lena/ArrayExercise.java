package Lena;

import java.util.Arrays;

public class ArrayExercise {

    public static void main(String[] args) {
        System.out.println("Start");


        System.out.println(primZahlCheck(43112609));
        System.out.println(primZahlCheck2(43112609));


        int[] numbers = {4, 5, 7, 9, 3, 5, 10, 1, 12, 13, 13};
        System.out.println(getMax(numbers));
        // System.out.println(getSecondMax(numbers));
        System.out.println(getMin(numbers));
        System.out.println(getSecondMin(numbers));
        getPrimzahlen(numbers);
        System.out.println(getAnyMax(numbers, 4));


    }

    public static int getMax(int[] numbers) {
        int max = numbers[0];
        int index = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
                index = i;
            }

        }
        //  System.out.println("Index: "+index);
        return max;
    }

    public static int getAnyMax(int[] numbers, int anyMaxIndex) {
        int[] helpArray = new int[anyMaxIndex];



            for (int i = 0; i < numbers.length; i++) {
                for (int j = 0; j < helpArray.length; j++) {
                if (numbers[i] > helpArray[j]) {
                    System.out.println(numbers[i]);
                    helpArray[j] = numbers[i];
                    break;
                }
            }
        }
        int anymax = helpArray[0];
        for (int i = 0; i < helpArray.length; i++) {
            if (helpArray[i] < anymax) {
                anymax = helpArray[i];
            }
        }
        number(1);
        return anymax;
    }

    /**
     * This method multiplies the given number by 2
     * <li>
     *     <ul>Hallo</ul>
     *     <ul>asdf</ul>
     * </li>
     *
     * @param number Number which should be multiplied
     * @return Number multiplied by two
     */
    public static int number(int number) {
        return number * 2;
    }

    public static int getMin(int[] numbers) {
        int min = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }

        }
        return min;
    }

    public static int getSecondMin(int[] numbers) {
        int min = getMin(numbers);
        int secondMin = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < secondMin && numbers[i] > min) {
                secondMin = numbers[i];
            }

        }
        return secondMin;
    }

    public static boolean primZahlCheck(int number) {
        if (number == 1) {
            return false;
        }
        int sqrtNum = (int) Math.sqrt(number);
        for (int i = 2; i <= sqrtNum; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean primZahlCheck2(int number) {
        if (number == 1) {
            return false;
        }
        for (int i = 2; i <= number - 1; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }


    public static void getPrimzahlen(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (primZahlCheck(numbers[i])) {
                System.out.println("Das ist eine Primzahl: " + numbers[i]);
            }
        }
    }
}
