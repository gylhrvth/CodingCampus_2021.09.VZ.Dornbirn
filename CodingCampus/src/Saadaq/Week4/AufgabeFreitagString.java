package Saadaq.Week4;

import Lukas.week4.day4.Aufgabe1;

import java.util.Locale;

public class AufgabeFreitagString {


    public static void main(String[] args) {



        // to lower text and upper text
        Aufgabe1.TEXT_TO_ANALYZE.toLowerCase(Locale.ROOT);
        System.out.println(Aufgabe1.TEXT_TO_ANALYZE.toLowerCase(Locale.ROOT));

        System.out.println(Aufgabe1.TEXT_TO_ANALYZE.length());

        // length is 2783
        //String words = "";


        // String split manuel


        System.out.println("Word count");


        System.out.println(countWordsUsingSplit(Aufgabe1.TEXT_TO_ANALYZE));


        System.out.println("Word count End");














    }


public static int countWordsUsingSplit(String input){
        if (input == null || input.isEmpty()){
            return 0;
        }


        String[] words = input.split("\\s+");
        return words.length;
}


}
