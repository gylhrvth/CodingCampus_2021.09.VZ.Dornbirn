package Stjepan;

import java.util.Arrays;

public class stbubblesortierung {

    public static void main(String[] args) {
        int[] arrayToSort = {5, 9, -2, -7, 2, 3, 4, 1, 0,};

        bubbleSort(arrayToSort);
        System.out.println(Arrays.toString(arrayToSort));

        //bubbleSortRichtigePosition(arrayToSort);
        System.out.println(Arrays.toString(arrayToSort));

        bubbleSortReverseIt(arrayToSort);
        System.out.println(Arrays.toString(arrayToSort));


    }


    public static void bubbleSort(int[] param) {
        for (int i = 0; i < param.length; i++) {
            for (int j = 0; j < param.length - i - 1; j++) {
                if (param[j] < param[j + 1]) {
                    int temp = param[j];
                    param[j] = param[j + 1];
                    param[j + 1] = temp;
                }

            }

        }
    }

    public static void bubbleSortReverseIt(int[] param) {
        for (int i = 0; i < param.length; i++) {
            for (int j = 0; j < param.length - i - 1; j++) {
                if (param[j] < param[j + 1]) {
                    int temp = param[j];
                    param[j] = param[j + 1];
                    param[j + 1] = temp;

                }


                //public static void bubbleSortRichtigePoition ( int[] param){
                    for (int b = 0; i < param.length; i++) {
                        for (int c = 0; j < param.length - i - 1; j++) {
                            if (Math.abs(param[j]) > Math.abs(param[j + 1])) {
                                int temp = param[j];
                                param[j] = param[j + 1];
                                param[j + 1] = temp;


                            }
                        }
                    }

                }
            }}}

