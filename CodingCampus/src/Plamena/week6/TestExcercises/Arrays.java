package Plamena.week6.TestExcercises;

import java.util.Random;

public class Arrays {
    public static void main(String[] args) {

    }

    @SuppressWarnings("unused")
    private static String[] bubbleSortChar(String[] data, int charPos) {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length - i; j++) {
                if (j > 0 && data[j].charAt(charPos - 1) < data[j - 1].charAt(charPos - 1)) {
                    String tmp = data[j];
                    data[j] = data[j - 1];
                    data[j - 1] = tmp;
                }
            }
        }
        return data;
    }

    @SuppressWarnings("unused")
    private static String[] sortStrings(String[] data, boolean ascending) {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length - i; j++) {
                if (ascending && j > 0 && data[j].compareTo(data[j - 1]) < 0) {
                    String tmp = data[j];
                    data[j] = data[j - 1];
                    data[j - 1] = tmp;
                } else if (!ascending && j > 0 && data[j].compareTo(data[j - 1]) > 0) {
                    String tmp = data[j];
                    data[j] = data[j - 1];
                    data[j - 1] = tmp;
                }
            }
        }
        return data;
    }

    @SuppressWarnings("unused")
    private static String[] dscSortStrings(String[] data) {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length - i; j++) {
                if (j > 0 && data[j].compareTo(data[j - 1]) > 0) {
                    String tmp = data[j];
                    data[j] = data[j - 1];
                    data[j - 1] = tmp;
                }
            }
        }
        return data;
    }

    @SuppressWarnings("unused")
    private static String[] ascSortStrings(String[] data) {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length - i; j++) {
                if (j > 0 && data[j].compareTo(data[j - 1]) < 0) {
                    String tmp = data[j];
                    data[j] = data[j - 1];
                    data[j - 1] = tmp;
                }
            }
        }
        return data;
    }

    @SuppressWarnings("unused")
    private static int[] dscSortNmbs(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i; j++) {
                if (j > 0 && arr[j] > arr[j - 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = tmp;
                }
            }
        }
        return arr;
    }

    @SuppressWarnings("unused")
    private static int[] ascSortNmbs(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (j > 0 && arr[j] < arr[j - 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = tmp;
                }
            }
        }
        return arr;
    }

    @SuppressWarnings("unused")
    private static int avrgOfArr(int[] arr) {
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        return sum / arr.length;
    }

    @SuppressWarnings("unused")
    private static int maxOfArr(int[] arr) {
        int max = 0;
        for (int j : arr) {
            if (j > max) {
                max = j;
            }
        }
        return max;
    }

    @SuppressWarnings("unused")
    private static int minOfArr(int[] arr) {
        int min = arr[0];
        for (int j : arr) {
            if (j < min) {
                min = j;
            }
        }
        return min;
    }

    @SuppressWarnings("unused")
    static void printArrCrazyRange() {
        Random rnm = new Random();
        int[] arr = new int[20];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnm.nextInt(100) - 50;
        }
        System.out.println(java.util.Arrays.toString(arr));
    }

    @SuppressWarnings("unused")
    private static void printArrSecElems() {
        Random rnm = new Random();
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnm.nextInt(100);
            if (i % 2 == 0) {
                System.out.print(arr[i] + ", ");
            }
        }
        System.out.println();
        System.out.println(java.util.Arrays.toString(arr));
    }

    @SuppressWarnings("unused")
    private static int[] rnmNumsArr() {
        Random rnm = new Random();
        int[] arr = new int[20];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnm.nextInt(1000);
        }
        return arr;
    }

    @SuppressWarnings("unused")
    private static int rnmNumsElems(int element) {
        Random rnm = new Random();
        int[] arr = new int[20];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnm.nextInt(100);
        }
        System.out.println(java.util.Arrays.toString(arr));
        return arr[element - 1];
    }

    @SuppressWarnings("unused")
    private static void printRnmNums() {
        Random rnm = new Random();
        int[] arr = new int[20];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnm.nextInt(100);
        }
        for (int num : arr) {
            System.out.print(arr[num] + ", ");
        }
    }
}
