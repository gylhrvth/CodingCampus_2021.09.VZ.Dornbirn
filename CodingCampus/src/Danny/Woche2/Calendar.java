package Danny.Woche2;

public class Calendar {
    public static void main(String[] args) {


        calendar(31,2);

    }

    public static void calendar(int daysPerMonth, int startDay) {


        int aktuellerTag = 1;
        int daysPerMonthRest = daysPerMonth;


        System.out.println("| Mo | Di | Mi | Do | Fr | Sa | So |");


        for (int i = 1; i < startDay; i++) {
            System.out.print("|    ");
        }

        for (int x = startDay; x < daysPerMonth + startDay; x++) {
            if (x % 6 != 0) {
                if (aktuellerTag < 10) {
                    System.out.print("| 0" + aktuellerTag + " ");
                    aktuellerTag++;
                } else {
                    System.out.print("| " + aktuellerTag + " ");
                    aktuellerTag++;
                }
            } else {
                System.out.println("| WE | WE |");
                aktuellerTag += 2;
                daysPerMonth--;
            }
        }

        int rest = startDay + daysPerMonthRest;
        for (int x = 0; x <= (7 - (rest % 7)); x++) {
            System.out.print("|    ");
        }
        System.out.print("|");
    }

}
