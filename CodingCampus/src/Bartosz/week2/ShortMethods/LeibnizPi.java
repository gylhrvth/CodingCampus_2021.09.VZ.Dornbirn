package Bartosz.week2.ShortMethods;

public class LeibnizPi {
    public static void main(String[] args) {
        double maxResult = 4;
        double minResult = 0;
        double teiler = 1;

        while (maxResult-minResult > 0.00000001){       //Solange Ergebnis größer als _ ist
            maxResult = minResult + 4/teiler;              //minResult = 0 + 4 / 3  /
            minResult = maxResult - 4/(teiler + 2);        //maxResult = 4 - 3
            teiler += 4;
        }
        System.out.println((maxResult + minResult) / 2);
    }
}
