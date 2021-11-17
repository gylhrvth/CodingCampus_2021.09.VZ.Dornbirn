package Plamena.week8.Camera;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemoryCard {
    public static final int MAGIC_MEMORY_CARD_MAX_MEMORY = 100;

    private double memory;
    List<Picture> picsOnMemoryCard = new ArrayList<>();

    public boolean savePicInMemory(Picture pic) {


        this.picsOnMemoryCard.add(pic);
        double memoryLeft = MAGIC_MEMORY_CARD_MAX_MEMORY - memory;
        System.out.printf("%.2f MB memory left", memoryLeft);
        System.out.println();
        if (memoryLeft > pic.getSize()) {
            this.memory += pic.getSize();
            return true;
        } else {
            System.out.println("Memory full!" + System.lineSeparator());
            return false;
        }
    }

    public void setMemory(double memory) {
        this.memory = memory;
    }

    public double getMemory() {
        return memory;
    }
}
