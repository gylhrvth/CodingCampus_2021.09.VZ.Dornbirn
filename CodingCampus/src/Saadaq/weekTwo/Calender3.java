package Saadaq.weekTwo;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Calender3 {

    public static void main(String[] args) {

        java.util.GregorianCalendar today = new java.util.GregorianCalendar();
        java.util.GregorianCalendar firstDayOfMonth = new java.util.GregorianCalendar(
                today.get(Calendar.YEAR),
                today.get(Calendar.MONTH),
                1
        );

        int actualDayOfMonth = today.get(Calendar.DAY_OF_MONTH);
        int maxDays = today.getActualMaximum(Calendar.DAY_OF_MONTH);
        int offSet = firstDayOfMonth.get(Calendar.DAY_OF_WEEK) - 2;
        if (offSet < 0) {
            offSet += 7;



        }

        SimpleDateFormat sdf = new SimpleDateFormat("MMMM Y");
        String textDate = "| MO | DI | MI | DO | FR | SA | SO | " ;



    }


}
