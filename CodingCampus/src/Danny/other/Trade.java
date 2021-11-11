package Danny.other;

import java.text.DecimalFormat;

public class Trade {
    public static void main(String[] args) {

        int startmoney = 5000;
        int profitDax5YearWith7Lots = 42475;
        int profit1JWith1Lot = (profitDax5YearWith7Lots / 5) / 7;
        int price1Lot = 774;
        int countYears = 15;
        profitCalc(startmoney,countYears,price1Lot,profit1JWith1Lot);
    }

    public static void profitCalc(int startmoney, int countYears,int price1Lot, int profit1JWith1Lot) {

        System.out.println("Startkapital " + startmoney + "€");
        DecimalFormat decimalFormat = new DecimalFormat("###,###,###");
        for (int i = 1; i <= countYears; i++) {
            int lotsForThisYear = startmoney / price1Lot;
            if (lotsForThisYear > 300) {
                lotsForThisYear = 300;
            }
            int endProfit = startmoney + profit1JWith1Lot * lotsForThisYear;
            System.out.println(i + " Jahr " + decimalFormat.format(endProfit) + "€");
            System.out.println("mit " + lotsForThisYear +" Lots");
            System.out.println("Gewinn im Jahr " + decimalFormat.format((endProfit-startmoney)) + "€");
            System.out.println("----------");
            startmoney = endProfit;


        }
    }
}
