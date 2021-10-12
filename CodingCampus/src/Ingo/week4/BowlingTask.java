package Ingo.week4;


import java.util.Random;

public class BowlingTask {

    private static Random random = new Random();

    public static void main(String[] args) {
        Bowling();
    }

    private static void Bowling() {
        System.out.println("Sie haben 2 Würfe LETS GO!! ");
        for (int i = 0; i < 2; i++) {

            int bowling = random.nextInt(10);

            switch (bowling) {
                case 1:
                case 2:
                case 3:
                    System.out.println("Dein Wurf war Okay!");
                    break;
                case 4:
                case 5:
                case 6:
                    System.out.println("Dein Wurf war Gut!");
                    break;
                case 7:
                case 8:
                    System.out.println("Das war ein Sehr Guter Wurf!");
                    break;
                case 9:
                    System.out.println("Dein Wurf war Perfekt!");
                    break;
            }
        }
    }
}
