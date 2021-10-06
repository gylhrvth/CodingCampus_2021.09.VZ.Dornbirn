package Lukas.week4.day3;

import java.util.Arrays;
import java.util.Random;

public class Sort {
    public static void main(String[] args) {
        int[] numbers = {2, 8, 4, 10, 20, 15, 25, 30, 40, -8};

        //egal
//        List<Integer> arr = new ArrayList<>();
//        for (int number : numbers) {
//            arr.add(number);
//        }
//        Collections.shuffle(arr);
//
//        for (int i = 0; i < arr.size(); i++) {
//            numbers[i] = arr.get(i);
//        }
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100) - 50;
        }
        //egal ende

        System.out.println("---Initial Array---");
        System.out.println(Arrays.toString(numbers));


        swap(0, 1, numbers);

        System.out.println("---Swap index 0 with 1---");
        System.out.println(Arrays.toString(numbers));


        //Jeder Durchlauf steht für eine eigene Schleife
        //[2, 8, 4, 10, 20, 15, 25, 30, 40, -8]
        //Erster Durchlauf
        //[2, 4, 8, 10, 15, 20, 25, 30, -8, 40]
        //Zweiter Durchlauf
        //[2, 4, 8, 10, 15, 20, 25, -8, 30, 40]
        //Dritter Durchlauf
        //[2, 4, 8, 10, 15, 20, -8, 25, 30, 40]
        //Vierter Durchlauf
        //[2, 4, 8, 10, 15, -8, 20, 25, 30, 40]
        //Fünfter Durchlauf
        //[2, 4, 8, 10, -8, 15, 20, 25, 30, 40]
        //Sechster Durchlauf
        //[2, 4, 8, -8, 10, 15, 20, 25, 30, 40]
        //Siebter Durchlauf
        //[2, 4, -8, 8, 10, 15, 20, 25, 30, 40]
        //Achter Durchlauf
        //[2, -8, 4, 8, 10, 15, 20, 25, 30, 40]
        //Neunter Durchlauf
        //[-8, 2, 4, 8, 10, 15, 20, 25, 30, 40]

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    swap(j, j + 1, numbers);
                }
            }
        }

        System.out.println("---Sorted array---");
        System.out.println(Arrays.toString(numbers));
    }

    private static void swap(int index1, int index2, int[] numbers) {
        int tmp = numbers[index2];
        numbers[index2] = numbers[index1];
        numbers[index1] = tmp;
    }
}
