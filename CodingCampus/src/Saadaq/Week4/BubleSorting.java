package Saadaq.Week4;
import java.util.*;
import java.util.Arrays;
public class BubleSorting {

    public static void main(String[] args) {

      int[] testArrayToSort = {18, 15, 85, -34, 65, 5, 1, 3, 2, 6, 7, 8, 9, 10, 50, 40, 30, 20, 70, 80, -1, -10, 5, -6};

        System.out.println(Arrays.toString(testArrayToSort));
        bubbleSorting(testArrayToSort);

        System.out.println(Arrays.toString(testArrayToSort));

        /*for (int i=testArrayToSort.length-1; i>=0; i--){
            System.out.print(testArrayToSort[i]+" ");
        }
*/

       //  System.out.println(Arrays.toString(testArrayToSort));







    }

    /*
     * @ this code is a method to Sort and only to sort using bubble sorting algo
     *
     *
     * */

    public static void bubbleSorting(int[] parameter){
        for (int i = 0; i < parameter.length; i++) {
            for (int j = 0; j < parameter.length - i - 1; j++) {
                if (parameter[j] >= parameter[j + 1]){
                    int temp = parameter[j];
                    parameter[j] = parameter[j + 1];
                    parameter[j + 1] = temp;
                }
            }
        }
    }
}




