package Ingo.oopObjektorientiert.abstractOop;

public class Bicycle extends Vehicle{

    @Override
    public void start() {
        System.out.println("Ich steig auf und trete in die Pedale !");
    }

    @Override
    public void stop() {
        System.out.println("Ich trete auf die Bremse und steig ab !");
    }
}
