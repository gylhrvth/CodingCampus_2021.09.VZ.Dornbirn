package Eray.week1;

public class WhileAndForLoops {
    public static void main(String[] args) {

        //Lesson 1
        int Multiplicator = 5;
        int MultiplicationSeries = 0;

        // While Loop
        while (MultiplicationSeries <= 10) {
            System.out.println(MultiplicationSeries * 5);
            MultiplicationSeries++;
        }

        System.out.println();
        //ForLoop
        for (int i = 0; i <= 10; i++) {
            System.out.println(i * Multiplicator);
        }
        System.out.println();

        //Lesson2
        char Hashtag = '#';

        for (int i = 0; i < 4; i++) {
            for (int k = 0; k < 5; k++) {
                System.out.print(Hashtag);
            }
            System.out.println();
        }

    }
}
