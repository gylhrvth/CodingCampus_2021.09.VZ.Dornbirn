package Danny.sortMethods;

import java.util.Arrays;

public class DifferentSortMethods {
    public static void main(String[] args) {


        int[] array1 = {9, 5, 14, 1, 7, 6, 34, 12, 85, 4, -5, -7, 0, -6, 3, 48, 2,};
        System.out.println(Arrays.toString(array1));

        //buubleSort(array1);
        selectionSort(array1);
        System.out.println(Arrays.toString(array1));

    }

    public static void buubleSort(int[] array1) {
        for (int x = 0; x < array1.length; x++) {
            for (int i = 0; i <= array1.length - 2; i++) {
                if (array1[i] > array1[i + 1]) {
                    int temp = array1[i];
                    array1[i] = array1[i + 1];
                    array1[i + 1] = temp;
                }
            }
        }
    }


    public static void selectionSort(int[] array1) {

        for (int i = 0; i < array1.length; i++) {
            int index = i;
            int smallest = array1[i];
            for (int x = i; x < array1.length; x++) {
                if (array1[x] < smallest) {
                    index = x;
                    smallest = array1[x];
                }
            }
            if (array1[i] != array1[index]) {
                int temp = array1[i];
                array1[i] = array1[index];
                array1[index] = temp;
            }
        }
    }
}