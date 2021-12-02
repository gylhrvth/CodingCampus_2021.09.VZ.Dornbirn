package Danny.interfaces;

public class Motorboat implements CanSwim {
    @Override
    public void swim(int km) {
        System.out.println("Ich schwimme bzw. fahre " + km + " mit meinem Motor!");
    }
}
