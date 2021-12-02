package Rauan.Aufgaben.woche4;

import java.util.Arrays;

public class StringMainPulation {
    public static void main(String[] args) {
        String tmp = "Hallo.Hallo,HAllo Hallo\nHallo";
        String text2 = "Youtube, Google, MAthe; Deutsch";
        String[] tmp2 = tmp.split("[.|,\\n]");
        String tmp3 = Arrays.toString(tmp2);
        System.out.println(tmp3);
        //Alternative A
        System.out.println(Arrays.toString(tmp.split(" |\\.|,|\n")));

        //Alternative B
        System.out.println(Arrays.toString(tmp.split("[., \n]")));
        String text = " Hier ist das Text Wo ich was ersetzen will";

        //Ersetzen wir ist durch Mist
        System.out.println(text.replace("ist", "mist"));

        //Ersetzen wir ist,ich und wo durch baby ohne regbert
        System.out.println(text
                .replace("Wo", "baby")
                .replace("ich", "baby")
                .replace("ist", "baby"));

        //Alternative C
        text = "Heute ist einen schönen Tag";
        //ERsetzen wir ist,einen und Tag durch Rauan ohne regbert
        System.out.println(text
                .replace("ist", "Rauan")
                .replace("einen", "Rauan")
                .replace("Tag", "Rauan"));

        //Alternative D
        text = "HAllo, wie geht es dir?";
        //ersetzen wir Hallo, wie und dir durch Freitag mit regbert
        System.out.println(text.replaceAll("Hallo|wie|dir","Freitag"));

       String randomMailEnding = "[a-zA-Z0-9]+(\\.[a-zA-Z0-9]+)*@([a-zA-Z0-9]+\\.)+[a-zA-Z0-9]+";
        System.out.println("rauan.hi@hotmail.com".matches(randomMailEnding));
    }
}
