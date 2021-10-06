package Bartosz.week4.FunWithStrings.FwS2Package;

import Lukas.week4.day3.Strings;

import java.util.Arrays;

public class GetArrayInit {

    public static String[] getArrayForFun(){
        String[] initArray = Strings.ALL_MEMBERS.split(" ");
        return initArray;
    }

    public static void alphabeticSortingRise(String[] paramArray) {
        System.out.println("Unsorted Array :");
        System.out.println(Arrays.toString(paramArray));

        for (int i = 0; i < paramArray.length-1; i++) {
            for (int j = 0; j < paramArray.length - i -1; j++) {
                if(paramArray[j].compareTo(paramArray[j+1]) > 0) {
                    String tmp = paramArray[j];
                    paramArray[j] = paramArray[1];
                    paramArray[j+1] = tmp;
                }
            }
        }
        System.out.println("Sorted Array :");
        System.out.println(Arrays.toString(paramArray));
    }

    public static void alphabeticSortingFall(String[] paramArray) {
        System.out.println("Unsorted Array :");
        System.out.println(Arrays.toString(paramArray));

        for (int i = 0; i < paramArray.length-1; i++) {
            for (int j = 0; j < paramArray.length - i -1; j++) {
                if(paramArray[j].compareTo(paramArray[j+1]) < 0) {
                    String tmp = paramArray[j];
                    paramArray[j] = paramArray[1];
                    paramArray[j+1] = tmp;
                }
            }
        }
        System.out.println("Sorted Array :");
        System.out.println(Arrays.toString(paramArray));
    }
}
