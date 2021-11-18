package Rauan.woche10.abstraction.example;

public class main {
    public static void main(String[] args) {
        Cat myCat = new Cat();
        myCat.makeNoise();

    AnimalStuff[] as = new AnimalStuff[4];
        for (int i = 0; i <4 ; i++) {
            as[i] = new Cat();
        }
        as[2] = new Hund();
        for (int i = 0; i <4 ; i++) {
            as[i].poop();

        }

        AnimalStuff a = new Cat();
        a.poop();
    }

}
