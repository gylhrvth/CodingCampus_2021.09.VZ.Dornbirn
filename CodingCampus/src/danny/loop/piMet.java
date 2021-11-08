package danny.loop;

public class piMet {
    public static void main(String[] args) {

        int number = 4;
        double divisor = 1.0;


        for (int x = 0; x < 150; x++) {
            double ergebnis = (number / divisor) + (number / divisor + 2) - (number / divisor + 2);

        }

    }


}
