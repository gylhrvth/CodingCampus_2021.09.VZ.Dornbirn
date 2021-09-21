package Eray.week2;

public class NewCalendar {

    public static void main(String[] args) {
        PrintAllDays("Januar", 3);

    }

    public static void PrintAllDays(String month, int Startday) {
        PrintCalendarHead();


        for (int a = 1; a <= CheckMonths(month) + Startday; a++) {

            int StartDayCalculator = a - Startday;


            if (StartDayCalculator < 1) {
                System.out.print(String.format("|%3s ", ""));
            } else {

                System.out.print(String.format("|%3d ", a - Startday));
            }

            CheckIf7ModuloIs0(a);
        }


        int missingSpaces = 7 - ((CheckMonths(month) + Startday) % 7);

        for (int b = 0; b <= missingSpaces; b++) {
            System.out.print(String.format("|%3s ", ""));
        }

    }

    public static void CheckIf7ModuloIs0(int a) {
        if (a % 7 == 0) {
            System.out.println("|");
        }
    }

    public static void PrintCalendarHead() {
        System.out.println("| Mo | Di | Mi | Do | Fr | Sa | So |");
    }

    public static int CheckMonths(String month) {
        int days = 0;

        switch (month) {
            case "Januar":
                days = 31;
                break;
            case "Februar":
                days = 28;
                break;
            case "März":
                days = 31;
                break;
            case "April":
                days = 30;
                break;
            case "Mai":
                days = 31;
                break;
            case "Juni":
                days = 30;
                break;
            case "Juli":
                days = 31;
                break;
            case "August":
                days = 30;
                break;
            case "September":
                days = 31;
                break;
            case "Oktober":
                days = 30;
                break;
            case "November":
                days = 31;
                break;
            case "Dezember":
                days = 30;
                break;
        }
        return days;
    }
}
