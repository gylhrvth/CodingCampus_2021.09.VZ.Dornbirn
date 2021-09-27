package Stefan.thirdWeek;

public class quersumme {
    public static void main(String[] args) {

        int zahl = 321;


        System.out.println("Quersumme = " + quersumme(zahl));

    }


    public static int quersumme(int zahl) {

        if (zahl <= 9) return zahl;

        return zahl%10 + quersumme(zahl/10);

    }
}
