package Saadaq.Week4;

import Lukas.week4.day4.Aufgabe1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BubbleSortingPractice {
    public static void main(String[] args) {
        /*



        int[] parameter = {23,4,5,6,7,8,9,-3,-2,1,-4,64,0,65,12,13,-119};
        for (int i = 0; i < parameter.length; i++) {
            for (int j = 0; j < parameter.length - i - 1; j++) {
                if (parameter[j] >= parameter[j + 1]){
                    int temp = parameter[j];
                    parameter[j] = parameter[j + 1];
                    parameter[j + 1] = temp;
                }

                System.out.println(Arrays.toString(Arrays.stream(parameter).toArray()));
            }
        }

         */



        String randomMailEnding = "[a-zA-Z0-9]+(\\.[a-zA-Z0-9]+)*@([a-zA-Z0-9]+\\.)+[a-zA-Z0-9]+";
        System.out.println("eray.lokfuehrer@hotmail.sy".matches(randomMailEnding));
        System.out.println("eray.array.lokfuehrer@gmail.com".matches(randomMailEnding));
        System.out.println("eray@wegwerfmail.at123".matches(randomMailEnding));
        System.out.println("Drs.rauan@hotmail.comzxw".matches(randomMailEnding));
        System.out.println("eray.arraylokfuehrer@hilukas.gmail.com".matches(randomMailEnding));










    }// End of Main







}// End of Class
