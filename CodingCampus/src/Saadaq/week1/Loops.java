package Saadaq.week1;

public class Loops {

    public static void main(String[] args) {

        // incrementing up to 10 using while loop

        int a = 1;

        while (a <= 10) {
            System.out.println(a);
            a++;
        }
        // while loop decrementing
        int b = 10;

        while (b >= 1) {
            System.out.println(b);
            b--;
        }

        // using for loop simple one

        for (int i = 1; i <= 20; i++) {
            for (int c = 1; c <= i; c++)
                System.out.print(+i);

        }
        System.out.println("");

        System.out.println("______________________");
        {

        }

        // simple for loop count down from 10 to 0 and  prints println" some thing" to the console

        for (int n = 3; n > 0; n--) {
            System.out.println(n);
        }

        System.out.println("Take off");
        {

            for (int i = 10; i > 0; i--) {
                System.out.println(i);

            }
            System.out.println("print what you wanted here after the first loop");

            {
                // for loop to INCREMENT and DECREMENT more then ONE!.
                // += 2; is like increment 2x per round
                // -= 2; is like decrement 2  per round
                // /= 2; is like divide    2 each round
                // *= 2; is like multiply  2 each round;


                for (int i = 2; i <= 8; i += 2){
                    System.out.print(i+", ");
                }
                System.out.println("Who do we appreciate?");

            }








        }


    }

    // while loop for practice


}




