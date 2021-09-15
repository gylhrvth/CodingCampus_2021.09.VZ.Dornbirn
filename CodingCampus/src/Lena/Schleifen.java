package Lena;

public class Schleifen {

    public static void main(String[] args) {

        int row = 4;

        for (int i = 1; i <= 10; i++) {
            System.out.println(i * row);
        }


        for (int j = 0; j < 4; j++) {

            for (int k = 0; k < 5; k++) {
                System.out.print("X");
            }
            System.out.println();
        }


        int size = 9;
        boolean check = false;

        if (check == false) {
            for (int i = 1; i <= size; i++) {
                for (int l = 0; l < i; l++) {
                    System.out.print("*");

                    if (i == size) {
                        check = true;
                    }
                }
                System.out.println();
            }
            if (check == true) {
                for (int i = size - 1; i > 0; i--) {
                    for (int j = i; j > 0; j--) {
                        System.out.print("*");
                    }

                    System.out.println();

                }
            }


        }


        int high = 12;
        int highTribe = 3;
        int count = 1;

        for (int i = 1; i <= high; i++) {
//Baum
            if (i < (high - highTribe)) {

                for (int k = high - i; k >= 0; k--) {
                    System.out.print(" ");
                }
                for (int j = i; j < i + count; j++) {
                    System.out.print("X");

                }
                count += 2;
                System.out.println();
            }
//Christbaumkugeln
            if (i == (high - highTribe)) {
                for (int k = high - i; k >= 0; k--) {
                    System.out.print(" ");
                }
                for (int j = i; j < i + count; j+=2) {
                    System.out.print("* ");
                }
                count+=2;
                System.out.println();
            }
//Stamm
            if (i > (high - highTribe)) {
                for (int n = high - 2; n >= 0; n--) {
                    System.out.print(" ");
                }
                for (int j = 0; j < highTribe; j++) {
                    System.out.print("X");
                }
                System.out.println();


            }
        }
    }


}

