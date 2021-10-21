package Sandro.Programme;

import Lukas.week4.day3.Arrays;

public class varargs {

    public static void main(String[] args) {

        String[] varargs = {"Das ", "ist ", "ein ", "Satz "};

        int x = 3;
        int y = 7;
        int j = 10;

        System.out.println(varargsString(varargs));
        System.out.println(rechnen(x, y, j, 14, 19, 37, 9, 131, 48));
    }

    public static String varargsString(String... string) {

        String text = "";
        for (String strings : string) {
            text += strings;
        }
        return text;
    }

    public static int rechnen(int... array) {

        int result = 0;
        for (int i = 0; i < array.length; i++) {
            result += array[i];

        }
        return result;
    }

}