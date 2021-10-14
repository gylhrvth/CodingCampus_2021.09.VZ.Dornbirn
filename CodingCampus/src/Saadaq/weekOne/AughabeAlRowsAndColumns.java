
package Saadaq.weekOne;

public class AughabeAlRowsAndColumns {

    public static void main(String[] args) {


        // Output Star pyramid
        // first loop is for Horizontal





           for (int i=0; i<10; i++){
               for (int j=0; j<i; j++){
                   System.out.print("*");

               }

               System.out.println();
           }


                System.out.println("----------------");

            // Autput AAAAA
            //        AAAAA
        //            AAAAA
        //            AAAAA
        //            AAAAA

        // outer loop is for Horizontal
        // the innere loop is for Vertical.
           for (int i=0; i<5; i++){

               for (int j=0; j<5; j++){
                   System.out.print("A");
               }
               System.out.println();
           }





        int n = 10;
        for(int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }

            System.out.println();
        }



        int n1 = 5;

        for (int i = 1; i <= n1; i++) {
            for (int j = i; j <= n1; j++) {
                System.out.print("*");
            }

            System.out.println();



        }

        System.out.println("_____________________________ ");


        int n2 = 5;
        for (int i=1; i<=n; i++){
            for (int j=i; j<=n; j++){
                System.out.print(" ");
            }
            for (int k=1; k<=i; k++){
                System.out.print("*");
            }
            System.out.println();
        }

       // Autput  BBBBBB
      //          BBBBBB

        System.out.println("print B.....");

        for (int i=1; i<=2; i++){
            for (int k=1; k<=6; k++){
                System.out.print("B")  ;
            }
            System.out.println();
        }

        System.out.println("____________");

       //    it returns Decreasing  D from 5 to 1

        for (int i=1; i<=n; i++){

            for (int j=5; j>=i; j--){
                System.out.print("D");
            }
            System.out.println();
            System.out.println("____________");
        }

        // right side triangle

        int n5=5;

        for (int i=1; i<=n5; i++){
            for (int j=i; j<=n5; j++){
                System.out.print(" ");
            }
            for (int k=1; k<i; k++){
                System.out.print("*");
            }
            System.out.println();

        }



        // right sided Triangle increasing and decreasing



        int n6=5;
        for (int i=1; i<=n6; i++){
            for (int j=1; j<=i; j++){
                System.out.print("  ");
            }

            for (int m=i; m<=n6; m++){
                System.out.print("* ");
            }
            System.out.println();

        }



        System.out.println("...............");



        //   Hill Pattern

        int n7=5;

        for (int i=1; i<=n7; i++){
            for (int s=i;s<=n7; s++){
                System.out.print("  ");

            }
            for (int b=1;b<i; b++){
                System.out.print("* ");
            }
            for (int u=1; u<=i; u++){
                System.out.print("* ");
            }
            System.out.println( );
        }









    }







    }











