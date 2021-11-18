package Rauan.woche10.interfaces;

public class Tier implements Lebewesen {
    int beine;
    String name ;
    int augen;


    @Override
    public void atme() {
        System.out.println("Schnauf");
    }
}
