package Danny.loop;

public class Pi {


    public static void main(String[] args) {
        // write your code here

        double maxResult = 4;
        double minResult = 0;
        int teiler = 1;

        while (maxResult-minResult > 0.000001){
            maxResult = minResult + 4/(double)teiler;
            minResult = maxResult - 4/(double)(teiler + 2);
            teiler += 4;
        }
        System.out.println(minResult + " " + maxResult);

/*
        int Zahl = 4;
        double Teiler = 1.0;
        int counter = 0;

        while (counter <= 1) {
            double Formel1 = (Zahl / Teiler);
            Teiler = (Teiler + 2);
            double Formel2 = (Formel1 - (Zahl / Teiler));
            Teiler = (Teiler + 2);
            double Formel3 = (Formel2 + (Zahl / Teiler));
            counter = counter++;

            if (counter == 6) {
                System.out.println(Formel3);

            }


        }
*/

    }
}