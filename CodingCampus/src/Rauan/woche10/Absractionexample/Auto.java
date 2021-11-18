package Rauan.woche10.Absractionexample;

public class Auto extends Fahrzeug{
    @Override
    public void start() {
        System.out.println("Ich beginne der fahrt");
    }

    @Override
    public void stop() {
        System.out.println("Ich bremse und Die Fahrt wird aufhören");
    }
}
