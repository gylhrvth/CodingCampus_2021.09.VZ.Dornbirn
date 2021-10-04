package Eray.week2;

public class PrimZahlen {
    public static void main(String[] args) {

      int end = 100;

        for (int i = 0; i <= end ; i++) {
            boolean primNumber = true;

            for (int j = 2; j < i && primNumber; j++) {

                if(i%j == 0){
                    primNumber = false;
                }

            }
            if(primNumber){
                System.out.println(i + " ist eine PrimZahl");
            }
        }


    }


}
