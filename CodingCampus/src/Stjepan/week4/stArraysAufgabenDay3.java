package Stjepan.week4;


import Lukas.week4.day3.Strings;

import java.util.Arrays;


public class stArraysAufgabenDay3 {


    public static String[] getArray() {
        String[] initArray = Strings.ALL_MEMBERS.split(" ");
        return initArray;
    }

    public static void alphabeticSortetUp(String[] paramArray) {
        System.out.println("Unsorted : ");
        System.out.println(Arrays.toString(paramArray));

        for (int i = 0; i < paramArray.length - 1; i++) {
            for (int j = 0; j < paramArray.length - i - 1; j++) {
                int i1 = paramArray[j].compareTo(paramArray[j + 1]);
                if (i1 > 0) {
                    String tmp = paramArray[j + 1];
                    paramArray[j + 1] = paramArray[j];
                    paramArray[j] = tmp;
                }

            }

        }
        System.out.println("sorted Array UP :");
        System.out.println(Arrays.toString(paramArray));

        for (int i = 0; i < paramArray.length - 1; i++) {
            for (int j = 0; j < paramArray.length - i - 1; j++) {
                int i1 = paramArray[j].compareTo(paramArray[j + 1]);
                if (i1 < 0) {
                    String tmp = paramArray[j + 1];
                    paramArray[j + 1] = paramArray[j];
                    paramArray[j] = tmp;
                }

            }

        }
        System.out.println("sorted Array Down:");
        System.out.println(Arrays.toString(paramArray));

        // kürzester name:
        for (int i = 0; i < paramArray.length; i++) {
            for (int j = 0; j < paramArray.length - 1; j++) {
                if (paramArray[j].length() < paramArray[j + 1].length()) {
                    String tmp = paramArray[j + 1];
                    paramArray[j + 1] = paramArray[j];
                    paramArray[j] = tmp;


                }

            }

        }
        System.out.println(paramArray[paramArray.length - 1]);
    }


    public static void main(String[] args) {
        String[] initArray = getArray();
        alphabeticSortetUp(initArray);
    }
}