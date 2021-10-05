package Bartosz.week5.sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arrayToBeSorted = {0, -4, 5, 10, -2, -8, 7, 3};
        System.out.println(Arrays.toString(arrayToBeSorted));

//        bubbleSortMethod(arrayToBeSorted);
//        System.out.println(Arrays.toString(arrayToBeSorted));
//
//        reverseBubbleSort(arrayToBeSorted);
//        System.out.println(Arrays.toString(arrayToBeSorted));
//
//        absoluteBubbleSort(arrayToBeSorted);
//        System.out.println(Arrays.toString(arrayToBeSorted));

        bubbleSortFromTo(arrayToBeSorted, 0, 4);
        System.out.println(Arrays.toString(arrayToBeSorted));
    }

    public static void bubbleSortMethod(int[] paramArray) {
        for (int i = 0; i < paramArray.length; i++) {
            for (int j = 0; j < paramArray.length - i - 1; j++) {
                if (paramArray[j] > paramArray[j + 1]) {
                    int temp = paramArray[j];
                    paramArray[j] = paramArray[j + 1];
                    paramArray[j + 1] = temp;
                }
            }
        }
    }

    public static void reverseBubbleSort(int[] paramArray) {
        for (int h = 0; h < paramArray.length - 1; h++) {
            for (int i = 0; i < paramArray.length - h - 1; i++) {
                if (paramArray[i] < paramArray[i + 1]) {
                    int temp = paramArray[i];
                    paramArray[i] = paramArray[i + 1];
                    paramArray[i + 1] = temp;
                }
            }
        }

        // mit erklärung
//______________________________________________________________________________________________________________
//    public static void bubbleSortMethod(int[] paramArray){
//        for (int h = 0; h < paramArray.length-1; h++) {     // Solange ausführen, bis Array so oft wie werte vorhanden sind überprüft wurde.
//            for (int i = 0; i < paramArray.length-1; i++) {     // Solange auswechseln, bis ganzes Array überprüft ist
//                if(paramArray[i] > paramArray[i+1]){        // Wenn der linkeWert größer als der rechte ist:
//                    int tmp = paramArray[i];...............// Wert der linken position
//                    paramArray[i] = paramArray[i+1]; // Linker position wird Wert der rechten Position zugewiesen
//                    paramArray[i+1] = tmp;............// Rechter Position wird der Wert der linken Position zugewiesen
//                }
//            }
//        }
//    }
    }

    public static void absoluteBubbleSort(int[] paramArray) {
        for (int i = 0; i < paramArray.length; i++) {
            for (int j = 0; j < paramArray.length - i - 1; j++) {
                if (paramArray[j] > paramArray[j + 1]) {
                    int temp = paramArray[j];
                    paramArray[j] = paramArray[j + 1];
                    paramArray[j + 1] = temp;
                }
                if (paramArray[j] < 0) {
                    paramArray[j] = paramArray[j] * -1;
                }
            }
        }
    }

    public static void bubbleSortFromTo(int[] paramArray, int Start, int End) {
        for (int i = 0; i < paramArray.length; i++) {
            while (i >= Start && i <= End) {
                for (int j = 0; j < paramArray.length - i - 1; j++) {
                    if (paramArray[j] > paramArray[j + 1]) {
                        int temp = paramArray[j];
                        paramArray[j] = paramArray[j + 1];
                        paramArray[j + 1] = temp;
                    } else {
                        continue;
                    }
                }
            }
        }
    }
}