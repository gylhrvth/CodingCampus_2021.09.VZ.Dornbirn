package Bartosz.week5.FunWithStrings;

import java.util.Arrays;

public class FunStringThings {

    public static void main(String[] args) {
        char myChar = 'l';
        String myString1 = "Hallo Welt!";
        String myString2 = "Heute ist ein guter Tag";
        String myString3 = "Morgen wird noch besser!";
        String myString4 = "Ich bin ein String";

        System.out.println(myString3);
        if(myString3.contains("Mor")) {
            System.out.println("Mittwoch ist toll!");
        }

        System.out.println("Das letzte " + myChar + " ist an der " + myString1.lastIndexOf(myChar) + ". Stelle.");

        char[] mSArray = myString4.toCharArray();
        System.out.println(mSArray);

        String[] words = myString3.split(" ");
        System.out.println(Arrays.toString(words));
    }
}
