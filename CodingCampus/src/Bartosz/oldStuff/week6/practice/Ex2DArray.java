package Bartosz.oldStuff.week6.practice;

import java.util.Arrays;

public class Ex2DArray {
    public static void main(String[] args) {

        int[] rowArray = {0, 1, 2};
        int[] specialArray = {69, 420, 66, 0, -5};
        int[] colArray = {1, 2, 3, 4, 5};

        int[][] testArray = new int[rowArray.length][colArray.length];  // 2D Array - rowArray length anzahl an Reihen
        // colArray length anzahl von index innerhalb der row Arrays

        for (int rows = 0; rows < rowArray.length; rows++) {        // geh durch jede Reihe(Anzahl Reihen = arrayLength)
            //  Nested loop below
            for (int cols = 0; cols < colArray.length; cols++) {        // geh durch jeden Index innerhalb der Reihe (des Arrays)

                if (rows == 1) {                                // gesonderte Reihe(-n, wenn kleiner / größer als) auswählen
                    testArray[rows] = specialArray;
                } else {
                    testArray[rows][cols] = cols;
                }
            }
            System.out.println(rows + ". Reihe: " + Arrays.toString(testArray[rows]));      // ausgeben von Rows jeder Reihe innerhalb von rows content
        }

//        int rowCounter = 0;
//
//        for (int[] rows : testArray) {
//            System.out.println(rowCounter + ". Reihe: " + Arrays.toString(colArray));
//            rowCounter++;
//        }

    }

}
