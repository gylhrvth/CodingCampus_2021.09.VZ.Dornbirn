package Lena;

import java.util.Arrays;

public class SortArray {

    public static void main(String[] args) {
        int[] arrayToSort = {2, 6, -4, 9, 5, -1, 0, 12, 3, 4, 8, -2};
        System.out.println(Arrays.toString(arrayToSort));
       // bubbleSort(arrayToSort);
       // System.out.println(Arrays.toString(arrayToSort));

        //mergeSort(arrayToSort, 0, arrayToSort.length-1);

    }

    public static void bubbleSort(int[] parm) {

        for (int i = 0; i < parm.length; i++) {
            for (int j = 0; j < parm.length - 1 - i; j++) {
                if (parm[j] > parm[j + 1]) {
                    int helpVar = parm[j];
                    parm[j] = parm[j + 1];
                    parm[j + 1] = helpVar;
                }
            }

        }
    }

    public static void mergeSort(int[] parm, int startIndex, int endIndex) {
        int newIndex = endIndex / 2;
        if (endIndex-startIndex>1) {
            int middle=startIndex+(endIndex-startIndex)/2;

            mergeSort(parm, startIndex, middle);
            mergeSort(parm, middle, endIndex);
        }

        int[] firstHalf = {parm[startIndex]};
        int[] secondHalf = {parm[endIndex]};
        System.out.println(Arrays.toString(firstHalf));
        System.out.println(Arrays.toString(secondHalf));
      //  merge(firstHalf, secondHalf);
    }

    public static void merge(int[] firstHalf, int[] secondHalf) {
        int[] newList = new int[firstHalf.length + secondHalf.length];

        int countFirst = 0;
        int countSecond = 0;
        for (int i = 0; i < newList.length; i++) {

            while (countFirst<firstHalf.length&&countSecond<secondHalf.length) {
                if (firstHalf[countFirst] >= secondHalf[countSecond]) {
                    newList[i] = firstHalf[countFirst];
                    countFirst++;
                } else {
                    newList[i] = secondHalf[countSecond];
                    countSecond++;
                }
            }

        }

        System.out.println(Arrays.toString(newList));
    }


}
