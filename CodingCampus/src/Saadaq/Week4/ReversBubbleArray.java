package Saadaq.Week4;

import java.util.Arrays;

public class ReversBubbleArray {
    public static void main(String[] args) {


        int[] reverseBubbleArray = {12, 3, 5, 6, 7, 99, -85, -11, 65, -2, 44, 4, 1, 77, -8, -7, -9, 17, 19};

        System.out.print(Arrays.toString(reverseBubbleArray));
        reverseBubbleSorting(reverseBubbleArray);
        System.out.println();


    }

    public static void reverseBubbleSorting(int[] parameters) {

        for (int i = 0; i < parameters.length; i++) {
            for (int j = 0; j < parameters.length - i - 1; j++) {

                if (parameters[i] < parameters[j + 1]) {
                    int temporary = parameters[j];
                    parameters[j] = parameters[j + 1];
                    parameters[j + 1] = temporary;



                }

            }
        }

    }

}
