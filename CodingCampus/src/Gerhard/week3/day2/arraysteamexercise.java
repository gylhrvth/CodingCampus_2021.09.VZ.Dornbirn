package Gerhard.week3.day2;


import java.util.Random;

public class arraysteamexercise {


    public static Random rnd = new Random();


    public static void main(String[] args) {


        int[] anArray = new int[20];

        Random rand = new Random();
        for (int i = 0; i < 20; i++) {
            anArray[i] = rand.nextInt();
        }
        System.out.println(anArray);
    }

}


