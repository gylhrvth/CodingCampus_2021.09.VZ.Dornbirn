package Rauan.woche3;

import java.util.Scanner;

public class ArrayTest2 {


    public static void main(String[] args) {
        //Lukas Array Aufgabe
        Scanner scanner = new Scanner(System.in);
        System.out.println("bitte geben sie ein satz ein");
        String line = scanner.nextLine();
        System.out.println("die satz ist:" + line);
        char[] letters = line.toCharArray();

        //variante A
        System.out.println("variante A");
        printreverse(letters);

        //Variante B
        System.out.println("variante B");
        String output= reverseString(letters);
        System.out.println(output);
    }

    public static void printreverse(char[] letters) {
        for (int i = letters.length - 1; i >= 0; i--) {
            System.out.print(letters[i]);
        }
        System.out.println();
    }

    public static String reverseString(char[] letters) {
       String tmp="";
       for (int i=letters.length-1; i>=0; i--){
           tmp+= letters[i];
       }
        return tmp;
    }

}
