package Eray.week1;

public class Circle {
    public static void main(String[] args) {
      PrintCircle(10);
    }

    public static void PrintCircle(int radius) {
        for (int i = (-1) * radius; i <= radius; i++) {
            for (int j = (-1) * radius; j <= radius; j++) {
                if(Math.pow(i,2) + Math.pow(j,2) <= Math.pow(radius,2)){
                    System.out.print(" o ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
