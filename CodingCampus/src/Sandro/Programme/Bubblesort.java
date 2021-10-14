package Sandro.Programme;

import java.util.Arrays;


public class Bubblesort {

    public static void main(String[] args) {

        int[] pool = {19999, 1444, 15123, 645, 58, 555, 53, 1, 456, 8, 9, 89, 44};

        bubbleSort(pool);
        System.out.println(Arrays.toString(pool));

    }

    public static void bubbleSort(int[] pool) {
        for (int i = 0; i < pool.length; i++) {
            for (int j = 0; j < pool.length - 1; j++) {
                if (pool[j] > pool[j + 1]) {
                    int helpVar = pool[j];
                    pool[j] = pool[j + 1];
                    pool[j + 1] = helpVar;
                }
            }
        }
    }
}