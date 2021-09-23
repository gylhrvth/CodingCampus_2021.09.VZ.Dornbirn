package Ingo.week2;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class IngoKalender {
    public static void main(String[] args) {
        GregorianCalendar gc = new GregorianCalendar();
        System.out.println(gc);
        System.out.println(gc.get(Calendar.YEAR));
        System.out.println(gc.get(Calendar.MONTH));
        System.out.println(gc.get(Calendar.DAY_OF_MONTH));

        int currentDayOfMonth = gc.get(Calendar.DAY_OF_MONTH);
        int lastDayOfMonth = gc.getActualMaximum(Calendar.DAY_OF_MONTH);


        System.out.println("|  MO |  DI |  MI |  DO |  FR |  SA |  SO |");
        //       System.out.print("|   ");                       ****
        for (int calc = 1; calc <= lastDayOfMonth; calc++) {
            System.out.print("  " + calc);
        }


//            System.out.printf("| %s%2d", (calc == currentDayOfMonth ? "*" : " "), calc);    ***
//            if (calc == currentDayOfMonth) {
//                System.out.print("| *");
//            } else {
//                System.out.print("|  ");
//            }
//            System.out.printf("%2d ", calc);
//            if (calc % 7 == 0){
//                System.out.println("|");
//            }
//           System.out.print("|   ");       ***
//        }
//        System.out.println();
//        System.out.print(currentDayOfMonth + "*");   ****
//
///*        int kalenderHoehe = 5;
//        int kalaenderBreite = 7;
//        int day = 1;
//        for (int a = 0; a < kalenderHoehe; a++) {
//           for (int b = 1; b <= 7; b++) {
//               System.out.print(" |  "+day);
//               day++;
//           }
//           System.out.println("|");
//*/
//        }
//        for (int calc = 1; calc <= lastDayOfMonth; calc++) {
//        System.out.print();
//    }


    }
}

