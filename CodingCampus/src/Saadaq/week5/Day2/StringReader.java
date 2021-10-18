package Saadaq.week5.Day2;

public class StringReader {
    public static void main(String[] args) {


        // java Matching Strings


        String str = new String ("Welcome to geeksforgeegs");

        // testing if regex is present
        System.out.println("Does string contains regex(.*)? : ");
        System.out.println(str.matches("geeks(.*)geeks(.*)"));

        // Testing if regex is present

        System.out.println("Does String contain regex geeks ? :");

        System.out.println(str.matches("geeks"));

        // String Builder

        StringBuilder sb = new StringBuilder(str);

        sb.reverse();

        System.out.println(sb);
        System.out.println(sb.length());

        System.out.println("__________");





















    }// End of Main
}// End of Class
