package Eray.week2;

public class Calendar {
    public static void main(String[] args) {
        //Write a Month from Januar to Dezember and set the Start Day! :)

        AutoDaysFill("Januar", 2);

    }


    public static void AutoDaysFill(String month, int startDay) {
        DaysHead();
        int overAll = 1;
        for (int i = 1; i <= CheckMonth(month) + startDay; i++) {


            if (i - startDay > 0) {
                if(overAll % 6 == 0 || overAll % 7 == 0){
                    System.out.print(String.format("|%3s ", "WE"));
                }else {
                    if (i < 10) {

                        System.out.print(String.format("|%3d ", i - startDay));

                    } else {
                        System.out.print(String.format("|%3d ", i - startDay));

                    }
                }
            } else {
                System.out.print(String.format("|%3s ", ""));
            }

            CheckIfModulo7isZero(i);
            overAll++;
            if (i % 7 == 0) {
                overAll = 1;
            }

        }


        int missing = 7 - ((CheckMonth(month) + startDay) % 7);

        for (int k = 0; k < missing; k++) {
            System.out.print(String.format("|%3s ", ""));
        }
        System.out.print(String.format("|%3s ", ""));

    }


    public static void CheckIfModulo7isZero(int i) {
        if (i % 7 == 0) {
            System.out.println("|");
        }

    }

    public static void DaysHead() {
        System.out.println("| Mo | Di | Mi | Do | Fr | Sa | So |");
    }

    public static int CheckMonth(String month) {

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

            default:
                System.out.println("Gebe einen Monat ein");
                break;


        }
        return days;
    }
}
