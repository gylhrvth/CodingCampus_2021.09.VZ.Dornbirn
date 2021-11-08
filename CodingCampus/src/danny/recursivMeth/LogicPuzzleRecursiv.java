package danny.recursivMeth;

public class LogicPuzzleRecursiv {

    public static void main(String[] args) {
        //crazySumAndProduct(10) (1 + 2 + 3 + 4 + 5) + (6 * 7 * 8 * 9 * 10) = 30255

        //Diese Methode soll eine Obergrenze als Parameter nehmen,
        //bis inklusive der Hälfte der Obergrenze summieren
        //ab exklusive der Hälfte der Obergrenze bis inklusive der Obergrenze soll das Produkt gebildet werden
        //der Rückgabewert soll die Summe plus das Produkt enthalten
        //crazySumAndProduct

        int upperLimit = 10;
        int upperLimithalf = upperLimit / 2;
        int upperLimithalf1 = upperLimit - upperLimithalf + 1;

        result(additionRec(upperLimithalf), multiplikationRec(upperLimithalf1, upperLimit));
//        result(addition(upperLimithalf), multiplikation(upperLimithalf1, upperLimit));
    }

//    public static int addition(int upperLimit) {
//        int x = 0;
//        for (int i = 1; i <= upperLimit; i++) {
//            x += i;
//        }
//        return x;
//    }

    public static int additionRec(int upperLimit) {
        return upperLimit == 0 ? 0 : upperLimit + additionRec(upperLimit - 1);
    }

//    public static long multiplikation(int lowerLimit, int upperLimit) {
//        long y = 1;
//        for (int s = lowerLimit; s <= upperLimit; s++) {
//            y *= s;
//        }
//        return y;
//    }

    public static long multiplikationRec(int lowerLimit, int upperLimit) {
        return lowerLimit == upperLimit ? upperLimit : lowerLimit * multiplikationRec((lowerLimit) + 1, upperLimit);
    }


    public static void result(int x, long y) {
        long result = (x + y);
        System.out.println(result);

    }
}









