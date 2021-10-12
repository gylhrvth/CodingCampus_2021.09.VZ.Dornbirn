package Ingo.week5;

import java.util.Arrays;

public class StringToStringArrays {
    public static void main(String[] args) {

        // String in StringArray umwandeln mit .split  !!!
        String newStr = " ich du er sie es wir";
        String[] strArr = newStr.split(" ");
        for (int i = 0; i < strArr.length; i++) {
            System.out.println(strArr[i]);
        }
        System.out.println("-----------------------------------------");
        // String[] zur Konvertierung von String in String-Arrays !!!
        String newStr1 = " ich du er sie es wir";
        String[] str = new String[]{newStr1};
        System.out.println(Arrays.toString(str));

        System.out.println("------------------------------------------");
        // REGEX - Konvertierung von String-Zeichenketten in String-Arrays  !!!
        String newStr2 = " ich du er sie es wir";
        String[] str1 = newStr2.split("(?!^)");
        System.out.println(Arrays.toString(str1));

        System.out.println("--------------------------------------------");
        // String in Char-Array umwandeln - .toCharArray() !!!
        String newStr3 = " ich du er sie es wir";
        char[] newChar = newStr3.toCharArray();
        System.out.println(newChar);
        System.out.println(newChar.length); // .length - mit Index länge   !!!



    }
}
