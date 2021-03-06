package Bartosz.oldStuff.week2.calender;

public class dateAndWeekend {
    public static void main(String[] args) {

        int maxDays = 31;
        int offset = 0;



        weekDays.printWeekdays();
        System.out.println();

        for (int counterDays = 1; counterDays <= maxDays + offset; counterDays++) {

            if (counterDays - offset > 0) {  // Wenn Anfangsposition größer als 0 ist, gib zahlenZellen aus

                if (counterDays % 6 ==0) {
                    System.out.print("| WE ");
                }
                else if (counterDays % 7 == 0) {
                    System.out.print("| WE |");
                    System.out.println();
                }
                else {
                    if (counterDays < 10 + offset) {
                        System.out.print("|  " + (counterDays - offset) + " ");

                    } else {
                        if (counterDays == maxDays + offset) {
                            System.out.print("| " + (counterDays - offset) + " |");

                        } else {
                            System.out.print("| " + (counterDays - offset) + " ");
                        }
                    }


                    if (counterDays % 7 == 0) {
                        if (counterDays == maxDays + offset) {
                            System.out.println();

                        } else {
                            System.out.print("|");
                            System.out.println();
                        }
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
