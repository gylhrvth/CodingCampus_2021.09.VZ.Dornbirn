package Rauan.woche10.Absraction;

public class Fahrrad extends Fahrzeug{
    @Override
    public void start() {
        System.out.println("Ich steige auf und fahre");
    }

    @Override
    public void stop() {
        System.out.println("Ich bremse und langsame absteigen");
    }
}
