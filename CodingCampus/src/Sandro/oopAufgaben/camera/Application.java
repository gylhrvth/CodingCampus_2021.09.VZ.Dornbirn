package Sandro.oopAufgaben.camera;

import java.util.LinkedList;

public class Application {
    public static void main(String[] args) {

        LinkedList<Fotoapparat> cameras = new LinkedList();
        cameras.add(new Fotoapparat(20, 40, "D780", "Nikon", 24));
        cameras.add(new Fotoapparat(30, 50, "DMC21", "Panasonic", 12));

        LinkedList<MemoryCard> memoryCards = new LinkedList<>();
        memoryCards.add(new MemoryCard("SanDisk", 128000.00));
        memoryCards.add(new MemoryCard("Sony", 64000.00));

        UserInteraction userInteraction = new UserInteraction();

        userInteraction.chooseModel(cameras);
        userInteraction.chooseMemoryCard(memoryCards);
        userInteraction.menu(cameras);

    }
}
