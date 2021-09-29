package Bartosz.week3.arrays;

import java.util.*;

public class ArrayEx2 {
    public static void main(String[] args) {
        String init = programInit();
        // remodel(init); //bsp 1
        insensitivesAddieren(init);
    }

    public static String programInit() {

        System.out.println("Geben Sie etwas ein!");
        Scanner initScanner = new Scanner(System.in);
        String init = initScanner.nextLine();
        System.out.println("Kontrollausgabe : " + init);
        return init;
    }

    public static char[] remodel(String init) {
        char[] ex1Array = init.toCharArray();

        System.out.print("Reverse Line: ");
        for (int i = ex1Array.length - 1; i < ex1Array.length && i >= 0; i--) {
            System.out.print(ex1Array[i]);
        }
        System.out.println();
        return ex1Array;
    }

    public static void insensitivesAddieren(String init) {
        init = init.toLowerCase();      // überschreiben alles klein für leichteres zählen
        char[] ex2Array = init.toCharArray();

        for (int counter = 0; counter < ex2Array.length;counter++ ) {
            int index = ex2Array[counter];
            int[] letterCounter = {index};
            System.out.println(ex2Array[counter] + " mal " + letterCounter  + " ausgegeben");
        }
    }
}
