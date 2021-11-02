package Rauan;

import java.util.Calendar;
import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {
        int[] arr = {3, 4, 65676, -3, 6};
        System.out.println("first and last");
        System.out.println(printFirstAndLAST(arr));

        System.out.println("printMinValue");
        printMinValue(arr);

        System.out.println("printMaxVAlue");
        printMaxValue(arr);

    }

    private static String printFirstAndLAST(int[] arr) {
        return "first element is: " + arr[0] + " LAst element is: " + arr[arr.length - 1];
    }

    private static void printMinValue(int[] value) {
        int idxMinValue = 0;
        for (int i = 0; i < value.length; i++) {
            if (value[i] < value[idxMinValue]) {
                idxMinValue = i;
            }
        }
            System.out.println("On index " + idxMinValue + " is: " + value[idxMinValue]);

    }
    private static void printMaxValue(int[] value){
        int idxMaxVAlue =0;
        for (int i = 0; i <value.length ; i++) {
            if (value[i]>value[idxMaxVAlue]){
                idxMaxVAlue=i;
            }

        }
        System.out.println("On index "+ idxMaxVAlue+ " is: "+ value[idxMaxVAlue]);
    }
}



