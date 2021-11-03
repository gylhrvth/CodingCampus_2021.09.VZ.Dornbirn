package Danny.woche8.day2.AufgabeDatenklasse;

import java.util.Random;

public class EcerciseDataclass {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbersArray = new int[10];
        for (int i = 0; i < numbersArray.length; i++) {
            numbersArray[i] = random.nextInt(100) - 50;
        }



    }

//    private static MinMaxAverrage getMinMaxAverage(int[] numbers) {
//        int minValue = numbers[0];
//        int maxValue = numbers[0];
//        double sum = 0;
////        for(int number :)
//
//    }

}
