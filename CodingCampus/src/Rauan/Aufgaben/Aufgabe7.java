package Rauan.Aufgaben;

public class Aufgabe7 {
    public static void main(String[] args) {

        //Berechne die Summe der erste 100 zahlen:

        int i = 0;
        for (int j = 1; j <= 100; j++) {
            System.out.println("zähler:" + j);
            System.out.println("..addiere" + j + "+" + i + "=" + i + j);
            i = i + j;
        }
        System.out.println("Alle zahlen von 0 bis 100 addiert="+i);




    }
}
