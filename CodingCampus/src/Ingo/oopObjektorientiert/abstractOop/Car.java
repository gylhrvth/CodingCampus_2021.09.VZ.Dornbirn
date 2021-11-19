package Ingo.oopObjektorientiert.abstractOop;

public class Car extends Vehicle {

    @Override
    public void start() {
        System.out.println("Ich starte den Motor und fahr los !");
    }

    @Override
    public void stop() {
        System.out.println("Ich steig auf die Bremse und stelle den Motor ab !");
    }
}
