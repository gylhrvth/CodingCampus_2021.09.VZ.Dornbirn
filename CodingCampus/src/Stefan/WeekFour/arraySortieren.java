package Stefan.WeekFour;

import java.util.Arrays;

public class arraySortieren {
    public static void main(String[] args) {
        int[] sortZahlen = {5, -2, 3, -9, 10, 4, 8, 12, 6, -13};
        System.out.println("Inhalt des Arrays: ");
        System.out.println(Arrays.toString(sortZahlen));
        System.out.println();

        parameterZahlen(sortZahlen);
        System.out.println("Zahlen sind aufsteigen sortiert: ");
        System.out.println(Arrays.toString(sortZahlen));
        System.out.println();

        parameterZahlenAb(sortZahlen);
        System.out.println("Zahlen sind absteigend sortiert: ");
        System.out.println(Arrays.toString(sortZahlen));
        System.out.println();

        absolutBetrag(sortZahlen);
        System.out.println("Zahlen sind nach Absolutwert sortiert: ");
        System.out.println(Arrays.toString(sortZahlen));

    }


    //Aufsteigend Sortiert
    public static void parameterZahlen (int[] parameter) {
        for (int i = 0; i < parameter.length; i++) {
            for (int j = 0; j < parameter.length - i - 1; j++) {
                if (parameter[j] > parameter[j + 1]) {
                    int tempo = parameter[j];
                    parameter[j] = parameter[j + 1];
                    parameter[j + 1] = tempo;
                }
            }
        }
    }


    //Absteigend Sortiert
    public static void parameterZahlenAb (int[] parameter) {
        for (int i = 0; i < parameter.length; i++) {
            for (int j = 0; j < parameter.length - i - 1; j++) {
                if (parameter[j] < parameter[j + 1]) {
                    int tempo = parameter[j];
                    parameter[j] = parameter[j + 1];
                    parameter[j + 1] = tempo;
                }
            }
        }
    }


    //Absteigend Sortiert Absolutwert
    public static void absolutBetrag (int[] parameter) {
        for (int i = 0; i < parameter.length; i++) {
            for (int j = 0; j < parameter.length - i - 1; j++) {
                if (Math.abs(parameter[j]) > Math.abs(parameter[j + 1])) {
                    int tempo = parameter[j];
                    parameter[j] = parameter[j + 1];
                    parameter[j + 1] = tempo;
                }
            }
        }
    }
}
