package Mahir.Week2;

public class Day1 {
    public static void main(String[] args) {

        int offset = 2;
        int maxDays = 31;
        String Headline = "| MO | DI | MI | DO | FR | SA | SO |";
        System.out.print(Headline);
    int overallCounter = 1;
        System.out.println();
        for (int i = 0; i < offset; i++) {
            System.out.print("|    ");
            overallCounter += 1;
        }
        for (int a = 1; a  <= maxDays; a++) {
            System.out.print("| " + a + " ");
            if (a < 10) {
                System.out.print(" ");

            }
                if (overallCounter % 7 == 0) {
                    System.out.println("|");
                }


            overallCounter +=1;
        }
        for (int i = offset;offset <= 4; offset++){
            System.out.print("|    ");
        }


    }


}




