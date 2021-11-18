package Rauan.woche10.interfaces;

public class MotorBoat implements canSwim{
    @Override
    public void swim(int km) {
        System.out.println("Ich bin ein Motor und kann "+ km+ " kilometer swimmen");
    }
}
