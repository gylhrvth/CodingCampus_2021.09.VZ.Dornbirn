package Lukas.week10.day4.interfaces;

public class AmphibienVehicle implements CanSwim, CanDrive {
    @Override
    public void drive(int km) {
        System.out.println("Ich kann alles! Ich fahre an Land " + km + " kilometer!!!");
    }

    @Override
    public void swim(int km) {
        System.out.println("Sie glauben, ich kann nur fahren, aber ich kann auch schwimmen nämlich " + km + " kilometer!!!");
    }
}
