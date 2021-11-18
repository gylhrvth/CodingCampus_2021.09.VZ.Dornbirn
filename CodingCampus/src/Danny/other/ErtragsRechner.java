package Danny.other;

import java.text.DecimalFormat;

public class ErtragsRechner {

    public static void main(String[] args) {
        int startKapital = 200;
        int kapitalGewinnVerhältniss = startKapital;
        int factorBetrag = 200;
        int factorLots = 3;
        int factorErtragPerTag = 15;
        int lotsGewinnVerhältniss = (startKapital/factorBetrag)*factorLots;
        int ertragProTagGewinnVerhältniss = (factorErtragPerTag/factorLots)*lotsGewinnVerhältniss;
        int ertragProLot = ertragProTagGewinnVerhältniss / lotsGewinnVerhältniss;
        int tradesPerMonth = 15;
        int tradesPerYaer = 10;
        int profitAll = startKapital;
        int laufZeit = 8;

        calc(kapitalGewinnVerhältniss,ertragProTagGewinnVerhältniss,tradesPerMonth,tradesPerYaer, profitAll,lotsGewinnVerhältniss,ertragProLot,laufZeit, startKapital,lotsGewinnVerhältniss);

    }

    public static void calc(int kapitalGewinnVerhältniss, int ertragProTagGewinnVerhältniss, int tradesPerMonth,
                            int tradesPerYaer, int profitAll, int lots, int ertragProLot, int laufZeit,int startKapital,int lotsGewinnVerhältniss ) {
        System.out.println("\nStartkapital " + startKapital + "€\n");
        DecimalFormat decimalFormat = new DecimalFormat("###,###,###");
        int lotAktuell = lotsGewinnVerhältniss;
        for (int i = 1; i <= laufZeit; i++) {

            int profitPerYaer = ertragProTagGewinnVerhältniss * tradesPerMonth * tradesPerYaer;
            System.out.println(i + ". Jahr " );
            System.out.println("Gewinn Ende Jahr " + decimalFormat.format(profitPerYaer) + "€");
            System.out.println("mit " + (lotAktuell) + " Lots");
            profitAll += profitPerYaer;
            System.out.println("Gesammtgewinn " + decimalFormat.format(profitAll) + "€");
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