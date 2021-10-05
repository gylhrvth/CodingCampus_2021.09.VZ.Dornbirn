package Mahir.Week4;

import java.util.Arrays;
import java.util.Random;

public class Day2sortArray {
    public static Random rnd = new Random();

    public static void main(String[] args) {


        String abc = "qaywsxedcrfvtgbzhnujmikolp";
        char[] cha = abc.toCharArray();

        sortLowestToHighest(array());
        System.out.println();
        sortHighestToLowest(array());
        System.out.println();
        sortAlphabet(cha);


    }


    public static void sortAlphabet(char[] letters) {
        for (int i = 0; i < letters.length; i++) {
            for (int j = 0; j < letters.length - i - 1; j++) {
                if (letters[j] > letters[j + 1]) {
                    int tmp = letters[j];
                    letters[j] = letters[j + 1];
                    letters[j + 1] = (char) tmp;
                }
            }
        }
        System.out.println(Arrays.toString(letters));
    }


    public static void sortHighestToLowest(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] < array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(array));

    }

    public static void sortLowestToHighest(int[] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }

    public static int[] array() {
        int length = 25;

        int[] rndNumbs = new int[length];
        for (int i = 0; i < rndNumbs.length; i++) {
            rndNumbs[i] = rnd.nextInt(100);

        }
        return rndNumbs;
    }

  /*  public static void selectionSort(int[] array) {       //Selection sort

        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {

            }
        }
    }

   */
}
