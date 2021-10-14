package Gyula;

import java.util.Arrays;

public class SortExample {

    public static void main(String[] args) {
        int[] arrayToSort = {5, 3, 6, -4, 9, 1, 0, 2, -2, 8, -1};
        System.out.println(Arrays.toString(arrayToSort));
        bubbleSort(arrayToSort);
        System.out.println(Arrays.toString(arrayToSort));
    }

    /**
     * This function make a simple bubble sort on the parameter array
     * @param param input data to sort ascencing
     */
    public static void bubbleSort(int[] param){
        for (int i = 0; i < param.length; i++) {
            for (int j = 0; j < param.length - i - 1; j++) {
                if (param[j] > param[j + 1]){
                    int temp = param[j];
                    param[j] = param[j] + 1;
                    param[j + 1] = temp;
                }
            }
        }
    }
}
