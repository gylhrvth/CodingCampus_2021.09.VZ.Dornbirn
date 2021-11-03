package Mahir.ferienAufgaben;

public class hanoi {
    static int count = 1;


    public static void main(String[] args) {
        String[][] tower = {
                {"  -  ", "", ""},
                {" ___ ", "", ""},
                {"_____", "", ""}
        };
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (j == 0) {
                    System.out.print("| ");
                }
                System.out.print(tower[i][j] + " | ");
            }
            System.out.println();

        }


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
