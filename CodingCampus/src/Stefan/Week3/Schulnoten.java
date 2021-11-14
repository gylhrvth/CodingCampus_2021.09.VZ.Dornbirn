package Stefan.Week3;

import java.util.Scanner;

public class Schulnoten {
    public static void main(String[] args) {


        //Eingabe der Noten als Zahl - Ausgabe als Text
//        Scanner schulnoten = new Scanner(System.in);
//        int textEingabe = 0;
//
//        System.out.println("Gib deine Schulnote ein:");
//        textEingabe = schulnoten.nextInt();
//
//        switch (textEingabe) {
//            case 1:
//                System.out.println("Sehr Gut");
//                break;
//            case 2:
//                System.out.println("Gut");
//                break;
//            case 3:
//                System.out.println("Befriedigend");
//                break;
//            case 4:
//                System.out.println("Genügend");
//                break;
//            case 5:
//                System.out.println("Nicht Genügend");
//                break;
//        }


        //Eingabe der Noten als Text - Ausgabe als Zahl
        Scanner schulnoten = new Scanner(System.in);
        String textEingabe;

        System.out.println("Gib deine Schulnote ein:");
        textEingabe = schulnoten.nextLine().toLowerCase();

        switch (textEingabe) {
            case "sehr gut":
                System.out.println("Du hast die Note: 1");
                break;
            case "gut":
                System.out.println("Du hast die Note: 2");
                break;
            case "befridigend":
                System.out.println("Du hast die Note: 3");
                break;
            case "genügend":
                System.out.println("Du hast die Note: 4");
                break;
            case "nicht genügend":
                System.out.println("Du hast die Note: 5");
                break;
        }
    }
}
