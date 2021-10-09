package Saadaq.weekOne;

public class StarPattern {


    public static void main(String[] args) {


        for (int i = 1; i<10;   i++ ) {
            if(i>=1){
                System.out.println(" ");
            }else
            for (int k = 1; k< i+1; k++) {
                System.out.print(" ");

            }

            for (int j = 1; j < i; j++) {
                for (int l = 0; l >i+1; l--) {
                    System.out.print("*");

                }
                System.out.print("*");
            }

            System.out.println();


        }

    }
}
