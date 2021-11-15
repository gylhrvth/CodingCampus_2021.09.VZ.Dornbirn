package Mahir.strukturierteProgrammierung.week6;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TestTasks {
    public static void main(String[] args) {


        //counter(10);
        //loopWithevenNum(10);
        //rewindLoop(10);
        //printChars("*",20);
        //printSquare(5, "x");
        //printSquare(3,"A");
        //printSlash("x",false);
        //printTriangle(5, "x");
        //readLine();
        //readInt();
        //calculator();
        //randomNumbArray(15);
        //randomNumbArrayCrazyRange(15);
        //randomArrayMinMaxAvg(100);
        int i = 5;  // i = 5
        int j = 9;
        int k = 4;
        i+= j; // i = i +j ( 5+ 9

        i+=k; // 18
        System.out.println(i);


    }

    private static void bubbleSortInt(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] < arr[j + 1]) {
                    int tmp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = tmp;
                }
            }
        }


    }

    private static void avarageOfValue(int[] arr) {
        int tmp = 0;
        for (int i = 0; i < arr.length; i++) {
            tmp += arr[i];
        }
        System.out.println("The avrage of the array is " + tmp / arr.length);
    }

    private static void maxValueOfArray(int[] arr) {
        int tmp = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= tmp) {
                tmp = arr[i];
            }
        }
        System.out.println("The Highest number in the array is " + tmp);
        System.out.println();

    }


    private static void minValueOfArray(int[] arr) {
        int tmp = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= tmp) {
                tmp = arr[i];
            }
        }
        System.out.println("The lowest number in the array is " + tmp);
        System.out.println();
    }

    private static void randomArrayMinMaxAvg(int arrayLength) {
        Random rnd = new Random();
        int[] rndArray = new int[arrayLength];

        for (int i = 0; i < rndArray.length; i++) {
            rndArray[i] = rnd.nextInt(1000);

        }
        System.out.println(Arrays.toString(rndArray));
        System.out.println();
        minValueOfArray(rndArray);
        maxValueOfArray(rndArray);
        avarageOfValue(rndArray);
    }

    private static void randomNumbArrayCrazyRange(int arrayLenght) {
        Random rnd = new Random();
        int[] rndArrayCrazyRange = new int[arrayLenght];
        for (int i = 0; i < rndArrayCrazyRange.length; i++) {
            rndArrayCrazyRange[i] = rnd.nextInt(100) - 50;
        }
        for (int i : rndArrayCrazyRange) {
            System.out.println(i);

        }
    }

    private static void randomNumbArray(int arrayLength) {
        Random rnd = new Random();
        int[] rndnumbArray = new int[arrayLength];


        for (int i = 0; i < rndnumbArray.length; i++) {
            rndnumbArray[i] = rnd.nextInt(100);
        }

        System.out.println("ausgabe mit der ForEach schleife ");
        for (int i : rndnumbArray) {
            System.out.println(i);

        }
        System.out.println("Der zweite fünfte und zehnte Wert ");

        System.out.println(rndnumbArray[1]);
        System.out.println(rndnumbArray[4]);
        System.out.println(rndnumbArray[9]);

        System.out.println("Jede zweite Zahl");
        for (int i = 0; i < rndnumbArray.length; i += 2) {
            System.out.println(rndnumbArray[i]);

        }

    }

    private static void calculator() {
        // noch nicht fertig
        Scanner scanner = new Scanner(System.in);

        int numb1 = scanner.nextInt();
        scanner.nextLine();
        String operator = scanner.nextLine();
        int numb2 = scanner.nextInt();

        if (operator.equals("+")) {
            int result = numb1 + numb2;
            System.out.println(result);
        }
        if (operator.equals("-")) {
            int result = numb1 - numb2;
            System.out.println(result);
        }

    }

    private static void readInt() {
        Scanner scanner = new Scanner(System.in);

        while (!scanner.hasNextInt()) {
            System.out.println("invalid input pleas try again");
            scanner.nextLine();
        }
        System.out.println(scanner.nextInt());
    }

    private static void readLine() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(scanner.nextLine());
    }

    private static void printRhombos(String chars, int size) {

    }

    private static void printTriangle(int size, String chars) {
        int spaces = size;
        int printChar = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < spaces - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= printChar; k++) {
                if (i == size - 1) {
                    System.out.print(chars);
                } else if (k > 0 && k < printChar) {
                    System.out.print(" ");
                } else {
                    System.out.print(chars);
                }
            }
            System.out.println();
            spaces--;
            printChar += 2;
        }


    }

    private static void printSlash(String chars, boolean backslash) {


        if (backslash) {
            int spaces = 0;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < spaces; j++) {
                    System.out.print(" ");
                }
                System.out.println(chars);
                spaces++;
            }
        } else {


            int spaces2 = 3;
            for (int i = 0; i <= 3; i++) {
                for (int j = 0; j < spaces2; j++) {
                    System.out.print(" ");

                }
                System.out.println(chars);
                spaces2--;
            }
        }


    }


    private static void printSquare(int size, String chars) {
        for (int i = 0; i < size; i++) {
            System.out.print(chars);
        }
        System.out.println();
        for (int i = 0; i < size - 2; i++) {
            for (int j = 0; j < size; j++) {
                if (j > 0 && j < size - 1) {
                    System.out.print(" ");
                } else {
                    System.out.print(chars);
                }
            }
            System.out.println();
        }
        for (int i = 0; i < size; i++) {
            System.out.print(chars);
        }
        System.out.println();
    }

    private static void printChars(String chars, int num) {
        for (int i = 0; i <= num; i++) {
            System.out.print(chars);

        }
    }

    private static void rewindLoop(int num) {
        for (int i = num; i >= -10; i--) {
            System.out.println(i);

        }
        System.out.println();
    }

    private static void loopWithevenNum(int num) {
        for (int i = 0; i <= num; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }

        }
        System.out.println();
    }

    private static void counter(int num) {
        for (int i = 0; i <= num; i++) {
            System.out.println(i);
        }
        System.out.println();

        int i = 0;
        while (i <= num) {
            System.out.println(i);
            i++;
        }
        System.out.println();
    }
}
