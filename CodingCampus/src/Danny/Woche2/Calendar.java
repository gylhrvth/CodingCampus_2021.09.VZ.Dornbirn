package Danny.Woche2;

public class Calendar {
    public static void main(String[] args) {

        System.out.println("| Mo | Di | Mi | Do | Fr | Sa | So |");
        int daysPerMonth = 31;
        int startDay = 3;


        startPoint(startDay);
        days(daysPerMonth, startDay);
        rest(daysPerMonth);

    }

    public static void startPoint(int startDay) {

        for (int i = 1; i < startDay; i++) {
            System.out.print("|    ");
        }
    }


    public static void days(int daysPerMonth, int startDay) {
        for (int x = startDay; x <= daysPerMonth; x++) {

                if (x < 10)
                    if (x % 7 != 0) {
                        System.out.print("| 0" + x + " ");
                    } else {
                        System.out.print("| WE ");
                        System.out.print("|");
                        System.out.println();

                    }


                if (x >= 10)
                    if (x % 7 != 0) {
                        System.out.print("| " + x + " ");
                    } else {
                        System.out.print("| WE ");
                        System.out.print("|");
                        System.out.println();
                    }
            }
        }



    public static void rest(int daysPerMonth) {
        int y = daysPerMonth % 7;
        int z = 7 - y;
        for (int i = 0; i < z; i++) {
            System.out.print("|    ");
        }
        System.out.print("|");
    }


}
