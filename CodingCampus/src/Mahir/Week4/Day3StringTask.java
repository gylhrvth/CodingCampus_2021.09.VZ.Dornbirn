package Mahir.Week4;

import Lukas.week4.day3.Strings;

import java.util.Arrays;

public class Day3StringTask {
    public static void main(String[] args) {
        String allMembers = Strings.ALL_MEMBERS;
        String[] splitText = allMembers.split(" ");


        System.out.println(Arrays.toString(splitText));
        System.out.println();

        alphabetischAufsteigend(splitText);
        alphabetischAbsteigend(splitText);
        meistenZeichen(splitText);
        wenigsteZeichen(splitText);
        System.out.println("meisten Selbstlaute");
        String[] tmpString = new String[splitText.length];

        int counter = 0;


          /*  for (int j = 0; j < splitText.length ; j++) {
                String tmp = splitText[j];
                char[] ctp =  tmp.toCharArray();
                if (ctp[j] == 'a'){
                    counter++;
                    splitText[j] += counter;
                    counter = 0;

                }


            }
       System.out.println(Arrays.toString(splitText));
*/


    }


    public static void alphabetischAufsteigend(String[] arr) {
        System.out.println("Alphabetisch aufsteigend");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                int i1 = arr[j].compareTo(arr[j + 1]);
                if (i1 > 0) {
                    String tmp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = tmp;
                }

            }

        }
        System.out.println(Arrays.toString(arr));
        System.out.println();
    }

    public static void alphabetischAbsteigend(String[] arr) {
        System.out.println("Alphabetisch absteigend");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                int i1 = arr[j].compareTo(arr[j + 1]);
                if (i1 < 0) {
                    String tmp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = tmp;
                }

            }

        }
        System.out.println(Arrays.toString(arr));
        System.out.println();
    }

    public static void meistenZeichen(String[] arr) {

        System.out.println("das Element mit den meisten Zeichen");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j].length() > arr[j + 1].length()) {
                    String tmp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = tmp;

                }

            }

        }
        System.out.println(arr[arr.length - 1]);
        System.out.println();
    }

    public static void wenigsteZeichen(String[] arr) {

        System.out.println("das Element mit den wenigsten Zeichen");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j].length() < arr[j + 1].length()) {
                    String tmp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = tmp;

                }

            }

        }
        System.out.println(arr[arr.length - 1]);
        System.out.println();
    }


}

