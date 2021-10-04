package Saadaq.weekOne;

public class Methods {





        static void ChristBaumMethods(){
        int height = 50;
        //BaumKrone

        int stars = 1;
        int spaces = height - 1;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < spaces; j++) {
                System.out.println("  ");
            }
            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }
            stars += 2;
            spaces--;

        }
    }




    // Method is a block of code which only runs when it is called;
    static void HelloWorld() {
        System.out.println("I just got executed my first Method!");




        


    }


    public static void main(String[] args) {


        HelloWorld();

        ChristBaumMethods();



    }
}
