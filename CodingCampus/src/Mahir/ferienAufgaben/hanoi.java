package Mahir.ferienAufgaben;

public class hanoi {
    static int count = 1;


    public static void main(String[] args) {



        int sizeOfTower = 5;
        int[][] towers = new int[3][sizeOfTower];
        for (int i = 0; i < sizeOfTower; i++) {
            towers[0][i] = sizeOfTower - i;
            towers[1][i] = 0;
            towers[2][i] = 0;
        }
        /*
        5 4 3 2 1
        0 0 0 0 0
        0 0 0 0 0

        5 4 3 0 0
        2 1 0 0 0
        0 0 0 0 0

        */



//        String[][] tower = {
//                {"1", "", ""},
//                {"2", "", ""},
//                {"3", "", ""}
//        };
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                if (j == 0) {
//                    System.out.print("| ");
//                }
//                System.out.print(tower[i][j] + " | ");
//            }
//            System.out.println();
//
//        }


        move(3, "A", "B", "C");

    }

    private static void move(int n, String start, String temp, String end) {


        if (n == 1) {
            System.out.println(count + " Move " + start + " to " + end);
            count++;
        } else {
            move(n - 1, start, end, temp);
            System.out.println(count + " Move " + start + " to " + end);
            count++;
            move(n - 1, temp, start, end);
        }
    }
}
