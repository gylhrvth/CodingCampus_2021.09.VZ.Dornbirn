package Ingo.week11.home;

public class Oop {
    public static void main(String[] args) {

        Car car1 = new Car("VW","Käfer",1974,"blue",8000.00);
        Car car2 = new Car("Renault","Clio",2018,"black",12000.00);

        System.out.println(car1.getModel());
        System.out.println(car1.getColor());
        System.out.println(car1.getMake());
        System.out.println(car1.getYear());
        System.out.println(car1.getPrice());

        car1.drive();
        car1.brake();


    }


}
