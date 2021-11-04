package Lena.FirstObjects.MinMaxAvg;

import Lena.FirstObjects.MinMaxAvg.MinMaxAvg;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int [] source = new int [] {3,5,2,7,1345,7,13};

        Random random = new Random();
        int [] randomSource = new int [100];

        for (int i = 0; i < randomSource.length; i++) {
            randomSource[i]=random.nextInt(500)-250;

        }
        MinMaxAvg minMaxAvg = new MinMaxAvg(randomSource);
        minMaxAvg.getMinMaxAvg();

        System.out.println(minMaxAvg);


    }
}
