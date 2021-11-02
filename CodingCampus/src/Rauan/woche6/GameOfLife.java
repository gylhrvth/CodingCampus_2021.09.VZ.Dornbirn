package Rauan.woche6;

public class GameOfLife {


    int width;
    int height;
    int[][] board;

    public GameOfLife(int width, int height) {
        this.width = width;
        this.height = height;

        this.board = new int[width][height];
    }

    public void printBoard() {
        System.out.println("____");
        for (int y = 0; y < height; y++) {
            String line = "|";
            for (int x = 0; x < width; x++) {
                if (this.board[x][y] == 0) {
                    line += ".";
                } else {
                    line += "*";
                }
            }
            line += "|";
            System.out.println(line);
        }
        System.out.println("___\n");
    }

    public void setAlive(int x, int y) {
        this.board[x][y] = 1;
    }

    public void setDead(int x, int y) {

        this.board[x][y] = 0;
    }

    public int countAliveNeighbours(int x, int y) {
        int count = 0;

        count += getState(x - 1, y - 1);
        count += getState(x, y - 1);
        count += getState(x + 1, y - 1);

        count += getState(x - 1, y);
        count += getState(x + 1, y);

        count += getState(x - 1, y + 1);
        count += getState(x, y + 1);
        count += getState(x + 1, y + 1);

        return count;
    }

    public int getState(int x, int y) {
        if (x < 0 || x >= width) {
            return 0;
        }
        if (y < 0 || y >= height) {
            return 0;
        }

        return this.board[x][y];
    }

    public void step() {
        int[][] newBoard = new int[width][height];

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                int aliveNeighbours = countAliveNeighbours(x, y);

                if (getState(x, y) == 1) {
                    if (aliveNeighbours < 2) {
                        newBoard[x][y] = 0;
                    } else if (aliveNeighbours == 2 || aliveNeighbours == 3) {
                        newBoard[x][y] = 1;
                    } else if (aliveNeighbours > 3) {
                        newBoard[x][y] = 0;
                    }
                } else {
                    if (aliveNeighbours == 3) {
                        newBoard[x][y] = 1;
                    }
                }
            }

        }
        this.board = newBoard;
    }

    public static void main(String[] args) {
        GameOfLife gameOfLife = new GameOfLife(8, 5);

        gameOfLife.setAlive(2, 2);
        gameOfLife.setAlive(3, 2);
        gameOfLife.setAlive(4, 2);

        gameOfLife.printBoard();

        // System.out.println(gameOfLife.countAliveNeighbours(3, 2));
        while(true) {
            gameOfLife.step();
            gameOfLife.printBoard();
            try {
                Thread.sleep(5000);
            } catch(Exception exc) {
                //noop
            }
            System.out.print("\033[H\033[2J");
            System.out.flush();
        }
    }
}
