package Danny.Woche1;

public class Kreis {
    public static void main(String[] args) {
        circle(8);
    }

    public static void circle(int circleRadius) {
        int circleHigh = circleRadius * 2 + 1;
        int b = circleRadius;
        int kor = 3;

        for (int x = 0; x < circleHigh; x++) {
            for (int y = -circleRadius * kor; y < circleRadius * kor + 1; y++) {
                double cQ = circleRadius * circleRadius;
                double bQ = b * b;
                double circlePoint = Math.sqrt(cQ - bQ) * kor;
                int cP = (int) Math.round(circlePoint);
                if (y == cP || y == -cP) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            b--;
            System.out.println();
        }
    }
}
