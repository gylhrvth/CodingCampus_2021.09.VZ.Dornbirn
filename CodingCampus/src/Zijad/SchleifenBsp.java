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


            }
        }
    }
}

