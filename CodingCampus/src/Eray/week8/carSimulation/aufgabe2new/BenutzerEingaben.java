package Eray.week8.carSimulation.aufgabe2new;

import java.util.List;
import java.util.Scanner;

public class BenutzerEingaben {

    private Scanner scanner;
    private List<Car> cars;
    private Car ausgewähltesAuto;

    public BenutzerEingaben(List<Car> cars) {
        this.cars = cars;
        this.scanner = new Scanner(System.in);
    }

    public void starteDialog() {
        System.out.println("Welches Auto möchtest du fahren?");
        printCars();
        int userInput = -1;
        do{
            userInput = scanner.nextInt();
        }while(userInput < 0 || userInput >= cars.size());

        this.ausgewähltesAuto = cars.get(userInput);
        this.howManyKmWantYouDrive();
    }

    private void printCars() {
        for (int i = 0; i < cars.size(); i++) {
            System.out.println("[" + i + "] " + cars.get(i).getModel());
        }
    }

    private void howManyKmWantYouDrive() {
        System.out.println("Wie viele kilometer möchtest du fahren?");
        int km = -1;

        do {
            km = scanner.nextInt();
        } while (km < 1);

        System.out.println(this.ausgewähltesAuto.drive(km));
    }
}
