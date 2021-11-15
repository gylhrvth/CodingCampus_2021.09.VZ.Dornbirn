package Stefan.Week6;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class UebungenVonLukasCalendar {
    public static void main(String[] args) {


        Calendar calendar = new GregorianCalendar();


        //Tage im aktuellen Monat
        int days = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        System.out.println(days);



        //Ausgabe des Datums vom nächsten Sonntags
        nextSunday();

    }

    //Berrechnet das Datum des nächsten Sonntags
    public static void nextSunday () {
        System.out.println();
        LocalDate today = LocalDate.now();
        LocalDate nextSunday = today.with(TemporalAdjusters.next(DayOfWeek.SUNDAY));
        System.out.printf("Heute ist der %s. Der nächste Sonntag ist am %s", today, nextSunday);
        System.out.println();
    }

    public static void getSundays (int year, int month) {

    }
}
