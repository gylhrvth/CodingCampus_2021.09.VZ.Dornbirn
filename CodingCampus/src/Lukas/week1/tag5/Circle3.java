package Lukas.week1.tag5;

public class Circle3 {
    public static void main(String[] args) {
        int circleRadius = 25;

        for (int y = -circleRadius; y < circleRadius; y++) {
            for (int x = -circleRadius; x < circleRadius; x++) {
                double hypothenuse = Math.sqrt(x * x + y * y);
                if (hypothenuse < circleRadius) {
                    System.out.print('x');
                } else {
                    System.out.print(' ');
                }
            }
            System.out.println();
        }
    }
}
