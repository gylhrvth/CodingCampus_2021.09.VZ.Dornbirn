package Danny.interfaces;

public class Paddleboat implements CanSwim {
    @Override
    public void swim(int km) {
        System.out.println("Ich paddle " + km + " im Wasser, dadurch schwimme ich!");
    }
}
