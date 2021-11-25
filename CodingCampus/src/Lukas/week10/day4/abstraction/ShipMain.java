package Lukas.week10.day4.abstraction;

import Sandro.oopAufgaben.motorrad.Motor;

import java.util.ArrayList;
import java.util.List;

public class ShipMain {
    public static void main(String[] args) {
        letItFly(100, createShips(10));
    }

    private static void letItFly(int km, List<Ship> ships) {
        for(Ship ship : ships) {
            ship.swim(km);
        }
    }

    private static List<Ship> createShips(int number) {
        List<Ship> ships = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            if(Math.random() >= 0.5) {
                ships.add(new PaddleBoat());
            } else {
                ships.add(new MotorBoat());
            }
        }
        return ships;
    }
}
