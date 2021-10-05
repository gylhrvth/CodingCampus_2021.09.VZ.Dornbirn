package Danny.Woche4;

import java.util.Arrays;

public class StringExamples {
    public static void main(String[] args) {


        String testTest = "Hello World! Today is a nice day for coding.";
        String secondTest = "abcdefghijklmnopqrstuvwxyz12345678910ßüä.;+-!3§4$5%&/()[]{}";

        System.out.println(testTest);

        System.out.println("Länge: " + testTest.length());
        for (int i = 0; i < testTest.length(); i++) {
            System.out.println("  " + testTest.charAt(i));

        }
        if (testTest.contains("World")) {
            System.out.println("World has been found");
        }
        if (testTest.contains("nichtTextvorhanden")) {
            System.out.println("!!!! That shall not happen");
        }
        if (testTest.contains("He")) {
            System.out.println("Starts with \"He\"");
        }
        if (testTest.contains("g.")) {
            System.out.println("Ends with \"g.\"");
        }

        System.out.println("LowerCase " + testTest.toLowerCase());
        System.out.println("UpperCase" + testTest.toUpperCase());

        System.out.println("repeat " + testTest.repeat(5));
        System.out.println("concate " + testTest + secondTest);
        System.out.println("concate " + testTest.concat(secondTest));

        System.out.println(testTest.replace("World","Danny"));

        System.out.println("testTest...6,11 " + testTest.substring(6,11));
        System.out.println("testTest...6 " + testTest.substring(6));

        String[] words = testTest.split(" ");
        System.out.println(Arrays.toString(words));
    }
}
