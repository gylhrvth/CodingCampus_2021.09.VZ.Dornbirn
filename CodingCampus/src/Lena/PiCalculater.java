package Lena;

public class PiCalculater {
    public static void main(String[] args) {

        int divisor = 1;
        double pi = 0.0;
        int n = 4;

        while (divisor <= 15000000) {
            pi = pi + (double) n / (double) divisor;
            pi = pi - (double) n / (double) (divisor + 2);
            divisor = divisor + 4;
            System.out.println(pi);
        }

    }
}
