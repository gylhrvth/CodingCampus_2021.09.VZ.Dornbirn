package Stefan.Week1;

public class Schleifen {

    //Aufzählungen


    public static void main(String[] args) {
//        for (int a = 5, b = 2;b <= 10; b++){
//            System.out.println(a*b);
//        }



        //Pfeilspitze Variabel
        int width = 10;
        int height = 10;

        for (int a = 0; a < width; a++) {
            for (int b = 0; b < a; b++) {
                System.out.print("*");
            }
            System.out.println();
        }

//        for (int c = height; c > 0; c--) {
//            for  (int d = 0; d < c; d++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
    }
}
