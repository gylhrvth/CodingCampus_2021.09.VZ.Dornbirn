package Danny.woche6.day6;

public class GameOfLife {
    private static final int DEAD_CELL = 0;
    private static final int ALIVE_CELL = 1;

    public static void main(String[] args) {
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

//        int[] row0  = {0,1,0,0,0};
//        int[] row1  = {0,1,0,0,0};
//        int[] row2  = {0,1,0,0,0};
//        int[] row3  = {0,1,0,0,0};
//

        int[] row0 = {0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int[] row1 = {0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int[] row2 = {1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int[] row3 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int[] row4 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int[] row5 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int[] row6 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int[] row7 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int[] row8 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int[] row9 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int[] row10 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int[] row11 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int[] row12 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int[] row13 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

//        String[] row = {"row1","row2","row3","row4","row5","row6","row7","row8","row9","row10","row11,row12,row13,row14"};

        int lR = 20;
        int[][] matrix = new int[lR][(lR / 4) * 3];
        int[][] matrixprint = new int[lR][(lR / 4) * 3];

        // Animationsobjekt einfügen
        matrix[0][1] = 1;
        matrix[1][2] = 1;
        matrix[2][0] = 1;
        matrix[2][1] = 1;
        matrix[2][2] = 1;

        int aliveNeighbors = 0;

    }


    public static void neighborsCounter (int[][] matrix, int aliveNeighbors, int x, int y) {
        for (int i = 0; i < 9; i++) {

        }

    }


    public static void rules(int[][] matrix, int cellLive, int deadCell, int aliveNeighbors, int x, int y, int[][] matrixprint) {

        if (matrix[x][y] == deadCell && aliveNeighbors == 3) {
            matrixprint[x][y] = cellLive;
        }
        if (matrix[x][y] == cellLive && aliveNeighbors < 2) {
            matrixprint[x][y] = deadCell;
        }
        if (matrix[x][y] == cellLive && (aliveNeighbors == 2 || aliveNeighbors == 3)) {
            matrixprint[x][y] = cellLive;
        }
        if (matrix[x][y] == cellLive && aliveNeighbors >= 3) {
            matrixprint[x][y] = deadCell;
        }
    }
}
