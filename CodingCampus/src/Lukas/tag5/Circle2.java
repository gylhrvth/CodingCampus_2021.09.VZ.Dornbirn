package Lukas.tag5;

import java.util.Arrays;

public class Circle2 {
    public static void main(String[] args) {
        int circleRadius = 25;
        int circleRadiusY = (int) (circleRadius * 0.388);

        char[][] arr = new char[circleRadiusY * 2 + 1][circleRadius * 2 + 1];
        for(char[] tmp : arr) {
            Arrays.fill(tmp, ' ');
        }

        System.out.println("------------------------------------------------");
        for (int i = 0; i < 360; i++) {
            double rad = Math.toRadians(i);
            //Translate to positive range
            double xNew = Math.cos(rad) * circleRadius + circleRadius;
            double yNew = Math.sin(rad) * circleRadiusY + circleRadiusY;
            arr[(int) yNew][(int) xNew] = '*';
        }
        for (char[] tmp : arr) {
            for (char c : tmp) {
                System.out.print(c);
            }
            System.out.println();
        }
        System.out.println("------------------------------------------------");
    }
}
