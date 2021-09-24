package Saadaq.weekOne;

public class ForSchleifenPraktikum {

    public static void main(String[] args) {


        for (int counter = 1; counter <= 10; counter++) {
            System.out.println(counter);


        }

        int höhe = 10;
        int breite = 10;

        for (int counter = 0; counter < höhe; counter++) {

            if (counter == 0 || counter == höhe) {
                for (int withCounter = 0; withCounter <= breite; withCounter++) {
                    System.out.print("*");

                }

                System.out.println();
            } else {
                for (int withCounter = 0; withCounter <= breite; withCounter++) {
                    if (withCounter == 0 || withCounter == breite) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                    System.out.println();
                }


            }


        }
    }
}
