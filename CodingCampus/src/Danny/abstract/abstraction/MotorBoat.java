package Danny;

public class MotorBoat extends Ship {
    @Override
    public void start() {
        System.out.println("Das Motorboot startet den Motor und schwimmt los");
    }

    @Override
    public void stop() {
        System.out.println("Das Motorboot hört auf zu schwimmen und treibt weiter und wirft den Anker");
    }
}
