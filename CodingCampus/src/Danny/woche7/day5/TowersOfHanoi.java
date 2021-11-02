package Danny.woche7.day5;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.Arrays;

public class TowersOfHanoi {

    public static int quantityDiscs = 5;
    private static char[][] tower1 = new char[quantityDiscs][quantityDiscs + 4];
    private static char[][] tower2 = new char[quantityDiscs][quantityDiscs + 4];
    private static char[][] tower3 = new char[quantityDiscs][quantityDiscs + 4];

    public static void main(String[] args) {
        fillTower1WithDiscs();
        creatEmtyTowers();
        printTower();
        moveDisk(quantityDiscs, tower1, tower2, tower3);
        printTower();
    }

    public static int overestDisk(char[][] towerAktuell) {
        for (int i = 0; i < towerAktuell.length; i++) {
            for (int j = 0; j < towerAktuell[i].length; j++)
            if (towerAktuell[i][j] == '-') {
                return i;
            } else if (i == towerAktuell.length-1 && j == towerAktuell[i].length-1 && towerAktuell[i][j] == ' ') {
                return i;
            }
        }
        return 0;
    }

    public static int overestSpace(char[][] towerAktuell) {
        for (int i = 0; i < towerAktuell.length; i++) {
            for (int j = 0; j < towerAktuell[i].length; j++)
                if (towerAktuell[i][j] == '-') {
                    return i-1;
                } else if (i == towerAktuell.length-1 && j == towerAktuell[i].length-1 && towerAktuell[i][j] == ' ') {
                    return i;
                }
        }
        return 0;
    }

    public static void moveDisk(int quantityDiscs, char[][] tower1, char[][] tower2, char[][] tower3) {
        if (quantityDiscs > 0) {
            moveDisk(quantityDiscs - 1, tower1, tower3, tower2);
            char[] temp = tower3[overestSpace(tower3)];
            tower3[overestSpace(tower3)] = tower1[overestDisk(tower1)];
            tower1[overestDisk(tower1)] = temp;
            printTower();
            moveDisk(quantityDiscs - 1, tower2, tower1, tower3);
        }
    }

    private static int sizeDisc(char[] aktuellDisk) {
        int sizeDisc = 0;
        for (int i = 0; i < aktuellDisk.length; i++) {
            if (aktuellDisk[i] == '-')
                sizeDisc++;
        }
        return sizeDisc;
    }

    private static void fillTower1WithDiscs() {
        int space = 0;
        for (int i = quantityDiscs - 1; i >= 0; i--) {
            int spaceRest = 0;
            for (int h = 0; h < space; h++) {
                tower1[i][h] = ' ';
                spaceRest++;
            }
            for (int j = 0 + space; j < tower1[i].length - space; j++) {
                tower1[i][j] = '-';
                spaceRest++;
            }
            for (int l = 0; l < space; l++) {
                tower1[i][spaceRest] = ' ';
                spaceRest++;
            }
            space++;
        }
    }

    private static void creatEmtyTowers() {
        char[] disc = new char[quantityDiscs + 4];
        Arrays.fill(disc, ' ');
        for (int i = 0; i < tower2.length; i++) {
            tower2[i] = disc;
            tower3[i] = disc;
        }
    }

    private static void printTower() {
        for (int i = 0; i < tower1.length; i++) {
            System.out.print(tower1[i]);
            System.out.print("        ");
            System.out.print(tower2[i]);
            System.out.print("        ");
            System.out.println(tower3[i]);
        }
    }
}

