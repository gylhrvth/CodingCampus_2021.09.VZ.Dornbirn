//package Gerhard.week4;
//
//import Lukas.week4.day3.Strings;
//
//import java.util.Arrays;
//
//public class ExerciseDay3 {
//
//    public static void main(String[] args) {
//
//        System.out.println();
//        System.out.println("String to Array: ");
//        stringToArray(Strings.ALL_MEMBERS);
//        System.out.println();
//        System.out.println();
//
//        System.out.println("Array alphabetisch aufsteigen sortiert");
//        raisingAlphabet(Strings.ALL_MEMBERS);
//
//    }
//
//    public static void stringToArray(String str) {
//        String[] membersArray = str.split(" ");
//        //System.out.println.string(membersArray);
//        System.out.println(Arrays.toString(membersArray));
//    }
//
//    public static void raisingAlphabet(String raiseAlpha) {
//        String[] membersArray = raiseAlpha.split(" ");
//    //    int size = raiseAlpha.length();
//        for (int i = 0; i < raiseAlpha.length(); i++) {
//            for (int j = 0; j < raiseAlpha.length()-1; j++)
//                if (membersArray[i] = (membersArray[j]) > 0){
//                String temp = membersArray[i];
//                membersArray[i] = membersArray[j];
//                membersArray[j] = temp;
//            }
//        }
//        System.out.println(Arrays.toString(membersArray));
//    }
//}
//




/**
 * <h1>Strings und Arrays</h1>
 * <i>Verwende für folgende Aufgabe die Lukas.week4.day3.Strings.ALL_MEMBERS Variable.</i>
 * Zerlege den String in ein Array.
 * <br>Mach für jede Aufgabe eine eigene Methode<br>
 * <ol>
 *     <li>Sortiere das Array alphabetisch aufsteigend und gib es aus<br><small>verwende compareTo</small></li>
 *     <li>Sortiere das Array alphabetisch absteigend und gib es aus<br><small>verwende compareTo</small></li>
 *     <li>Gib das Element mit den meisten Zeichen aus<br><small>verwende length()</small></li>
 *     <li>Gib das Element mit den wenigsten Zeichen aus<br><small>verwende length()</small></li>
 *     <li>Finde das wort mit den meisten Selbstlauten (a, e, i, o, u), jeder Selbstlaut zählt nur einmal!<br><small>verwende contains</small></li>
 *     <li><strong>BONUS AUFGABE</strong> Finde das wort mit den meisten Selbstlauten (a, e, i, o, u)<br><small>verwende toCharArray()</small></li>
 * </ol>
 */