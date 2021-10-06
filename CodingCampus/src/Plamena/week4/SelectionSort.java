package Plamena.week4;

import Plamena.week3.MyArrays;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] testData = {5, -7, -12, 6, 0, 8, -10, 1, 3, 11, -5, -2, 4, 7, -6};
        selectionSorter(testData);
        System.out.println(Arrays.toString(testData));
    }

    public static void selectionSorter(int[] arrayToSort) {
        for (int i = 0; i < arrayToSort.length; i++) {
            int index = i;
            for (int j = i + 1; j < arrayToSort.length; j++) {
                if (arrayToSort[j] < arrayToSort[index]) {
                index = j;
                }
            }
            if (arrayToSort[index] != arrayToSort[i]) {
                int tmp = arrayToSort[i];
                arrayToSort[i] = arrayToSort[index];
                arrayToSort[index] = tmp;
            }
        }
    }
}

