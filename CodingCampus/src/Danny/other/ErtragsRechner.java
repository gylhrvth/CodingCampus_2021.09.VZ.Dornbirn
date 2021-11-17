package Danny.other;

import java.text.DecimalFormat;

public class ErtragsRechner {

    public static void main(String[] args) {
        int kapitalGewinnVerhältniss = 200;
        int lotsGewinnVerhältniss = 3;
        int ertragProTagGewinnVerhältniss = 9;
        int ertragProLot = ertragProTagGewinnVerhältniss / lotsGewinnVerhältniss;
        int tradesPerMonth = 15;
        int tradesPerYaer = 10;
        int startKapital = 200;
        int profitAll = startKapital;
        int laufZeit = 8;

        calc(kapitalGewinnVerhältniss,ertragProTagGewinnVerhältniss,tradesPerMonth,tradesPerYaer, profitAll,lotsGewinnVerhältniss,ertragProLot,laufZeit, startKapital);

    }

    public static void calc(int kapitalGewinnVerhältniss, int ertragProTagGewinnVerhältniss, int tradesPerMonth,
                            int tradesPerYaer, int profitAll, int lots, int ertragProLot, int laufZeit,int startKapital ) {
        System.out.println("Startkapital " + startKapital + "€");
        DecimalFormat decimalFormat = new DecimalFormat("###,###,###");
        int lotAktuell = 30;
        for (int i = 1; i <= laufZeit; i++) {

            int profitPerYaer = ertragProTagGewinnVerhältniss * tradesPerMonth * tradesPerYaer;
            System.out.println("Gewinn Ende Jahr " + decimalFormat.format(profitPerYaer) + "€");
            System.out.println("mit " + (lotAktuell) + " Lots");
            profitAll += profitPerYaer;
            System.out.println(i + ". Jahr Gesammtgewinn " + decimalFormat.format(profitAll) + "€");
            int lotsNextYear = (profitAll * lots) / kapitalGewinnVerhältniss;
            if (lotsNextYear > 250) {
                lotsNextYear = 250;
            }

            lotAktuell = lotsNextYear;
            ertragProTagGewinnVerhältniss = lotsNextYear * ertragProLot;
            System.out.println("----------");



        }
    }
}