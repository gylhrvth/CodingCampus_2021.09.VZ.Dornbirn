package Plamena.week4;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] testData = {5, -7, -12, 6, 0, 8, -10, 1, 3, 11, -5, -2, 4, 7, -6};
        mergeSort(testData, 0, testData.length, "");
        System.out.println(Arrays.toString(testData));
    }

    public static void mergeSort(int[] data, int start, int end, String prefix) {
        //System.out.println(prefix + "merge " + start + " " + end);
        //System.out.println(prefix + Arrays.toString(data));
        if (end - start > 1) {
            int middle = start + (end - start) / 2;

            mergeSort(data, start, middle, prefix + "     ");
            mergeSort(data, middle, end, prefix + "     ");

            int[] result = mergeProcess(data, start, middle, end);
            for (int i = 0; i < result.length; i++) {
                data[start + i] = result[i];
            }
        }
        //System.out.println(prefix + Arrays.toString(data));
    }

    public static int[] mergeProcess(int[] source, int start, int middle, int end) {


        int[] result = new int[end - start];
        int idxResult = 0;
        int idxLeft = start;
        int idxRight = middle;

        while (idxResult < result.length) {
            if ((idxRight == end) || ((idxLeft < middle) && (source[idxLeft] < source[idxRight]))) {
                result[idxResult] = source[idxLeft];
                ++idxResult;
                ++idxLeft;
            } else {
                result[idxResult] = source[idxRight];
                ++idxResult;
                ++idxRight;
            }
        }
        return result;
    }
}
