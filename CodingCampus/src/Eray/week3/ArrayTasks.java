package Eray.week3;

import java.util.Arrays;
import java.util.Random;

public class ArrayTasks {
    public static Random rnd = new Random();

    public static void main(String[] args) {

        int arrayLength = 20;
        int[] numbers = new int[arrayLength];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rnd.nextInt(50);
        }


        printArray(numbers);
        spaces();
        printArrayWithAllEvenNumbers(numbers);
        spaces();
        printArrayWithPrimNumbers(numbers);
        spaces();
        printArrayWithLowestValue(numbers);
        spaces();
        printArrayWithHighestValue(numbers);
        spaces();
        printArraySum(numbers);
        spaces();
        printAverageSum(numbers);
        spaces();
    }

    public static void spaces() {
        System.out.println();
        System.out.println();
    }

    public static void printArray(int[] numbers) {

        System.out.println("\u001B[36m" + "Print Array" + "\u001B[0m");
        //First Version
        System.out.println(Arrays.toString(numbers));
        //Second Version

        boolean setComma = false;
        System.out.print("[");
        for (int i = 0; i < numbers.length; i++) {
            if (setComma) {
                System.out.print(", ");
            }
            System.out.print(numbers[i]);
            setComma = true;
        }
        System.out.print("]");

    }

    public static void printArrayWithAllEvenNumbers(int[] numbers) {

        System.out.println("\u001B[36m" + "Print Array with All Even Numbers" + "\u001B[0m");

        boolean setComma = false;
        System.out.print("[");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                if (setComma) {
                    System.out.print(", ");
                }
                System.out.print(numbers[i]);
                setComma = true;
            }
        }
        System.out.print("]");

    }

    public static boolean isAPrimNumber(int numbers) {
        for (int i = 2; i < numbers; i++) {
            if (numbers % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void printArrayWithPrimNumbers(int[] numbers) {

        System.out.println("\u001B[36m" + "Print Array with Prime Numbers" + "\u001B[0m");

        boolean setComma = false;
        System.out.print("[");
        for (int i = 0; i < numbers.length; i++) {


            if (isAPrimNumber(numbers[i])) {
                if (setComma) {
                    System.out.print(", ");
                }
                System.out.print(numbers[i]);
                setComma = true;

            }

        }
        System.out.print("]");

    }

    public static void printArrayWithLowestValue(int[] numbers) {

        System.out.println("\u001B[36m" + "Print Array with Lowest Number" + "\u001B[0m");


       int minValue = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < numbers[minValue]){
                minValue = i;
            }
        }

        System.out.print("Der Minimalste Wert aus dem Array an Position " + minValue + " beträgt " + numbers[minValue]);
    }

    public static void printArrayWithHighestValue(int [] numbers){
        System.out.println("\u001B[36m" + "Print Array with Highest Number" + "\u001B[0m");
        int maxValue = 0;
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[maxValue] < numbers[i] ){
                maxValue = i;
            }
        }
        System.out.print("Der Maximalste Wert aus dem Array an Position " + maxValue + " beträgt " + numbers[maxValue]);
    }

    public static void printArraySum(int[] numbers){
        System.out.println("\u001B[36m" + "Print Array Sum of All" + "\u001B[0m");
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum+= numbers[i];
        }
        System.out.print("Die GesamtZahl des Arrays beträgt " + sum);
    }
    public static void printAverageSum(int[] numbers){
        System.out.println("\u001B[36m" + "Print Average of Array" + "\u001B[0m");
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum+= numbers[i];
        }
        System.out.print("Die Durchschnits Zahl des Arrays beträgt " + (double)sum/ numbers.length);
    }
}

