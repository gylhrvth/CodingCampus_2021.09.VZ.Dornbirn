package Gyula;

import java.util.Arrays;

public class StringExamples {
    public static void main(String[] args) {
        String testText = "Hello World! Today is a nice day for coding.";
        String secondText = "abcdefghijklmnopqrstuv";

        System.out.println(testText);

        System.out.println("Länge: " + testText.length());
        for (int i = 0; i < testText.length(); i++) {
            System.out.println("  " + testText.charAt(i));
        }

        if (testText.contains("World!")){
            System.out.println("World! has been found");
        }
        if (testText.contains("nichtVorhanden")){
            System.out.println("!!!! That shall not happen");
        }

        if (testText.startsWith("He")){
            System.out.println("Starts with \"He\"");
        }
        if (testText.endsWith("He")){
            System.out.println("Ends with \"He\"");
        }

        System.out.println("lowerCase: " + testText.toLowerCase());
        System.out.println("upperCase: " + testText.toUpperCase());

        System.out.println("repeat: " + testText.repeat(5));
        System.out.println("concate: " + testText + secondText);
        System.out.println("concate: " + testText.concat(secondText));

        System.out.println(testText.replace("World", "Gyula"));
        System.out.println("Substring(..., 0, 3): " + testText.substring(0, 3));
        System.out.println("Substring(..., 3): " + testText.substring(3));

        String[] words = testText.split(" ");
        System.out.println(Arrays.toString(words));

    }
}
