package Oemer.Week3;


import java.util.Arrays;
import java.util.Random;

public class Tag1Array {
    public static Random rnd = new Random();

    public static void main(String[] args) {

        int[] myNumber = {2, 9, 14, 19, 27, 56, 57};

        System.out.println(Arrays.toString(myNumber));
    }

    {
        int lenghofArray = 20;
        int[] arrays = new int[lenghofArray];
        arrays[0] = rnd.nextInt(100);

        for (int i = 0; i < lenghofArray; i++) {
            arrays[i] = 20 + rnd.nextInt(100);
        }
        System.out.println(Arrays.toString(arrays));
        System.out.print("[");
        for (int i = 0; i < arrays.length; i++) {
            if (i > 0) {
                System.out.print(",");
            }
            System.out.print(20 + arrays[i]);
        }
        System.out.println("]");

        //Print even numbers

        int[] i = {22, 56, 62, 46, 12};

        for (int j = 0; j < arrays.length; j++) {
            if (arrays[j] % 2 == 0) {
                System.out.print(arrays[j] + "");
            }
            System.out.println();
        }

        //lowest number

        int min = arrays[0];
        int pos = 0;

        for (int a = 0; a < arrays.length; a++){
            if (arrays[a]);

        }


    }


}






