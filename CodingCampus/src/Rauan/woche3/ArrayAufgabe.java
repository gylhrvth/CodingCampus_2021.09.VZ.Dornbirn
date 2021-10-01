package Rauan.woche3;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayAufgabe {
    public static void main(String[] args) {

        int[] ana = new int[5];
        ana[0] = 1;
        ana[1] = 2;
        ana[2] = 3;
        ana[3] = 4;
        ana[4] = 5;
        System.out.println(Arrays.toString(ana));

        Scanner scanner = new Scanner(System.in);
        System.out.println("bitte geben sie ein satz ein");
        String input = scanner.nextLine();
        System.out.println("Die satz ist:" + input);

        char[] mycharArray = input.toCharArray();
        for (int i = mycharArray.length - 1; i >= 0; i--) {
            System.out.println(mycharArray[i]);
        }
        for (int myChar : mycharArray) {
            System.out.println(myChar);

            for (int i = 0; i < ana.length / 2; i++) {
                char tmp = (char) ana[ana.length - i - 1];
                ana[ana.length - i - 1] = ana[i];
                ana[i] = tmp;
            }
        }
    }


}

    
