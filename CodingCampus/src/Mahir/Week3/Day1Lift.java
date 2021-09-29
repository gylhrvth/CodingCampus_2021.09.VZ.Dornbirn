package Mahir.Week3;

import java.util.Arrays;
import java.util.Random;

public class Day1Lift {
    public static Random rnd = new Random();
    public static void main(String[] args) {
        int totalWeight = 0;
        int[] weight = {100,85,77,93,64,83,108,55,94,150,82,63,57,99,70};

        for (int i = 0; i < weight.length;i ++){
            totalWeight += weight[i];
        }
        System.out.println(Arrays.toString(weight));
        System.out.println(totalWeight);

        int lenghtOfArray = 15;
        int[] weight2 = new int[lenghtOfArray];
        int totalKg = 0;
        int maxweight = 1600;

        for (int i = 0; i <weight2.length; i++) {
            weight2[i] = rnd.nextInt(150);
            totalKg += weight2[i];
            if (totalKg > maxweight){
                weight2[i] = totalKg;
            }
        }
        if (totalKg > maxweight){
            System.out.println(Arrays.toString(weight2));
            System.out.println(totalKg - maxweight + " Kg  over max weightt");
        }else{
            System.out.println(Arrays.toString(weight2));
            System.out.println(maxweight - totalKg + " Kg  left weight");
        }


    }





    }






