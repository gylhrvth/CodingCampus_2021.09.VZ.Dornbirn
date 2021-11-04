package Plamena.week8;

public class TowerOfHanoi {
    public static void main(String[] args) {
        int height = 0;
        int[][] mainTower = new int[3][height];

    }


    private static void movingBlocks(int[][] mainTower) {
        while (mainTower[1][mainTower.length] != 0 && mainTower[2][mainTower.length] != 0) {
            for (int i = 0; i < mainTower.length; i++) {
                for (int j = 0; j < mainTower.length; j++) {
                    if (mainTower[1][j] > mainTower[0][j]){

                    }
                }
            }
        }
    }
}