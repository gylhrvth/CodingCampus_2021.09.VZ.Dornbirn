package Plamena.week1;

public class PiCalculater {
    public static void main(String[] args) {

        float result = 0;
        float divident = 1;

        for (int i = 0; i < 5000; i++) {
            if (i%2 !=0){
                result -=4/divident;
            }else {
                result +=4/divident;
            }
            divident +=2;
        }
        System.out.println(result);
    }

}
