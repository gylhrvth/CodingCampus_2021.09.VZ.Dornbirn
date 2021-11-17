package Plamena.week6.TestExcercises;

public class Loops {
    public static void main(String[] args) {
        printTriangle("o", 10);
    }
    private static void printX(String character, int height) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height; j++) {
                if (j == i || j == height - i - 1) {
                    System.out.print(character);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    private static void printRhombus(String character, int height) {
        int upperHalf = height / 2;
        int lowerHalf = height - upperHalf;
        if (height % 2 == 0) {
            for (int i = 0; i <= upperHalf; i++) {
                for (int j = 0; j <= height; j++) {
                    if (j == height / 2 - i || j == height / 2 + i) {
                        System.out.print(character);
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
            for (int i = 0; i <= lowerHalf; i++) {
                for (int j = 0; j <= height; j++) {
                    if (j == i || j == height - i) {
                        System.out.print(character);
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        } else {
            for (int i = 0; i <= upperHalf; i++) {
                for (int j = 0; j <= height + 1; j++) {
                    if (j == height / 2 - i + 1 || j == height / 2 + i + 1) {
                        System.out.print(character);
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();

            }
            for (int i = 0; i <= lowerHalf; i++) {
                for (int j = 0; j <= height + 1; j++) {
                    if (j == i || j == (height - i) + 1) {
                        System.out.print(character);
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }

    }

    private static void printTriangle(String character, int height) {
        for (int i = 0; i < height; i--) {
            for (int j = (height * 2) - 1; j > 0; j--) {
                if (i <= height - 2 && (j == height/2+i || j == (height / 2)-i)) {
                    System.out.print(character);
                }
                if (i == height - 1) {
                    System.out.print(character);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    private static void printSlash(String character, int height, boolean reverse) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height; j++) {
                if (reverse && j == i) {
                    System.out.print(character);
                } else {
                    System.out.print(" ");
                }
                if (!reverse && i == height - j - 1) {
                    System.out.print(character);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    private static void printSquare(int length, String character) {
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (i == 0 || i == length - 1) {
                    System.out.print(character + " ");
                } else if (j == 0 || j == length - 1) {
                    System.out.print(character);
                } else {
                    System.out.print("  ");

                }
            }
            System.out.println();
        }
    }

    private static void printChars(String character, int length) {
        for (int i = 0; i < length; i++) {
            System.out.print("x");
        }
    }

    private static void printNumbersReversed() {
        for (int i = 10; i >= -10; i--) {
            if (i > -10) {
                System.out.print(i + ", ");
            } else {
                System.out.print(i);
            }
        }
    }

    private static void printEvenNumbers() {
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    private static void printNumbers2() {
        for (int i = 0; i < 10; i++) {
            System.out.println("i = " + i);
        }
    }

    private static void printNumbersWhile() {
        int i = 0;
        while (i < 10) {
            if (i < 9) {
                System.out.print((i + 1) + ", ");
            } else {
                System.out.print(i + 1);
            }
            i++;
        }
    }

    private static void printNumbersFor() {
        for (int i = 0; i < 10; i++) {
            if (i < 9) {
                System.out.print((i + 1) + ", ");
            } else {
                System.out.print(i + 1);
            }
        }
    }
}
