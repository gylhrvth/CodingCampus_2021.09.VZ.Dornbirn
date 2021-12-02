package Rauan.woche10.interfaces;

public class Fahrrad implements canDrive {
    @Override
    public void drive(int km) {
        System.out.println("Ich bin ein fahrrad unf fahre " + km + " kilometer");
    }
}
