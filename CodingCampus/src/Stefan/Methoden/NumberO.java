package Stefan.Methoden;

public class NumberO {
    //Headliner
    public static void headLine(int width) {
        for (int i = 0; i < width; i++) {
            System.out.print("I");
        }
        System.out.println();
    }

    //Body
    public static void body(int bodyHight, int bodyWidth) {
        for (int a = 0; a < bodyHight; a++) {
            System.out.print("I");
        }
        for (int b = 0; b < bodyWidth; b++) {
            System.out.print(" ");
        }
        for (int c = 0; c < bodyHight; c++) {
            System.out.print("I");
        }
        System.out.println();
    }



    //Foodliner
    public static void foodLine(int width) {
        for (int i = 0; i < width; i++) {
            System.out.print("I");
        }
        System.out.println();
    }



    public static void main(String[] args) {

        int width = 20;
        int bodyHight = width / 5;
        int bodySpaces = width - (2 * bodyHight);
        int bodyWidth = bodySpaces;
        int headlineHight = width / 10 + 1;
        int foodlineHight = width / 10 + 1;

        for (int i = 0; i < foodlineHight; i++) {
            headLine(width);
        }

        for (int i = 0; i < bodyHight;i++) {
            body(bodyHight, bodyWidth);
        }

        for (int i = 0; i < headlineHight; i++) {
            foodLine(width);
        }







    }

}
