package Danny.other;

import java.text.DecimalFormat;

public class BerechnungLaufzeit {

    public static void main(String[] args) {

        int startmoney = 2000;
        double profitPerDayStart = 3.73;
        int lots = 3;
        int profitPerYaer = 0;
        int tradeDaysPermonth = 15;
        int tradeMonthpPerYaer = 10;
        int countYears = 15;
        profitCalc(startmoney, countYears, profitPerDayStart, tradeDaysPermonth, tradeMonthpPerYaer,profitPerYaer,lots);
    }

    public static void profitCalc(int startmoney, int countYears, double profitPerDayStart, int tradeDaysPermonth, int tradeMonthpPerYaer, int profitPerYaer,int lots) {

        System.out.println("Startkapital " + startmoney + "€");
        DecimalFormat decimalFormat = new DecimalFormat("###,###,###");


        for (int i = 1; i <= countYears; i++) {
            profitPerDayStart = ((lots/3)*3.73);
            profitPerYaer = (int) (tradeDaysPermonth * profitPerDayStart * tradeMonthpPerYaer);
            System.out.println(i + " Jahr Profit " + decimalFormat.format(profitPerYaer) + "€");
            int profitPerDayNExtYaer = (int) (profitPerDayStart*(profitPerYaer+startmoney)/startmoney);
            int aktuellLots = (int) ((profitPerDayNExtYaer / profitPerDayStart) * lots);
            lots = aktuellLots;
            if (lots > 250) {
                lots = 250;
            }
            System.out.println(lots + " Lots");
            profitPerDayStart = profitPerDayNExtYaer;
            startmoney += profitPerYaer;
            System.out.println("Gesammt " + decimalFormat.format(startmoney) + "€\n");



        }
    }
}
