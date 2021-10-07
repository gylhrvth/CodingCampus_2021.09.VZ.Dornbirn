package Mahir.Week4;

//https://docs.oracle.com/javase/7/docs/api/java/lang/String.html

public class Day2Strings {
    public static void main(String[] args) {

        String testText = "Hallo World! Today is a nice day for coding";
        String testText2 = "Hallo World! Today is a nice day for coding              ";
        System.out.println(testText.substring(13));
        System.out.println(testText2.trim());
        System.out.println("Länge: " + testText.length());
        System.out.println(testText.replace("World", "Mahir"));
        System.out.println(testText.repeat(3));
        System.out.println(testText + testText2);

        for (int i = 0; i < testText.length(); i++) {
            System.out.println(testText.charAt(' ' + i ));

        }



    }
}
