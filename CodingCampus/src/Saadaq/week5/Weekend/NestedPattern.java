package Saadaq.week5.Weekend;

public class NestedPattern {
    public static void main(String[] args) {

        int n2= 10;

        for(int i=0; i<10; i++){
            for(int j=0; j<10 -i;j++){
                System.out.print(" ");
                for(int k=0; k<(2 * i +1); k++){
                    System.out.print("*");
                System.out.println();
                }
            }
        }






















       /* int n=20;

        for(int i=1; i<=n;i++){

            for(int j=i;j<=n;j++){
                System.out.print("  ");
            }
            for (int k=1; k<i;k++){
                System.out.print("* ");
            }

            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }


            System.out.println();
        }*/




    }//End of Main
}//End of Class
