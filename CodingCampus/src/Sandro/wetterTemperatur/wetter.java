package Sandro.wetterTemperatur;

public class wetter {

    public static void main(String[] args) {

        /**
         *  Aufgabe: https://wiki.freitagsrunde.org/Javakurs/%C3%9Cbungsaufgaben/Wetterstation
         */

        int[] days = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
        int[] temperatures = {21, 12, 140, 150, 15, 160, 15, 180, 11, 800, 13, 1300, 15, 120000};

        getavgTemp(temperatures);
        getMin(temperatures);
        getMax(temperatures);
        getTheMostTemperatureChangeOfTwoConsecutivelyDays(days, temperatures);

    }

    public static void getavgTemp(int[] temp) {

        double sum = 0;
        for (double j : temp) {
            sum += j;
        }
        double avg = sum / temp.length;

        System.out.println(avg);
    }

    public static void getMin(int[] temp) {

        int min = temp[0];

        for (int i = 0; i < temp.length; i++) {
            if (min > temp[i]) {
                min = temp[i];
            }
        }
        System.out.println(min);
    }

    public static void getMax(int[] temp) {

        int max = temp[0];

        for (int i = 0; i < temp.length; i++) {
            if (max < temp[i]) {
                max = temp[i];
            }
        }
        System.out.println(max);
    }

    public static void getTheMostTemperatureChangeOfTwoConsecutivelyDays(int[] days, int[] temperatures) {

        int mostDifference = 0;
        int day1 = 0;
        int day2 = 0;


        for (int i = 0; i < temperatures.length - 1; i++) {
            if (temperatures[i] < temperatures[i + 1]) {
                int tmp = temperatures[i];
                temperatures[i] = temperatures[i + 1];
                temperatures[i + 1] = tmp;
            }
            for (int j = 0; j < temperatures.length - 1; j++) {

                if (temperatures[j] - temperatures[j + 1] > mostDifference) {
                    mostDifference = temperatures[j] - temperatures[j + 1];
                    day1 = days[j];
                    day2 = days[j + 1];
                    break;

                }
            }
        }
        System.out.println("Zwischen Tag " + day1 + " und Tag " + day2 + " besteht der größte Temperaturumschwung." + " Der Temperaturumschwung beträgt: " + mostDifference + " Grad Celsius");
    }
}