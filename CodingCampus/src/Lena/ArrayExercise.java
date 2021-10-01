package Lena;

import java.util.Arrays;

public class ArrayExercise {

    public static void main(String[] args) {



        /*System.out.println(primZahlCheck(43112609));
        System.out.println(primZahlCheck2(43112609));*/
        /*System.out.println(getMax(numbers));
        // System.out.println(getSecondMax(numbers));
        System.out.println(getMin(numbers));
        System.out.println(getSecondMin(numbers));
        getPrimzahlen(numbers);*/

        int[] numbers = {4, -5, -7, -9, 3, 5, -4, 4, -4, 10, -13};


        int anyMaxIndex =5;

        System.out.println("Die " +anyMaxIndex+". größte Zahl im Array ist: "+getAnyMax(numbers, anyMaxIndex));


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

    /**
     *
     * @param numbers
     * @param anyMaxIndex
     * @return
     */
    public static int getAnyMax(int[] numbers, int anyMaxIndex) {
        int[] helpArray = new int[anyMaxIndex];
        for (int i = 0; i < helpArray.length; i++) {
            helpArray[i] = Integer.MIN_VALUE;
        }
        for (int number : numbers) {
            if (number > helpArray[0]) {
                helpArray[0] = number;
                for (int j = 1; j < helpArray.length; j++) {
                    if (helpArray[j - 1] > helpArray[j]) {
                        int helpVar = helpArray[j];
                        helpArray[j] = helpArray[j - 1];
                        helpArray[j - 1] = helpVar;
                    }
                }
            }
        }
        return helpArray[0];
    }



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
