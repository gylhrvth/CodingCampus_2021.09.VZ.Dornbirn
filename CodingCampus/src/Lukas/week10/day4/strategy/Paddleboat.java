package Lukas.week10.day4.strategy;

public class Paddleboat implements CanSwim {
    @Override
    public void swim(int km) {
        System.out.println("Ich paddle " + km + " im Wasser, dadurch schwimme ich!");
    }
}
