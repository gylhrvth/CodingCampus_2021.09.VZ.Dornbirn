package Bartosz.week2.calender;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class calendarGregorian {
    public static void main(String[] args) {

        weekDays.printWeekdays();

        GregorianCalendar today = new GregorianCalendar();
        GregorianCalendar firstDayOfMonth = new GregorianCalendar(
          today.get(Calendar.YEAR),
          today.get(Calendar.MONTH),
          1
        );

        int maxDays = today.getActualMaximum(Calendar.DAY_OF_MONTH);
        int offset = firstDayOfMonth.get(Calendar.DAY_OF_WEEK) - 2;
        if (offset < 0) {
            offset += 7;
        }


            for (int counterDays = 1; counterDays <= maxDays + offset; counterDays++) {

                if (counterDays - offset > 0) {  // Wenn Anfangsposition größer als 0 ist, gib zahlenZellen aus

                    if (counterDays < 10 + offset) {
                        System.out.print("|  " + (counterDays - offset) + " ");

                    } else {
                        if (counterDays == maxDays + offset)  {
                            System.out.print("| " + (counterDays - offset) + " |");

                        } else {
                            System.out.print("| " + (counterDays - offset) + " ");
                        }
                    }


                    if (counterDays % 7 == 0) {
                        if (counterDays == maxDays + offset)  {
                            System.out.println();

                        } else {
                            System.out.print("|");
                            System.out.println();
                        }
                    }

                } else {    // Wenn Anfangsposition kleiner als 0 ist, gib leerZellen aus
                    System.out.print("|  " + "  ");
                }

            }

            int missingSpaces = 7 - ((maxDays + offset) % 7);

            if (missingSpaces != 7) {
                for (int i = 0; i < missingSpaces; i++) {
                    System.out.print("    |");
                }
            }else {
                for (int i = 0; i < missingSpaces; i++) {
                    System.out.print("|    ");
                }
                System.out.println("|");
            }

        }

    }

