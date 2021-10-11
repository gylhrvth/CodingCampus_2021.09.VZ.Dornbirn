package Saadaq.Week4;

import java.util.Arrays;
import java.util.regex.Pattern;


import java.util.Arrays;

public class StringManupulation_1 {


/*




    public class StringManipulation {


        public static void main(String[] args) {
            //Split
            String tmp = "Hallo.Hallo,Hallo Hallo\nHallo";
            String text2 = "googaale, cadale , maxaatiri, iyo maay,labokalamaaha, waankujeclahay";

            String[] tmp2 = tmp.split(" [.|,\\n]");
            String tmp3 = Arrays.toString(tmp2);

            System.out.println(tmp3);

            //Alternative A
            System.out.println(Arrays.toString(tmp.split(" |\\.|,|\n")));

            //Alternative B
            System.out.println(Arrays.toString(tmp.split("[., \n]")));

            String text = "Das ist ein Text wo ich was ersetzen will!";

            //Ersetzen wir ist durch Mist
            System.out.println(text.replace("ist", "mist"));



            //Ersetzen wir ist, ich, und wo durch baby ohne REGBERT
            System.out.println(text
                    .replace("ist", "baby")
                    .replace("ich", "baby")
                    .replace("wo", "baby"));

            //Ersetzen wir ist, ich, und wo durch Lokführer mit REGBERT
            System.out.println(text.replaceAll("ist|wo|ich", "Lokführer"));



            text = "Heute war und ist ein guter Tag. HaHaHa. Ist wirklich wahr. Zwinker smiley. :-). War ist es auf jedenfall!";

            //Ersetzen wir war und ist (egal ob groß oder klein) durch "guter Tag"
            //Variante A
            System.out.println(text.replaceAll("war|ist|War|Ist", "guter Tag"));
            //Variante B
            System.out.println(text.replaceAll("[Ww]ar|[Ii]st", "guter Tag"));
            //Variante F (Furchtbar)
            System.out.println(text.replaceAll("(W|w)ar|(I|i)st", "guter Tag"));
            //Variante W (Wage)
            System.out.println(text.replaceAll(".ar|.st", "guter Tag"));

            text = "Donaudampfschifffahrtsgesellschaftseray";



            System.out.println(text.matches("DonaudampfSchifffahrtsgesellschaftseray"));
            System.out.println(text.matches(".*schiff.*"));

            text = "Döner macht schöner! Österreich!";
            System.out.println(text.replaceAll("Ö", "Oe").replaceAll("ö", "oe"));

            text = "Unser Teamsname ist Regbert: Wir sind 15 + 2 Personen! Wir sind die Regberts! 12391863";

            //Ersetze 1 durch X, 2 bis 8 durch Y und 9 durch Regbert mit maximal 3 regex
            System.out.println(text
                    .replaceAll("1", "X")
                    .replaceAll("[2-8]", "Y")
                    .replaceAll("9", "Regbert"));


            String rebert = "[a-zA-Z0-9\\+\\.\\_\\%\\-\\+]{1,256}" +
                    "\\@" +
                    "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,64}" +
                    "(" +
                    "\\." +
                    "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,25}" +
                    ")+";
            System.out.println("r@yahoo.com".matches(rebert));
            System.out.println("rebert@test.yahoo.com".matches(rebert));
            System.out.println("+-%@0.0".matches(rebert));
            //stern heißt 0 bis unendlich + heißt 1 bis unendlich
            String hotmailPunktComRegbert = "[a-zA-Z0-9]+(\\.[a-zA-Z0-9]+)*@hotmail.com";

            System.out.println("eray.lokfuehrer@hotmail.com".matches(hotmailPunktComRegbert));
            System.out.println("eray.array.lokfuehrer@hotmail.com".matches(hotmailPunktComRegbert));
            System.out.println("eray@hotmail.com".matches(hotmailPunktComRegbert));
            System.out.println(".@hotmail.com".matches(hotmailPunktComRegbert));




            testMyEmail("eray.lokfuehrer@hotmail.");
            testMyEmail("eray.array.lokfuehrer@gmail.com");
            testMyEmail("eray@wegwerfmail.at123");
            testMyEmail(".@hotmail.comZxW");
            testMyEmail("eray.array.lokfuehrer@hiLukas.gmail.com");
            testMyEmail("marie-antonette@gmail.com");
            testMyEmail("gyula.horvath@software-projektmanagement.at");
            System.out.println("___________________-");


            *//*iban("ATrtr122060200001904055454528");*//*
            iban("ATAT8454155481185151551");

            System.out.println("____________");

       *//* String randomIBANEnding = "[a-zA-Z]+]+([0-9]+)+";

        System.out.println("AT1220602000001904022".matches(randomIBANEnding));*//*

        }

        private static int add(int a, int b) {
            return a + b;
        }

        public static void testMyEmail(String textToTest){
            String randomMailEnding = "[a-zA-Z0-9\\-]+(\\.[a-zA-Z0-9\\-]+)*@[a-zA-Z0-9\\-]+(\\.[a-zA-Z0-9\\-]+)+";
            System.out.println(textToTest + " " + textToTest.matches(randomMailEnding));











        }

        public static void iban(String ibanToTest){
            String  randomIBANEnding  =  "[a-zA-Z]{4}]*([0-9]+)+";
            System.out.println(ibanToTest+" "+ibanToTest.matches(randomIBANEnding));


        }



    }*/

}
