package Eray.week4;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class StringExamples {
    public static void main(String[] args) {

        String testText = "Hello World!";
        System.out.println(testText);

        System.out.println("Länge: " + testText.length());
        for (int i = 0; i < testText.length(); i++) {
            System.out.print(" " + testText.charAt(i));
        }

        if(testText.contains("Wordl!")){
            System.out.println("World! has been found");
        }


        System.out.println( testText.length());
        System.out.println(testText.equals("a"));
        System.out.println(testText.substring(0,5));
        System.out.println(testText.toLowerCase());
        System.out.println(testText.toUpperCase());
        System.out.println(testText.toCharArray());
        System.out.println(testText.toString());
        System.out.println(testText.codePointAt(0));
        System.out.println(testText.concat("Hallo"));
        System.out.println(testText.replace('H', 'N'));
        System.out.println(Arrays.toString(testText.getBytes(StandardCharsets.UTF_8)));
        System.out.println(testText.charAt(0));
        System.out.println(testText.repeat(2));



    }
}
