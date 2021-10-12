package Saadaq.Week4;

import java.util.Arrays;

public class SortBeispeil {
    public static void main(String[] args) {


        int[] arrayToSort = {5,3,6,-4,9,1,0,2,-2,8,-1};
      //  System.out.println(Arrays.toString(arrayToSort));



      //  System.out.println(Arrays.toString(arrayToSort));

        for (int i=0; i < arrayToSort.length; i++){
            for (int j=0; j<arrayToSort.length -i -1; j++) {
                if (arrayToSort[j] > arrayToSort[j + 1]) {
                    int temp = arrayToSort[j];
                    arrayToSort[j] = arrayToSort[j + 1];
                    arrayToSort[j + 1] = temp;
                }

            }
        }

        System.out.println(Arrays.toString(arrayToSort));








    }// End of Main
    // This function/Method make a simple bubble sorting on the paramter array

   /* public static void bubbleSorting(int[] parameter){
        for (int i=0; i < parameter.length; i++){
            for (int j=0; j<parameter.length -i -1; j++){
                if (parameter[j] > parameter[j+1]){
                    int temp = parameter[j];
                    parameter[j] = parameter[j+1];
                    parameter[j+1] = temp;

                }
            }
        }
    }

    */





} // End of Class
