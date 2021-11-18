package Lukas.week10.day4.abstraction;

public class PaddleBoat extends Ship {
    @Override
    public void start() {
        System.out.println("Paddel inst Wasser und los gehts!!!");
    }

    @Override
    public void stop() {
        System.out.println("Paddel ins Wasser fallen lassen!!!");
    }
}
