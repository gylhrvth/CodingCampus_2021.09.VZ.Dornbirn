package Bartosz.oldStuff.week4.sorting;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {1,15,3, 63,105, 53, 95,20, 31, 52,64};
    }

    private static void splitRec(int[] arr){
        int[][] tmp = split(arr);
        int[] arrLhs = tmp[0];
        int[] arrRhs = tmp[1];

        if (arrLhs.length > 1){
            splitRec(arrLhs);
        }

        if(arrRhs.length > 1){
            splitRec(arrRhs);
        }
    }

    private static int[][] split(int[] arr){

        int half = arr.length / 2;
        int[] arrLeft = new int[half];
        int[] arrRight = new int[arr.length-half];

        System.arraycopy(arr, 0, arrLeft, 0, arrLeft.length);
        System.arraycopy(arr, 0, arrLeft.length, 0, arrRight.length);
        return new int[][]{arrLeft, arrRight};
    }
}
