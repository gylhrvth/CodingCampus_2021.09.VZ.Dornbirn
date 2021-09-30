package Rauan.woche3;

import java.util.Scanner;

public class StringTest {
    private static String Rauan;
    private static String Assaf;

    public static void main(String[] args) {
        //erklärung über String
/*
         int[] nummbers = new int[5];
         nummbers[0] = 5;
          for (int i = 0; i < 10; i++) {
           System.out.println(nummbers[i]);
         }

        String[] nummbers = new String[10];
        nummbers[0] = "Rauan";
        nummbers[1] = "Assaf";
        for (int j = 0; j < nummbers.length; j++) {
            System.out.println(nummbers[j]);
        }

        int[] nummbers = {1, 2, 3};
        nummbers[0] = 1;
        nummbers[1] = 4;
        for (int n = 0; n < nummbers.length; n++) {
            System.out.println(nummbers[n]);

        }

        int[] nummbers = {1, 2, 3, 4, 5, 6, 7, 8};
        int result = 1;
        for (int i = 0; i < nummbers.length; i++) {
            result = result * nummbers[i];
        }
        System.out.println(result);

 */
        String[][] names = new String[10][2];
        Scanner scanner = new Scanner(System.in);
        System.out.println("vorname");
        String vorname = scanner.next();
        System.out.println("nachname");
        String nachname = scanner.next();

        names[0][0] = vorname;
        names[0][1] = nachname;
        System.out.println(names);

        //programm für String
        // text to ascil art generator

    }
}
