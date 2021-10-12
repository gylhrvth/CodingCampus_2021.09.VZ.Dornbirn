package Ingo.week5;

import java.util.Arrays;

public class Home {
    public static void main(String[] args) {
        printMessage();

        String[] community = {"Sepp","Fritz","Luna","Nena","Michi","Tauni"};
        for (int i = 0; i < community.length; i++) {
            for (int j = 0; j < community.length-1; j++) {
                if (community[j].length() > community[j+1].length()){
                    String tmp = community[j+1];
                    community[j+1] = community[j];
                    community[j] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(community));

        String memb = "hallo wie geht es dir";
        String[] arr = memb.split(" ");
        System.out.println(Arrays.toString(arr));
        char[] newChar = memb.toCharArray();
        System.out.println(newChar);
        for (int element : newChar){
      //      System.out.println(Arrays.toString(newChar));
        }
        System.out.println(Arrays.toString(newChar));




    }



    public static void printMessage() {
        System.out.println("Ausgabe printMessage Methode!");
    }

    public static void simpleMessage(String name){
        System.out.println("hello  " +name);
    }
}
