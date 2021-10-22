package Saadaq.week1;

public class LoopsPractice {

    public static void main(String[] args) {

        // Question 1 for loop
    /*
        for(int i=1 ; i<= 10; i++){
            System.out.println(i);
        }

     */
        int sume = 0;
        for (int i = 1; i <= 10; i++) {
            sume += i;
            System.out.println("Sum: " + sume);
        }


    }
}
