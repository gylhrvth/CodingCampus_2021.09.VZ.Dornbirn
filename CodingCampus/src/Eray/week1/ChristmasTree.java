package Eray.week1;

public class ChristmasTree {
    public static void main(String[] args) {

        int treeTrunkHeight = 5;
        int height = 10;

        for (int i = 1; i < height; i++) {
            for (int space = 1; space < height - i; space++) {
                System.out.print(" ");
            }

            for (int Tree = 1; Tree <= i * 2 - 1; Tree++) {
                System.out.print("X");
            }

            System.out.println();
        }

        for (int l = 0; l < 10; l++) {
            System.out.println("       XXX");
        }

        int trunkSpaces = (height * 2 - 1) / 2 - 3;
        System.out.println(trunkSpaces);
//        for (int h = 0; h < treeTrunkHeight; h++) {
//            for(int treeTrunkSpace = 1; treeTrunkSpace < ; treeTrunkSpace++ ){
//                System.out.print("X");
//            }
//            System.out.println();
//        }

    }
}




