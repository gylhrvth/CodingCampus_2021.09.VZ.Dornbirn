package Lukas.week4.day4;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {1, 5, 190, 20, 60, 20,};
        int[] arr2 = {1, 4, 7};
        int[] arr3 = {2, 5, 9, 10};

        System.out.println(Arrays.toString(mergeRec(arr2, arr3)));

        split(arr);

    }

    private static int[] splitRec(int[] arr) {
        int[][] tmp = split(arr);
        int[] arrLhs = tmp[0];
        int[] arrRhs = tmp[1];

        if (arrLhs.length > 1) {
            splitRec(arrLhs);
        }
        if (arrRhs.length > 1) {
            splitRec(arrRhs);
        }

        return mergeRec(arrLhs, arrRhs);
    }

    private static int[] mergeRec(int[] lhsArr, int[] rhsArr) {
        int[] mergedArray = new int[lhsArr.length + rhsArr.length];
        int i = 0;
        int j = 0;


        while (i + j < mergedArray.length) {
            if (i < lhsArr.length && lhsArr[i] < rhsArr[j]) {
                mergedArray[i + j] = lhsArr[i];
                i++;
            } else if (j < rhsArr.length) {
                mergedArray[i + j] = rhsArr[j];
                j++;
            }
        }


       /* for (; i < lhsArr.length; i++) {
            mergedArray[i + j] = lhsArr[i];
        }
        for (; j < rhsArr.length; j++) {
            mergedArray[i + j] = rhsArr[j];
        }*/


        return mergedArray;
    }

    private static int[][] split(int[] arr) {
        int half = arr.length / 2;

        int[] arrLeft = new int[half];
        int[] arrRight = new int[arr.length - half];

        System.arraycopy(arr, 0, arrLeft, 0, arrLeft.length);
        System.arraycopy(arr, arrLeft.length, arrRight, 0, arrRight.length);

        System.out.println(Arrays.toString(arrLeft));
        System.out.println(Arrays.toString(arrRight));

        return new int[][]{arrLeft, arrRight};
    }
}
