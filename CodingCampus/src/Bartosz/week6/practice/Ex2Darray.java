package Bartosz.week6.practice;

import java.util.Arrays;

public class Ex2Darray {
    public static void main(String[] args) {

        int[] rowArray = {0, 1, 2};
        int[] colArray = {1, 2, 3, 4, 5};

        int[][] testArray = new int[rowArray.length][colArray.length];


        for (int i = 0; i < testArray.length; i++) {
            for (int j = 0; j < testArray.length; j++) {
                testArray[j] = rowArray;
                testArray[j] = colArray;
            }

        }


        for (int zeilen[] : testArray) {
            for (int spalten : zeilen) {
                System.out.print(spalten);
            }
            System.out.println();
        }

//        System.out.println(Arrays.toString(testArray));

    }

    private static void fillArray() {

    }

}
