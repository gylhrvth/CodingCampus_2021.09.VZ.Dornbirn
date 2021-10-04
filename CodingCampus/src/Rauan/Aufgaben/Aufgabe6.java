package Rauan.Aufgaben;

public class Aufgabe6 {
    public static int main(String[] args) {

        // Berechne 20! Faktorielle
        // 1 ! = 1;
        // 2 ! = 1 . 2 = 2;
        //  3 ! = 1 . 2 . 3 . 4 = 24;
        //  4 ! = 1.2 .3 .4 .5 = 120;

        int result = 1;
        for (int i = 1; i <= 20; i++) {
            result = result * i;
        }
        return  result;

    }
}
