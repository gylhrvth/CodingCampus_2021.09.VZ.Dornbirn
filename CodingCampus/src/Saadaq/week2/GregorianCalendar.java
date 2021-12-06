package Saadaq.week2;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class GregorianCalendar {
    public static void main(String[] args) {







                java.util.GregorianCalendar today = new java.util.GregorianCalendar();
                java.util.GregorianCalendar firstDayOfMonth = new java.util.GregorianCalendar(
                        today.get(java.util.Calendar.YEAR),
                        today.get(java.util.Calendar.MONTH),
                        1);

                int actualDayOfMonth = today.get(java.util.Calendar.DAY_OF_MONTH);
                int maxDays = today.getActualMaximum(java.util.Calendar.DAY_OF_MONTH);
                int offset = firstDayOfMonth.get(Calendar.DAY_OF_WEEK) - 2;
                if (offset < 0) {
                    offset += 7;
                }

                SimpleDateFormat sdf = new SimpleDateFormat("MMMM Y");
                String textDate = sdf.format(today.getTime());
                String headerText = "| Mo | Di | Mi | Do | Fr | Sa | So |";

                System.out.println(" ".repeat((headerText.length() - textDate.length())/2) + textDate);
                System.out.println(headerText);


                for (int i = 0; i < offset; i++) {
                    System.out.print("|    ");
                }
                for (int i = 1; i <= maxDays; i++) {
                    if (i == actualDayOfMonth){
                        System.out.print("|*");
                    } else {
                        System.out.print("| ");
                    }
                    System.out.printf("%2d ", i);

                    if ((offset + i) % 7 == 0) {
                        System.out.println("|");
                    }
                }
                int restDaysOfMonth = offset + maxDays;
                if (restDaysOfMonth % 7 != 0) {
                    while (restDaysOfMonth % 7 != 0) {
                        ++restDaysOfMonth;
                        System.out.print("|    ");
                    }
                    System.out.println("|");



                }

        System.out.printf("'%15s' %n", "baeldung");

    }
        }








