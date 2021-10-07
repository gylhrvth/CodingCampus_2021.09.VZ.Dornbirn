package Lukas.week4.day3;

/**
 * <h1>Visualisierung von Daten</h1>
 * <br>Ein gegebenes Array von Fließkommazahlen soll in der Kommandozeile Visualisiert werden.<br>
 * <ul>
 *     <li>Die Ausgabe soll ein definierte Anzahl von Spalten haben</li>
 *     <li>Der Wertebereich der Daten muss auf die Spalten angepasst werden</li>
 *     <li>Kommt ein umgerechneter Wert in einer Spalte öfter vor, so soll diese Spalte in mehreren Zeilen angezeigt werden.</li>
 * </ul>
 */
public class AufgabeHardcore {
    public static void main(String[] args) {
        float[] values = {1, 1, 1, 2, 2, 3, 4, 5, 5, 6, 7, 8, 9, 9, 9, 9, 10, 10};
        printValues(values, 10);
    }

    private static void printValues(float[] values, int fieldWidth) {
        System.out.println("----------\nxxxxxxxxxx\nxx  x   xx\nx       x \n        x ");
    }
}
