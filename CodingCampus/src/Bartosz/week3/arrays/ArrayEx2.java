package Bartosz.week3.arrays;

import java.util.*;

public class ArrayEx2 {
    public static void main(String[] args) {

        String init = programInit();    //Einlesen und weidergabe String

        char[] initArray = remodel(init); //  Remodel String to char array

        // Variante a
        System.out.println("Variante a");
        reverseArray(remodel(init));    // umwandeln des Init Satzes
        System.out.println();

        //Variante b)
        System.out.println();
        System.out.println("Variante b)");
        //System.out.println(reverseString(letters));
        String output = reverseString(initArray);
        System.out.println(output);
        System.out.println();

        //Variante c)
        System.out.println("Variante c)");  // unveränderter origin array
        System.out.println(reverseStringWithNewArray(initArray));
        System.out.println();

        //Variante d)
        System.out.println("Variante d)");      // überschreibt origin array
        reverseStringInPlace(initArray);
    }


    public static String reverseString(char[] initArray) {
        String tmp = "";
        for (int i = initArray.length - 1; i < initArray.length && i >= 0; i--) {
            tmp += initArray[i];
        }
        return tmp;
    }   // Variante b

    public static String reverseStringWithNewArray(char[] initArray) {
        char[] tmp = new char[initArray.length];
        int countertmp = 0;
        for (int i = initArray.length - 1; i >= 0; i--) {
            tmp[countertmp] = initArray[i];
            if (countertmp < initArray.length) {
                countertmp++;
            }
        }
        String reverseString = new String(tmp);
        return reverseString;

    } // Variant C

    public static void reverseStringInPlace(char[] initArray) {
        for (int i = 0; i < initArray.length/2; i++) {
            char temp = initArray[i];
            initArray[i] = initArray[initArray.length - 1 - i];
            initArray[initArray.length -1 - i] = temp;
        }

        System.out.println(initArray);
    }   // Variante D


    public static String programInit() {
        System.out.println("Geben Sie etwas ein!");
        Scanner initScanner = new Scanner(System.in);
        String init = initScanner.nextLine();
        System.out.println("Kontrollausgabe : " + init);
        return init;
    }       // declaration input

    public static char[] remodel(String init) {
        char[] initArray = init.toCharArray();
        System.out.println();
        return initArray;
    }       // umwandlung string in char array

    public static void reverseArray(char[] initArray) {
        System.out.print("Reverse Line: ");
        for (int i = initArray.length - 1; i < initArray.length && i >= 0; i--) {
            System.out.print(initArray[i]);
        }
    }       //Variante a


}
