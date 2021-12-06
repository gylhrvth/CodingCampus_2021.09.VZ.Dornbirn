package Lukas.week10.day4.interfaces;

public class Car implements CanDrive {
    @Override
    public void drive(int km) {
        System.out.println("Ich bin ein Auto und fahre "  +km+  " kilometer.");
    }
}
