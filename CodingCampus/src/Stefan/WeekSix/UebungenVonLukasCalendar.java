package Stefan.WeekSix;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class UebungenVonLukasCalendar {
    public static void main(String[] args) {

//        Calendar calendar = new GregorianCalendar();
//        int date = calendar.get(Calendar.DATE);
//        int month = calendar.get(Calendar.MONTH);
//        int year = calendar.get(Calendar.YEAR);
//        int sonntag = calendar.get(Calendar.SUNDAY);
//        System.out.println(date + "." + month + "." + year + ". " + sonntag);


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
}
