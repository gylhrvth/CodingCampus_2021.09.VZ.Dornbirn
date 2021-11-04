package Plamena.week8.dataCalc;

import java.util.Random;

public class Data {
    public static void main(String[] args) {
        Random rn = new Random();
        int[] data = new int[20];

        for (int i = 0; i < data.length; i++) {
            data[i] = rn.nextInt(100)-50;
        }
    }

    private static MinMaxAvrg getMinMaxAvrg(int[] data){
        int min = data[0];
        int max = data[0];
        float sum = 0;

        for (int entry:data) {
            if(min > entry){
                min = entry;
            }
            if(max < entry){
                max = entry;
            }
            sum += entry;
        }
        float avrg = sum/data.length;
        return new MinMaxAvrg(min,max,avrg);
    }
}
