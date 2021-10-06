package Lukas.week4.day3;

public class Arrays {

    public static void swap(int firstIndex, int secondIndex, int[] arr) {
        int tmp = arr[firstIndex];
        arr[firstIndex] = arr[secondIndex];
        arr[secondIndex] = tmp;
    }

    public static void swapIfBigger(int firstIndex, int secondIndex, int[] arr) {
        if(arr[secondIndex] > arr[firstIndex]) {
            int tmp = arr[firstIndex];
            arr[firstIndex] = arr[secondIndex];
            arr[secondIndex] = tmp;
        }
    }
}
