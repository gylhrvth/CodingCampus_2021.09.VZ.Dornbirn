package Zijad;

public class SchleifenBsp {

    public static void main(String[] args) {

        {
            for (int i = 0; i <= 20; i += 5)
                System.out.println("for" + i);


            int j = 0;
            while (j < 25) {
                j = j + 5;
                System.out.println("while" + j);


                for (int k = 1; k <= 20; k += 5)
                    System.out.println("XXXXX");


                int l = -1;
                while (l <= 3) {
                    l = l + 1;


                    for (int m = 0; m <= l; m++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }

                int p = 6;
                while (p >= 3) {
                    p = p - 1;

                    for (int o = 2; o <= p; o++) {
                        System.out.print("*");
                    }
                    System.out.println();

                }
            }
        }
    }

}