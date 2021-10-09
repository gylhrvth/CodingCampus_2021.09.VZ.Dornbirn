package Lukas.week4.day3;

import java.util.Arrays;

public class Strings {

    public static String ALL_MEMBERS = "Rauan Mahir Eray Ömer Plamena Sandro Stefan Danny Gerry Ingo Lena Bartosz Sadaaq Stjepan Lukas";

    public static void main(String[] args) {
        //Regbert: https://docs.oracle.com/javase/7/docs/api/java/util/regex/Pattern.html
        splitAndPrintArray(" ", ALL_MEMBERS);
        splitAndPrintArray("a", ALL_MEMBERS);
        splitAndPrintArray("[A-ZÖ]", ALL_MEMBERS);
        splitAndPrintArray("[ac]", ALL_MEMBERS);

        String testString = "Danny;Rauan\tMahir.Eray+Ömer+Plamena+Sandro Stefan Gerry Ingo Lena Bartosz Sadaaq Stjepan Lukas";
        splitAndPrintArray("\t", testString);
        splitAndPrintArray(";", testString);
        splitAndPrintArray(";|\t|\\.|\\+| ", testString);
        splitAndPrintArray("[;\t\\.\\+ ]", testString);

        //Compare to
        //Vergleicht bei mehreren Buchstaben vom Anfang weg alle Buchstaben, wenn diese gleich sind dann gehts zum Nächsten!
        String a = "A";
        String b = "B";
        String c = "C";


        System.out.println("A compareTo B: " + a.compareTo(b));
        System.out.println("B compareTo A: " + b.compareTo(a));
        System.out.println("C compareTo A: " + c.compareTo(a));

        //Compare to 2
        String[] membersArray = ALL_MEMBERS.split(" ");
        printMembersCompareTo(0, 1, membersArray);
        printMembersCompareTo(2, 9, membersArray);

        //anstatt intarr[0] > intarr[1]
        if (membersArray[0].compareTo(membersArray[1]) > 0) {
            //swap membersArray[0] mit membersArray[1]
        }

        //Contains
        String testString2 = "Hallo wie gehts?";

        System.out.println("[" + testString2 + "] contains 'a': " + testString2.contains("a"));
        System.out.println("[" + testString2 + "] contains 'z': " + testString2.contains("z"));
        System.out.println("[" + testString2 + "] contains 'wie': " + testString2.contains("wie"));
    }

    /**
     * @param indexLhs Index of Left hand side
     * @param indexRhs Index of Right hand side
     * @param arr
     */
    public static void printMembersCompareTo(int indexLhs, int indexRhs, String[] arr) {
        System.out.println(arr[indexLhs] + " compareTo " + arr[indexRhs] + ": " + arr[indexLhs].compareTo(arr[indexRhs]));
    }

    public static void splitAndPrintArray(String regbert, String text) {
        String[] splitText = text.split(regbert);

        System.out.println("Split by '" + regbert + "'");
        System.out.println(Arrays.toString(splitText));
    }

    //Aufgabe
}
