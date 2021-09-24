package Bartosz.week2.flashingTree;

public class FlashingTreeBalls {
    public static void printBalls(int height, String color) {
        int width = (height * 2) - 1;

        String ANSI_RESET = "\u001B[0m";
        String ANSI_BLACK = "\u001B[30m";
        String ANSI_RED = "\u001B[31m";
        String ANSI_GREEN = "\u001B[32m";
        String ANSI_YELLOW = "\u001B[33m";
        String ANSI_BLUE = "\u001B[34m";
        String ANSI_PURPLE = "\u001B[35m";
        String ANSI_CYAN = "\u001B[36m";
        String ANSI_WHITE = "\u001B[37m";

        for (int d = 0; d < width; d++) {
            if (d % 2 == 0) {
                switch (color) {
                    case "red" ->       {System.out.print(ANSI_RED +"O"+ ANSI_RESET);}
                    case "green" ->     {System.out.print(ANSI_GREEN+"O"+ ANSI_RESET);}
                    case "blue" ->      {System.out.print(ANSI_BLUE +"O"+ ANSI_RESET);}
                    case "yellow" ->    {System.out.print(ANSI_YELLOW +"O"+ ANSI_RESET);}
                    case "purple" ->    {System.out.print(ANSI_PURPLE +"O"+ ANSI_RESET);}
                    case "cyan" ->    {System.out.print(ANSI_CYAN +"O"+ ANSI_RESET);}
                    case "white" ->    {System.out.print(ANSI_WHITE+"O"+ ANSI_RESET);}
                }

            } else {
                System.out.print(" ");
            }
        }

    }


}
