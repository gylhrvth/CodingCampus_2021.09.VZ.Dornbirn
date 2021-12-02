package Danny.interfaces;

public class Bicycle implements CanDrive {
    @Override
    public void drive(int km) {
        System.out.println("Ich bin ein Fahrrad und fahre " + km + " Kilometer.");
    }
}
