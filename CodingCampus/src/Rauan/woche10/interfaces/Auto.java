package Rauan.woche10.interfaces;

public class Auto implements canDrive{
    @Override
    public void drive(int km) {
        System.out.println("Ich bin ein Auto und fahre "+ km+ " kilometer");
    }
}
