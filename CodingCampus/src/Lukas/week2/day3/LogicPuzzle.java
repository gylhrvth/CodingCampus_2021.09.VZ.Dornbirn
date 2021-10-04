package Lukas.week2.day3;

public class LogicPuzzle {
    public static void main(String[] args) {
        //crazySumAndProduct(10); //(1 + 2 + 3 + 4 + 5) + (6 * 7 * 8 * 9 * 10) = 30255

        //Diese Methode soll eine Obergrenze als Parameter nehmen,
        //bis inklusive der Hälfte der Obergrenze summieren
        //ab exklusive der Hälfte der Obergrenze bis inklusive der Obergrenze soll das Produkt gebildet werden
        //der Rückgabewert soll die Summe plus das Produkt enthalten
        //crazySumAndProduct


        crazySumAndProduct(10);
    }

    public static void crazySumAndProduct(int upperLimit) {

        int x = 0;
        long y = 1;

        for (int i = 1; i <= upperLimit / 2; i++) {
            x += i;
        }
        for (int s = (upperLimit / 2) + 1; s <= upperLimit; s++) {
            y *= s;
        }
        long result = (x + y);
        System.out.println(result);
    }
}


