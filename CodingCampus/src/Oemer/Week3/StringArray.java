package Oemer.Week3;

import java.util.Scanner;

public class StringArray {
    public static void main(String[] args) {

        int[] array1 = new int[]{2010, 2015, 2020};
        System.out.println(java.util.Arrays.toString(array1));

        for (int i = 0; i < array1.length; i++) {
            System.out.println("Index: " + i + ">" + array1[i]);
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben Sie einen Satz ein:");
        String input = scanner.nextLine();

        System.out.println(input);


        char[] inputArray = input.toCharArray();
        for (int i = 0; i < inputArray.length; i++) {
            System.out.print(i + "  ");
        }
        System.out.println();
        for (int i = inputArray.length - 1; i >= 0; i--) {
            System.out.print(inputArray[i] + "  ");
        }
        System.out.println();

        String tmp = "";
        tmp += inputArray;

        //1.a
        System.out.println();
        for (int i = inputArray.length - 1; i <= 0; i--) {
            System.out.print(inputArray[i] + "  ");

            //1.b
            tmp += inputArray;

            System.out.println();
            for (i = 0; i >= 0; i++) {
                System.out.print(inputArray[i] + (""));


            }

            String myString1 = "Hello";
            char[] mycharArray1 = myString1.toCharArray();
        }
    }
}