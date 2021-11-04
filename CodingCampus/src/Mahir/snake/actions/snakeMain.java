package Mahir.snake.actions;

import Mahir.snake.clocks.GameClock;
import Mahir.snake.gui.Gui;

public class snakeMain {
    public static void main(String[] args) {
        Gui g = new Gui();
        GameClock gc = new GameClock();

        g.create();
        gc.start();
    }
}

