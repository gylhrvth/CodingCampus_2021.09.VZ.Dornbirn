package Bartosz.projects.appointmentCalendar;

public class aCDayBuild {
    public static void main(String[] args) {


        System.out.println("---------------------------");

        for (int hours = 1; hours <= 24; hours++) {

            for (int cell1 = 0; cell1 < 1; cell1++) {

                if(hours < 10) {
                    System.out.println("0" + hours );
                } else {
                    System.out.println(hours);
                }
            }

            for (int spacer = 0; spacer < 1; spacer++) {
                System.out.println("---");
            }
        }
    }
}
