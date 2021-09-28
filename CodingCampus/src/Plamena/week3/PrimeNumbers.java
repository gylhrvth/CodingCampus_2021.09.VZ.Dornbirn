package Plamena.week3;

public class PrimeNumbers {

    public static void main(String[] args) {


        int end = 50;
        for (int i = 2; i <= end; i++) {
            boolean primNumber = true;

            for (int j = 2; j < i && primNumber ; j++) {
                if(i%j== 0){
                    primNumber = false;
        //            System.out.println(i + " ist keine PrimZahl");
                }
            }

            if(primNumber){
                System.out.println(i + " ist eine PrimZahl");
            }

        }




    }
}
