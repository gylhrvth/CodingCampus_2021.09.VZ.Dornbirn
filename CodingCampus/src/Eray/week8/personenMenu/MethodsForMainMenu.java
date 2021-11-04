package Eray.week8.personenMenu;

import Eray.week8.person.PersonenKlasse;

import java.util.List;

public class MethodsForMainMenu {

    public static void calculateSortAndPrintPersons(List<PersonenKlasse> personenKlasseList, int userInputNumber) {

        for (int i = 0; i < personenKlasseList.size(); i++) {
            for (int j = 0; j < personenKlasseList.size() - i - 1; j++) {
                switchingMethods(personenKlasseList, userInputNumber, j);
            }
        }
        printOutput(personenKlasseList, userInputNumber);
    }

    public static void printOutput(List<PersonenKlasse> personenKlasseList, int userInputNumber) {
        int i = 1;
        switch (userInputNumber) {
            case 1:
                for (PersonenKlasse personen : personenKlasseList) {
                    System.out.println("Person " + i + " ist " + personen.getHeight() + " M Groß");
                    i++;
                }
                break;

            case 2:
                for (PersonenKlasse personen : personenKlasseList) {
                    System.out.println("Person " + i + " ist " + personen.getAge() + " Jahre alt");
                    i++;
                }
                break;

            case 3:
                for (PersonenKlasse personen : personenKlasseList) {
                    System.out.println("Person " + i + " wiegt " + personen.getWeight() + " Kilogramm");
                    i++;
                }
                break;

            case 5:
                double average = getAverage(personenKlasseList);
                System.out.println("Das Durchschnitts Alter aller Personen beträgt " + average + " Jahre");
                break;
        }
    }

    public static void switchingMethods(List<PersonenKlasse> personenKlasseList, int userInputNumber, int j) {
        switch (userInputNumber) {
            case 1:
                if (personenKlasseList.get(j).getHeight() > personenKlasseList.get(j + 1).getHeight()) {
                    PersonenKlasse tmp = personenKlasseList.get(j);
                    personenKlasseList.set(j, personenKlasseList.get(j + 1));
                    personenKlasseList.set(j + 1, tmp);
                }
                break;

            case 2:
                if (personenKlasseList.get(j).getAge() > personenKlasseList.get(j + 1).getAge()) {
                    PersonenKlasse tmp = personenKlasseList.get(j);
                    personenKlasseList.set(j, personenKlasseList.get(j + 1));
                    personenKlasseList.set(j + 1, tmp);
                }
                break;

            case 3:
                if (personenKlasseList.get(j).getWeight() > personenKlasseList.get(j + 1).getWeight()) {
                    PersonenKlasse tmp = personenKlasseList.get(j);
                    personenKlasseList.set(j, personenKlasseList.get(j + 1));
                    personenKlasseList.set(j + 1, tmp);
                }
                break;
        }
    }

    public static double getAverage(List<PersonenKlasse> personenKlasseList) {
        double sum = 0;

        for (PersonenKlasse person : personenKlasseList) {
            sum += person.getAge();
        }

        return sum / personenKlasseList.size();
    }

    public static void printNames(List<PersonenKlasse> personenKlasseList) {
        personenKlasseList.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));

        int i = 1;
        for (PersonenKlasse personen : personenKlasseList) {
            System.out.println("Person " + i + " heißt " + personen.getName());
            i++;
        }
    }

}
