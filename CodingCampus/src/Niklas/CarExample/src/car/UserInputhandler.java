package Niklas.CarExample.src.car;

import java.util.List;
import java.util.Scanner;
/*
public class UserInputhandler {
    private Scanner scanner;
    private List<Car> cars;
    private Car currentSelectedCar;

    public UserInputhandler(List<Car> cars) {
        this.cars = cars;
        this.scanner = new Scanner(System.in);
    }

    public void startDialog() {
        System.out.println("Which car do you want to drive?");
        printCars();
        int userInput = -1;
        do {
            userInput = scanner.nextInt();
        } while (userInput < 0 || userInput >= cars.size());

        this.currentSelectedCar = cars.get(userInput);
        this.askUserWhatheWantsToDo();

    }

    private void printCars()  {
        for (int i = 0; i < cars.size(); i++) {
            System.out.println("["+ i +"] " + cars.get(i).getModel());
        }
    }

    private void askUserWhatheWantsToDo() {
        System.out.println("How many km's do you want to drive?");
        int km = -1;

        do {
            km = scanner.nextInt();
        } while (km < 1);

        System.out.println(this.currentSelectedCar.drive(km));
    }


}

 */
