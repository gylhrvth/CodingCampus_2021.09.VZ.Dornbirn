package Rauan.woche10.abstraction.example;

public class Hund extends Animal implements AnimalStuff{
    @Override
    public void makeNoise() {
        System.out.println("HoOOo");
    }

    @Override
    public void poop() {
        System.out.println("Tief");
    }
}
