package Lukas.week10.day4.abstraction;

public class Bicycle extends Vehicle {
    @Override
    public void start() {
        System.out.println("Ich steig aufs Rad und tret in die Pedale!!!");
    }

    @Override
    public void stop() {
        System.out.println("Ich bremse und steige langsam ab.");
    }
}
