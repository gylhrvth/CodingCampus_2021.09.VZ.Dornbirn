package Rauan.Aufgaben.Woche4;

public class StringIbanTest {
    public static void main(String[] args) {
        Iban("ATre3454377289934399037643222");
      Telefonnummer("0435657859506");


        String randomIbanEnding = "[a-z-A-Z0-9]+]*([0-9]+)+";
        System.out.println("At2345789876543".matches(randomIbanEnding));

    }

    private static void Iban(String ibanToTest) {
        String randomIbanEnding = "[a-zA-Z]{4}]*([0-9]{18})+";
        System.out.println(ibanToTest + " " + ibanToTest.matches(randomIbanEnding));
    }
    private static void Telefonnummer (String telefonnummerToTest){
        String randomTelefonnummerEnding = "[0-9]+";
        System.out.println(telefonnummerToTest+" "+telefonnummerToTest.matches(randomTelefonnummerEnding));
    }
}
