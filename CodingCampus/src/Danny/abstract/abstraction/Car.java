package Danny;

public class Car extends Vehicle {

    @Override
    public void start() {
        System.out.println("Ich starte den Motor: brumm und DRÜCK DAS PEDAL");
    }

    @Override
    public void stop() {
        System.out.println("Ich bremse und stelle den Motor ab");
    }
}
