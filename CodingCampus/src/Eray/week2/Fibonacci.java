package Eray.week2;

public class Fibonacci {
    public static void main(String[] args) {

        System.out.println(rekursionCalculator(5));
        System.out.println(iterativCalculator(5));
    }



    public static int rekursionCalculator(int faktor) {

        // long Version
//        if(faktor == 1){
//            return 1;
//        }
//
//        return faktor * faktorCalculator(faktor -1);
//
        // short Version
        return faktor == 1 ? 1 : faktor * rekursionCalculator(faktor - 1);

    }

    public static int iterativCalculator(int faktor){
        int ergebnis = 1;

        for (int i = 1; i <= faktor ; i++) {
            ergebnis *= i;
        }
        return ergebnis;

    }

}
