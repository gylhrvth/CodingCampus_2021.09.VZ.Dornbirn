package Eray.week8.personenMenu;

import Eray.week8.person.PersonenKlasse;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PersonenMainMenu {


    public static void main(String[] args) {
        printAll();
    }

    private static Scanner scanner = new Scanner(System.in);

    static PersonenKlasse personenKlasse1 = new PersonenKlasse("Eray", 24, 1.80, 80);
    static PersonenKlasse personenKlasse2 = new PersonenKlasse("Lukas", 25, 1.60, 75);
    static PersonenKlasse personenKlasse3 = new PersonenKlasse("Pascal", 10, 1.93, 120);
    static PersonenKlasse personenKlasse4 = new PersonenKlasse("Peter", 45, 1.75, 63);


    public static void printAll() {
        boolean inTheMenu = true;

        List<PersonenKlasse> personen = fillListArray();

        while (inTheMenu) {

            System.out.println();
            System.out.println();
            System.out.println();

            printPersonsMenuHead();
            printPersonData();
            int userInputNumber = scanner.nextInt();


            switch (userInputNumber) {
                case 1:
                case 2:
                case 3:
                case 5:
                    MethodsForMainMenu.calculateSortAndPrintPersons(personen,userInputNumber);
                    break;

                case 4:
                    MethodsForMainMenu.printNames(personen);
                    break;

                case 6:
                    System.out.println("Das Programm wurde erfolgreich Beendet");
                    inTheMenu = false;
                    break;

                default:
                    System.out.println("Bitte gebe eine richtige Zahl ein!!");
                    break;
            }
        }
    }


    public static void printPersonsMenuHead() {
        System.out.println("Hallo Willkommen im Personen Menü ");
        System.out.println("Du kannst aussuchen nach was sortiert werden soll");
        System.out.println("Drücken sie zum sortieren: ");
        System.out.println();
        System.out.println("Nach Größe                   [1]");
        System.out.println("Nach Alter                   [2]");
        System.out.println("Nach Gewicht                 [3]");
        System.out.println("Nach dem Alphabet Namen      [4]");
        System.out.println("Nach Durchschnitt des Alters [5]");
        System.out.println("Zum Beenden des Menüs        [6]");
    }

    public static void printPersonData() {
        System.out.println();
        System.out.println("Diese sind die BeispielsPersonen");
        System.out.println("Person: " + personenKlasse1);
        System.out.println("Person: " + personenKlasse2);
        System.out.println("Person: " + personenKlasse3);
        System.out.println("Person: " + personenKlasse4);
    }

    public static List<PersonenKlasse> fillListArray() {
        List<PersonenKlasse> personen = new ArrayList<>();
        personen.add(personenKlasse1);
        personen.add(personenKlasse2);
        personen.add(personenKlasse3);
        personen.add(personenKlasse4);

        return personen;
    }


}
