package Bartosz.oldStuff.week1.loops.functions;

public class LoopsEx7ArrowLeft {
    public static void printArrow(int size) {

        int height= size;
        int width = height * 2;
        int upperheight = height / 2;
        int odd = height % 2;
        int spacecount = 0;


        for (int counter = 0; counter < height; counter++) {   // Höhe
            printArrowBody(counter, width, height);
            spacecount = printArrowHead(counter,height,upperheight, odd, spacecount);
            System.out.println();
        }
    }

    public static int printArrowHead(int counter, int height, int upperheight, int odd, int spacecount) {
        String terimation = "/";

        if (counter == 0 || counter == height - 1) {
            System.out.print(":");
        } else if (counter == height - 2) {
            System.out.print(",");
        } else if (counter == 1) {
            System.out.print("'");
        } else {
            System.out.print(" ");
        }

        if (counter < upperheight) {
            terimation = "\\";
            spacecount ++;
        } else if (odd == 1 && (counter == height / 2)) {
            terimation = "|";
            spacecount ++;
        } else if (counter >= upperheight) {
            terimation = "/";
            if(counter >= height/ 2 +1) {
                spacecount --;
            }
        }

        for(int i=1; i < spacecount ; i++){
            System.out.print(" ");
        }

        System.out.print(terimation);

        return spacecount;
    }
    public static void printArrowBody(int counter, int width, int height) {
        String printChar = "-";

        for (int i = 0; i < width ; i++) {
            if (counter == 0 || (counter >= 2 && counter <= height - 3) || counter == height - 1) {
                printChar = " ";
            } else {
                printChar = "-";
            }
            System.out.print(printChar);
        }
    }

    public static void main(String[] args) {

/*                              :\
        ------------------------' \
                                   \
                                   /
        ------------------------, /
                                :/
  */
        printArrow(6);
    }
}
