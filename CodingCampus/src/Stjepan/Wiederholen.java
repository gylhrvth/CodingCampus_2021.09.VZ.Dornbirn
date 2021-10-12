package Stjepan;

public class Wiederholen {

    public static void main(String[] args) {

        double weightOfApples = 3.2;
        double pricePerAppleKilo = 1.99;
        double weightOfBananas = 2.6;
        double pricePerBananasKilo = 1.69;


        double resultApples = CalculateMyTotalPrice(weightOfApples, pricePerAppleKilo);
        System.out.println("my apple price : " + resultApples);

        double resultBananas = CalculateMyTotalPrice(weightOfBananas, pricePerBananasKilo);
        System.out.println("my banana price : " + resultBananas);



    }


    public static double CalculateMyTotalPrice(double weight, double pricePerKilo) {
        double result = weight * pricePerKilo;

        return result;


    }


}
