package Rauan.woche7;

import java.util.Arrays;

public class TürmeVonHanoi {
    public static void main(String[] args) {
        int[][] towers = new int[3][6];

        for (int i = 0; i < towers[0].length; i++) {
            towers[0][i] = towers[0].length - i;
        }
        printTowers(towers);
        move(towers[0].length, towers, 0, 2, 1);
    }

    public static void move(int count, int[][] towers, int fromIdx, int toIdx, int viaIdx){
        if (count <= 1){
            // simple move
            int tempDisk = -1;
            for (int i = towers[fromIdx].length - 1; i >= 0 ; i--) {
                if (towers[fromIdx][i] != 0){
                    tempDisk = towers[fromIdx][i];
                    towers[fromIdx][i] = 0;
                    break;
                }
            }
            for (int i = 0; i < towers[toIdx].length; i++) {
                if (towers[toIdx][i] == 0){
                    towers[toIdx][i] = tempDisk;
                    break;
                }
            }
            printTowers(towers);
        } else {
            move(count - 1, towers, fromIdx, viaIdx, toIdx);
            move(1, towers, fromIdx, toIdx, viaIdx);
            move(count -1, towers, viaIdx, toIdx, fromIdx);
        }
    }

    public static void printTowers(int[][] towers){
        for (int i = 0; i < towers.length; i++) {
            System.out.println(Arrays.toString(towers[i]));
        }
        System.out.println("--------------------");
    }
}
