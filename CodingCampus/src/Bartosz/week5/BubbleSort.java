package Bartosz.week5;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arrayToBeSorted = {0, -4, 5, 10, -2, -8, 7, 2, -2};
        System.out.println(Arrays.toString(arrayToBeSorted));
        bubbleSortMethod(arrayToBeSorted);
        System.out.println(Arrays.toString(arrayToBeSorted));
    }

        public static void bubbleSortMethod(int[] paramArray) {
        for (int i = 0; i < paramArray.length; i++) {
            for (int j = 0; j < paramArray.length - i - 1; j++) {
                if(paramArray[j] > paramArray[j+1])  {
                    int temp = paramArray[j];
                    paramArray[j] = paramArray[j+1];
                    paramArray[j+1] = temp;
                }
            }

        }
    }


    // mit erklärung
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
