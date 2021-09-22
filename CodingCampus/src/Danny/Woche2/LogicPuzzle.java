package Danny.Woche2;

public class LogicPuzzle {

    public static void main(String[] args) {
        //crazySumAndProduct(10) (1 + 2 + 3 + 4 + 5) + (6 * 7 * 8 * 9 * 10) = 30255

        //Diese Methode soll eine Obergrenze als Parameter nehmen,
        //bis inklusive der Hälfte der Obergrenze summieren
        //ab exklusive der Hälfte der Obergrenze bis inklusive der Obergrenze soll das Produkt gebildet werden
        //der Rückgabewert soll die Summe plus das Produkt enthalten
        //crazySumAndProduct

        int upperLimit = 10;
        result(addition(upperLimit), multiplikation(upperLimit));
    }

    public static int addition(int upperLimit) {
        int x = 0;
        for (int i = 1; i <= upperLimit / 2; i++) {
            x += i;
        }
        return x;
    }

    public static long multiplikation(int upperLimit) {
        long y = 1;
        for (int s = (upperLimit / 2) + 1; s <= upperLimit; s++) {
            y *= s;
        }
        return y;
    }

    public static void result(int x, long y) {
        long result = (x + y);
        System.out.println(result);

    }
}









