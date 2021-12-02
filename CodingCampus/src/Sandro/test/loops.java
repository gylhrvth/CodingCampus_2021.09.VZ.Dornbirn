package Sandro.test;

public class loops {

    public static void main(String[] args) {

        zeroToTenWithForLoop();
        zeroToTenWithWileLoop();
        zeroToTenOnlyEvenNumbers();
        BackwardsFromTenUntilMinus10();


    }

    public static void zeroToTenWithForLoop() {
        System.out.println("\nZähle in einer Schleife von 0 bis inklusive 10 und gib die Zahlen aus. Verwende dazu die for-Schleife:");
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
    }

    public static void zeroToTenWithWileLoop() {
        System.out.println("\nVerwende dazu eine while-Schleife und erstelle eine separate Zählvariable:");
        int i = 0;
        while (i < 10) {
            i++;
            System.out.println(i);
        }
    }

    public static void zeroToTenOnlyEvenNumbers() {
        System.out.println("\nZähle in einer Schleife von 0 bis inklusive 10 gib nur jede gerade Zahl aus:");
        for (int j = 0; j <= 10; j++) {
            if (j % 2 == 0) {
                System.out.println(j);
            }
        }
    }

    public static void BackwardsFromTenUntilMinus10() {
        System.out.println("\nZähle in einer Schleife rückwärts von 10 bis -10 und gib alle Variablen aus:");
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
    }
}

