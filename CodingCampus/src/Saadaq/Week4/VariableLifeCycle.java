package Saadaq.Week4;

import java.util.Arrays;

public class VariableLifeCycle {

    public static void main(String[] args) {

        char myChar = 'l';
        char myChar2 = 'n';

        String myStringOne = "Hall Welt!";
        String myStringTwo = "Huete ist ein guter Tag";
        String mySTringThree = "Morgen wird ein guter Tag!";
        String myStringFour = "Ich bin ein String";


        System.out.println(mySTringThree);

        if (mySTringThree.contains("Mor")){
            System.out.println("Mittwoch is toll!");
        }

        System.out.println("Das letzte " + myChar2 + " ist an der "+ myStringOne.lastIndexOf(myChar2)+ ". Stelle.");

        // -1 means no value found!

        String[] words = mySTringThree.split(" ");
        System.out.println(Arrays.toString(words));














    }//End of the main
}//End of the Class
