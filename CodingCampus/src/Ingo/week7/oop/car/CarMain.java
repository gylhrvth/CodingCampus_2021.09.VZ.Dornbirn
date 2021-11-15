package Ingo.week7.oop.car;


import java.util.Scanner;

public class CarMain {

    public static void main(String[] args) {

        Car car1 = new Car("Renault", "Clio", 54, 45, 5.8, EngineType.GASOLINE, 1123);
        Car car2 = new Car("VW", "Golf 2", 40, 55, 7.7, EngineType.GASOLINE, 885);
        Car car3 = new Car("VW", "Käfer", 32, 38, 3.2, EngineType.DIESEL, 770);
        Car car4 = new Car("Tesla", "Model 3", 75, 76, 9.0, EngineType.ELECTRIC, 1900);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Which car do you want to use?  Car 1 = " + car1.getManufacturer());
        String input = scanner.nextLine();
        input = car1.getManufacturer();




    }


}




