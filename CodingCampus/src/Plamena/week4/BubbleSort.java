package Plamena.week4;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] testData = {5, -7, -12, 6, 0, 8, -10, 1, 3, 11, -5, -2, 4, 7, -6};

        bubbleSorter(testData);
        System.out.println(Arrays.toString(testData));

    }

    public static void bubbleSorter(int[] param) {
        for (int i = 0; i < param.length; i++) {
            for (int j = 0; j < param.length - i - 1; j++) {
                if (Math.abs(param[j]) > Math.abs(param[j + 1])) {
                    int tmp = param[j];
                    param[j] = param[j + 1];
                    param[j + 1] = tmp;
                }
            }
        }

    }
}
