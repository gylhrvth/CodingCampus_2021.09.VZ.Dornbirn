package Oemer.Week1;

public class Tag2Zahlen {
    public static void main(String[] args) {

        byte byteNumber1 = 120;
        byte byteNumber2 = 6;

        byte ergebnisByte = (byte) (byteNumber1 - byteNumber2);

        short shortNumber1 = 5000;
        short shortNumber2 = 9000;

        short ergenisShort = (short) (shortNumber1 - shortNumber2);

        int intNumber1 = 100000;
        int intNumber2 = 200000;

        int ergbnisInt = intNumber1 * intNumber2;

        long longNumber1 = 1500000000L;
        long longNumber2 = 2000000000L;

        long ergebnisLong = longNumber1 + longNumber2;

        float floatNumber1 = 1.69F;
        float floatNumber2 = 6.56F;

        float ergebnisFloat = floatNumber1 / floatNumber2;

        double doubleNumber1 = 22.66D;
        double doubleNumber2 = 66.78D;

        double ergebnisDouble = doubleNumber1 % doubleNumber2;

        System.out.println(ergebnisByte);
        System.out.println(ergenisShort);
        System.out.println(ergbnisInt);
        System.out.println(ergebnisLong);
        System.out.println(ergebnisFloat);
        System.out.println(ergebnisDouble);


    }
}