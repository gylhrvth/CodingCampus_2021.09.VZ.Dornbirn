package Rauan.woche10.interfaces;

public class PaddleBoat implements canSwim{
    @Override
    public void swim(int km) {
        System.out.println("Ich bin ein Paddle und kann "+ km+ " kilometer fahren");
    }
}
