package Danny.other;

import java.text.DecimalFormat;

public class ErtragsRechner {

    public static void main(String[] args) {
        int startKapital = 200;
        int lots = 3;
        int ertragProTag = 9;
        int ertragProLot = ertragProTag / lots;
        int tradesPerMonth = 15;
        int tradesPerYaer = 10;
        int profitAll = startKapital;
        int laufZeit = 10;

        calc(startKapital,ertragProTag,tradesPerMonth,tradesPerYaer, profitAll,lots,ertragProLot,laufZeit);

    }

    public static void calc(int startKapital, int ertragProTag, int tradesPerMonth,
                            int tradesPerYaer, int profitAll, int lots, int ertragProLot, int laufZeit) {
        System.out.println("Startkapital " + startKapital + "€");
        DecimalFormat decimalFormat = new DecimalFormat("###,###,###");
        int lotAktuell = 3;
        for (int i = 1; i <= laufZeit; i++) {

            int profitPerYaer = ertragProTag * tradesPerMonth * tradesPerYaer;
            System.out.println("Gewinn im Jahr " + decimalFormat.format(profitPerYaer) + "€");
            profitAll += profitPerYaer;
            System.out.println(i + " Jahr Gesammtgewinn " + decimalFormat.format(profitAll) + "€");
            int lotsNextYear = (profitAll * lots) / startKapital;
            if (lotsNextYear > 250) {
                lotsNextYear = 250;
            }
            System.out.println("mit " + (lotAktuell) + " Lots");
            lotAktuell = lotsNextYear;
            ertragProTag = lotsNextYear * ertragProLot;
            System.out.println("----------");



        }
    }
}