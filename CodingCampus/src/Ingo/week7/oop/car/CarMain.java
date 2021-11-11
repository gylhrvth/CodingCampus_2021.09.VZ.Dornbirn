package Ingo.week7.oop.car;

public class CarMain {

    public static void main(String[] args) {

        Car car1 = new Car("Renault", "Clio", 54, 45, 5.8, ENGINE_TYPE.GASOLINE, 1123);
        Car car2 = new Car("VW", "Golf 2", 40, 55, 7.7, ENGINE_TYPE.GASOLINE, 885);
        Car car3 = new Car("VW", "Käfer", 32, 38, 3.2, ENGINE_TYPE.DIESEL, 770);
        Car car4 = new Car("Tesla", "Model 3", 75, 76, 9.0, ENGINE_TYPE.ELECTRIC, 1900);


        //   System.out.println(car3.getConsumption());
        System.out.println(car3.drive(500));


    }

}




