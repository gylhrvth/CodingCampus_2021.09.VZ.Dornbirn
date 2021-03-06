package Danny.other;

import java.text.DecimalFormat;

public class ErtragsRechner {

    public static void main(String[] args) {
        int startKapital = 200;
        int kapitalGewinnVerhältniss = startKapital;
        int factorBetrag = 200;
        int factorLots = 3;
        double factorErtragPerTag = 10;
        int lotsGewinnVerhältniss = (int) (startKapital / factorBetrag) * factorLots;
        double ertragProTagGewinnVerhältniss = (factorErtragPerTag / factorLots) * lotsGewinnVerhältniss;
        double ertragProLot = ertragProTagGewinnVerhältniss / lotsGewinnVerhältniss;
        int tradesPerMonth = 15;
        int tradesPerYaer = 10;
        int profitAll = startKapital;
        int laufZeit = 8;

        calc(kapitalGewinnVerhältniss, ertragProTagGewinnVerhältniss, tradesPerMonth, tradesPerYaer, profitAll, lotsGewinnVerhältniss, ertragProLot, laufZeit, startKapital, lotsGewinnVerhältniss);

    }

    public static void calc(int kapitalGewinnVerhältniss, double ertragProTagGewinnVerhältniss, int tradesPerMonth,
                            int tradesPerYaer, int profitAll, int lots, double ertragProLot, int laufZeit, int startKapital, int lotsGewinnVerhältniss) {
        System.out.println("\nStartkapital " + startKapital + "€\n");
        DecimalFormat decimalFormat = new DecimalFormat("###,###,###");
        int lotAktuell = lotsGewinnVerhältniss;
        for (int i = 1; i <= laufZeit; i++) {
            for (int j = 0; j < tradesPerYaer; j++) {
                int profitPerYaer = (int) ertragProTagGewinnVerhältniss * tradesPerMonth;
                System.out.println((j + 1) + ". Monat ");
                System.out.println("Gewinn Ende Monat " + decimalFormat.format(profitPerYaer) + "€");
                System.out.println("mit " + (lotAktuell) + " Lots");
                profitAll += profitPerYaer + 100;
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
}