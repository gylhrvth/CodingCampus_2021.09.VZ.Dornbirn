package Saadaq.Week3;

public class ArrayMatrix {

    public static void main(String[] args) {


        int[][] numbersGrid = {
                {1,2,3},
                {4,5,6},
                {7,8,9},
                {0}

        };



        for (int i = 0; i < numbersGrid.length; i++) {

            for (int j = 0; j < numbersGrid[i].length; j++) {
                System.out.print(numbersGrid[i][j]);
            }

            System.out.println();
        }


    }
}
