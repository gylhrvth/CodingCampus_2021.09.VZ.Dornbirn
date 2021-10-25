package Danny.woche6.day6;

import java.io.IOException;
import java.util.Arrays;

public class GameOfLife {
    private static final int lR = 20;
    private static int[][] matrix = new int[lR][lR];

    public static void main(String[] args) throws IOException {
        // Wartezeit bis Code weiterläuft
//        try {
//            System.out.println("Evolving");
//            Thread.sleep(500);
//        } catch (InterruptedException exc) {
//            //noop
//        }

// Komando in Git Batch um Bildschirm zu löschen
        // System.out.print("\033[H\033[2J");
        // System.out.flush();

//Length and High Matrix




        // Animationsobjekt einfügen
        matrix[0][1] = 1;
        matrix[1][2] = 1;
        matrix[2][0] = 1;
        matrix[2][1] = 1;
        matrix[2][2] = 1;

        int cellLive = 1;
        int deadCell = 0;




        while (true) {
            try {
                printArry();
                readArryAndWriteNewArry();
                Thread.sleep(500);
            } catch (InterruptedException exc) {
                //noop
            }
            System.out.print("\033[H\033[2J");
            System.out.flush();
        }
    }

    public static void printArry() {
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }

    public static void readArryAndWriteNewArry() {
        int[][] newMatrix = new int[lR][lR];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
              newMatrix[i][j] = rules(neighborsCounter(i, j), i, j);
            }
        }
        matrix = newMatrix;
    }


    public static int neighborsCounter(int row, int column) {
        int aliveNeighbors = 0;

        for (int positionNeighbourOverAktuell = 0; positionNeighbourOverAktuell < 3; positionNeighbourOverAktuell++) {
            aliveNeighbors += matrix[(matrix.length * 2 - 1 + row) % matrix.length][(matrix[row].length * 2 - 1 + column + positionNeighbourOverAktuell) % matrix[row].length];
        }
        for (int positionNeighbourMiddleAktuell = 0; positionNeighbourMiddleAktuell < 3; positionNeighbourMiddleAktuell++) {
            if (positionNeighbourMiddleAktuell != 1) {
                aliveNeighbors += matrix[(row)][(matrix[row].length * 2 - 1 + column + positionNeighbourMiddleAktuell) % matrix[row].length];
            }
        }
        for (int positionNeighbourOverAktuell = 0; positionNeighbourOverAktuell < 3; positionNeighbourOverAktuell++) {
            aliveNeighbors += matrix[(matrix.length * 2 + 1 + row) % matrix.length][(matrix[row].length * 2 - 1 + column + positionNeighbourOverAktuell) % matrix[row].length];
        }
        return aliveNeighbors;
    }


    public static int rules(int aliveNeighbors, int row, int column) {
        int cellStatus = 0;
        int deadCell = 0;
        int aliveCell = 1;

        if (matrix[row][column] == deadCell && aliveNeighbors == 3) {
            cellStatus = aliveCell;
        }
        if (matrix[row][column] == aliveCell && aliveNeighbors < 2) {
            cellStatus = deadCell;
        }
        if (matrix[row][column] == aliveCell && (aliveNeighbors == 2 || aliveNeighbors == 3)) {
            cellStatus = aliveCell;
        }
        if (matrix[row][column] == aliveCell && aliveNeighbors > 3) {
            cellStatus = deadCell;
        }
        return cellStatus;
    }
}
