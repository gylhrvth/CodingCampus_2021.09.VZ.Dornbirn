package Rauan.woche10.interfacesExmple;

public class Tier implements Lebewesen {
    int beine;
    String name ;
    int augen;


    @Override
    public void atme() {
        System.out.println("Schnauf");
    }
}
