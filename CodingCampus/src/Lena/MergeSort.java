package Lena;

import java.util.Arrays;

public class MergeSort {

    public static void gyulaMerge(String prefix, int[] data, int start, int end){
        System.out.println(prefix + "gyulaMerge " + start + " " + end);

        if (end - start > 1){
            int middle = start + (end - start) / 2;

            gyulaMerge(prefix + "  ", data, start, middle);
            gyulaMerge(prefix + "  ", data, middle, end);

            int[] tempArray = micromerge(data, start, middle, end);

            for (int i = 0; i < tempArray.length; i++) {
                data[start + i] = tempArray[i];
            }
        }
    }

    public static int[] micromerge(int[] source, int start, int middle, int end) {
        System.out.print("Left : ");
        for (int i = start; i < middle; i++) {
            System.out.print(source[i] + " ");
        }
        System.out.println();

        System.out.print("Right: ");
        for (int i = middle; i < end; i++) {
            System.out.print(source[i] + " ");
        }
        System.out.println();

        int[] result = new int[end - start];
        int idxResult = 0;
        int idxLeft = start;
        int idxRight = middle;

        while ((idxLeft < middle) || (idxRight < end)) {
            if ((idxRight == end) || ((idxLeft < middle) && (source[idxLeft] < source[idxRight]))) {
                result[idxResult] = source[idxLeft];
                ++idxLeft;
            } else {
                result[idxResult] = source[idxRight];
                ++idxRight;
            }
            ++idxResult;
        }
        System.out.println("micromerge " + Arrays.toString(result));
        return result;
    }

}
