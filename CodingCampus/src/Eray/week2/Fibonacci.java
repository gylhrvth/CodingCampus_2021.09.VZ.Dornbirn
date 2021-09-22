package Eray.week2;

public class Fibonacci {
    public static void main(String[] args) {

        System.out.println(faktorCalculator(5));
    }



    public static int faktorCalculator(int faktor) {

        // long Version
//        if(faktor == 1){
//            return 1;
//        }
//
//        return faktor * faktorCalculator(faktor -1);
//
        // short Version
        return faktor == 1 ? 1 : faktor * faktorCalculator(faktor - 1);

    }

}
