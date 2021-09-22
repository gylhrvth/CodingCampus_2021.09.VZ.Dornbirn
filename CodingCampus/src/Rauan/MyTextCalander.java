package Rauan;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class MyTextCalander {
    public static void main(String[] args) {
        GregorianCalendar today = new GregorianCalendar();
        GregorianCalendar firstDayOfMonth = new GregorianCalendar(
            today.get(Calendar.YEAR),
            today.get(Calendar.MONTH),
            1
        );

        int offset = (firstDayOfMonth.get(Calendar.DAY_OF_WEEK) + 5) % 7;
        int maxDays = today.getActualMaximum(Calendar.DAY_OF_MONTH);

        SimpleDateFormat sdf = new SimpleDateFormat("d MMMM Y");
        System.out.println(sdf.format(today.getTime()));

        System.out.println("| MO | DI | MI | DO | FR | SA | SO |");
        for (int j = 0; j < offset; j++) {
            System.out.print("|    ");
        }
        for (int i = 1; i <= maxDays; i++) {
            if (i == today.get(Calendar.DAY_OF_MONTH)){
                System.out.print("|*");
            } else {
                System.out.print("| ");
            }
            System.out.printf("%2d ", i);
            if ((offset + i) % 7 == 0){
                System.out.println("|");
            }
        }
    }
}


