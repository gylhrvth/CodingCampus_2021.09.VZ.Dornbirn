package Stefan.Week10.CarSimulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CarMain {

    public static boolean driving = true;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Car car1 = new Car("Skoda", "Fabia", 68, 50.00, 1081.00, DriveTyp.DIESEL);
        Car car2 = new Car("VW", "Tiguan", 92, 60, 1490, DriveTyp.GASOLINE);
        Car car3 = new Car("Mazda", "CX-3", 89, 50, 1179, DriveTyp.GASOLINE);

        Car[] cars = new Car[]{car1, car2, car3};
        List<Car> carsList = new ArrayList<>();
        carsList.addAll(Arrays.asList(cars));


//        CarMethoden.printCarList(carsList);


        while (driving) {
            System.out.println();
            System.out.println("------------------START MENÜ -----------------------");
            System.out.println("Wenn sie das Auto abstellen wollen drücken sie [x]");
            System.out.println("ansonsten drücken sie die                      [d]");
            String userInput = scanner.next();
            if (userInput.equals("d")) {
                System.out.println("Wie viel Kilometer wollen sie fahren: ");
                int kilometer = scanner.nextInt();
                car2.drive(kilometer);
            } else if (userInput.equals("x")) {
                driving = false;
                System.out.println("Das Auto wurde erfolgreich ausgeschaltet");
            } else {
                System.out.println("Bitte wähle fahren oder nicht fahren");
            }


        }

    }
}
