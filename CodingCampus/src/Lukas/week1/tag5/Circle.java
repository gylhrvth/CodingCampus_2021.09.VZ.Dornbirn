package Lukas.week1.tag5;

public class Circle {
    public static void main(String[] args) {
        int circleRadius = 25;
        int circleRadiusY = (int) (circleRadius * 0.388);

        System.out.println("------------------------------------------------");
        for (int y = 0; y < circleRadiusY * 2; y++) {
            for (int x = 0; x < circleRadius * 2; x++) {
                boolean inCircle = false;
                for (int i = 0; i < 360; i++) {
                    double rad = Math.toRadians(i);
                    //Translate to positive range
                    double xNew = Math.cos(rad) * circleRadius + circleRadius;
                    double yNew = Math.sin(rad) * circleRadiusY + circleRadiusY;
                    if (x == (int) xNew && y == (int) yNew) {
                        inCircle = true;
                        break;
                    }
                }
                if (inCircle) {
                    System.out.print('*');
                } else {
                    System.out.print(' ');
                }
            }
            System.out.println();
        }
        System.out.println("------------------------------------------------");
    }
}
