package Lukas.week3.day3;

public class Strings {
    public static void main(String[] args) {
        String myString = "Hallo wie gehts?";
        System.out.println(myString);

        System.out.println(myString.toUpperCase());
        System.out.println(myString.toLowerCase());



        /*
         * Objekte müssen immer mit .equals(...) verglichen werden!
         * Nicht mit == außer man will nur auf die Referenz überprüfen!!!
         */

        //Nicht wahr!!!
        //"Hallo" == "Hallo"

        //String hallo = "Hallo";
        //Wahr
        //hallo == hallo

        System.out.println("hallo".equals("hallo"));

        //Eingabe des Benutzers
        String eingabe = "exit";

        //Mein Exit keyword
        String exitWord = "Exit";

        System.out.println("Exiting program: " + exitWord.equals(eingabe));
        System.out.println("Exiting program: " + exitWord.toLowerCase().equals(eingabe));

        //Neue Eingabe des Benutzers
        eingabe = "eXit";
        System.out.println("Exiting program: " + exitWord.toLowerCase().equals(eingabe.toLowerCase()));
        System.out.println("Exiting program: " + exitWord.equalsIgnoreCase(eingabe));

        String text = "Das ist ein langer Text!!!!";

        System.out.println(">" + text.substring(12, 18) + "<");

        String logMessage = "Sep 29 09:25:03 v220210410101148757 kernel: [257678.895269] ";

        //Ab inklusive kernel
        System.out.println(">" + logMessage.substring(36) + "<");

        //Die letzten 10 Zeichen
        System.out.println(">" + logMessage.substring(logMessage.length() - 10) + "<");
        //Letztes Zeichen weglöschen
        System.out.println(">" + logMessage.substring(0, logMessage.length() - 1) + "<");
    }
}
