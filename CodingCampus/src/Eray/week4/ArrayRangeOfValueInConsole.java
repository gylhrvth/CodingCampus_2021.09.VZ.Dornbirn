package Eray.week4;

import Lukas.week4.day3.AufgabeHardcore;

/**
 * <h1>Visualisierung von Daten</h1>
 * <br>Ein gegebenes Array von Fließkommazahlen soll in der Kommandozeile Visualisiert werden.<br>
 * <ul>
 *     <li>Die Ausgabe soll ein definierte Anzahl von Spalten haben</li>
 *     <li>Der Wertebereich der Daten muss auf die Spalten angepasst werden</li>
 *     <li>Kommt ein umgerechneter Wert in einer Spalte öfter vor, so soll diese Spalte in mehreren Zeilen angezeigt werden.</li>
 * </ul>
 */


public class ArrayRangeOfValueInConsole {
    public static void main(String[] args) {
        float[] displayColumns = {2, 0, 3, 2, 0, 0, 0, 15, 1, 1};

        printArray(displayColumns);
    }


    public static void printArray(float[] displayColumns) {


        float maxValue = printArrayWithHighestValue(displayColumns);

        for (int i = 0; i <= maxValue; i++) {

            for (int j = 0; j < displayColumns.length; j++) {
                if (i < displayColumns[j]) {
                    System.out.print("x");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    public static float printArrayWithHighestValue(float[] numbers) {

        int maxValue = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > numbers[maxValue]) {
                maxValue = i;
            }
        }
        return maxValue;
    }
}

