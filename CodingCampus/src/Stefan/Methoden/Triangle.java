package Stefan.Methoden;

public class Triangle {
    public static void main(String[] args) {

        triangle(10);
    }

    //Methoden
    public static void triangle(int hight) {
        int upHeight = hight / 2;
        int lowHight = hight / 2;
        for (int a = 0; a < upHeight; a++) {
            for (int b = 0; b < a; b++) {
                System.out.print("*");
            }
            System.out.println();
        }

        int lowerHeight = hight - lowHight;
        for (int i = lowerHeight; i > 0; i--) {
            for (int a = 0; a < i; a++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
