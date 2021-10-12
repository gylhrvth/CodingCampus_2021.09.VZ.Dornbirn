package Stjepan;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class StArray1 {
    public static void main(String[] args) {

        Scanner stringArrayWork = new Scanner(System.in);
        String textEingabe;
        System.out.println("Gib ein Wort ein");
        textEingabe = stringArrayWork.nextLine();
        System.out.println("du hast " + textEingabe + " eingegeben ");
        System.out.println();

        //Eingabe in einen Char umgewandelt

        String textEingabe1 = textEingabe;
        char[] myCharAraay = textEingabe1.toCharArray();
        System.out.print("Vom Char ausgeben ");
        System.out.println(myCharAraay);
        System.out.println();

        //Eingabe umgekehrt ausgeben Variante 2

        System.out.println("variante 2 mit for schleife");
        for (int i = myCharAraay.length - 1; i>= 0; i--) {
            System.out.print(myCharAraay[i]);
        }
            System.out.println();
            System.out.println();

            


        }


    }