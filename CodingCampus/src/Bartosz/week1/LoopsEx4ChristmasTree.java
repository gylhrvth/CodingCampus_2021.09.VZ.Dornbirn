package Bartosz.week1;

public class LoopsEx4ChristmasTree {
    public static void main(String[] args) {

        int counter = 0;
        int cols = 14;
        int baum = 1;
        int x = 1;

        while (counter < cols) {


            if (counter < 10) {
                for (int leer = 10; leer >= 0; leer -= 2) {
                    System.out.print(".");

                    for (; x == 10; x += 2) {
                        System.out.println("X");
                    }
                }
                System.out.println(".");


                counter++;
                cols --;
            }
        }


    }


}

