package Mahir.Week4;

import java.util.Arrays;
import java.util.Random;

public class Day4sortArray {
    public static Random rnd = new Random();

    public static void main(String[] args) {

        sort(array());
    }

    public static void sort(int[] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
    public static int[] array(){
        int length = 25;

        int[] sort = new int[length];
        for (int i = 0; i < sort.length; i++) {
            sort[i] = rnd.nextInt(100);

        }
        return sort;
    }
}
