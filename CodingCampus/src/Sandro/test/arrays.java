package Sandro.test;

import java.util.Arrays;
import java.util.Random;

public class arrays {

    public static void main(String[] args) {

        randomNumbersArray();
        randomNumbersArrayMethodReturn();
        randomNumbersArrayMethodReturnMaximum();
        randomNumbersArrayMethodReturnMinimum();
        randomNumbersArrayMethodReturnAverage();
        randomNumbersArrayCrazyRangeWithForEachLoop();
        bubblesortAscendingNumbers();
        bubblesortDescendingNumbers();
        bubbleSortAscendingStrings();
        bubbleSortDescendingString();

    }

    public static void randomNumbersArray() {
        System.out.println("\nErstelle ein int[] und befülle es mit Zufallszahlen von 0 bis 100.");
        Random random = new Random();
        int[] forLoopArray = new int[16];
        for (int i = 0; i < forLoopArray.length; i++) {
            forLoopArray[i] = random.nextInt(100);
            System.out.println(forLoopArray[i]);
        }
        System.out.println("\nGib es mit Hilfe einer foreach-Schleife aus.");
        for (int forEachLoopArray : forLoopArray) {
            System.out.println(forEachLoopArray);
        }
        {
            System.out.println("\nGib den zweiten, fünften und zehnten Wert des Arrays aus.");
            System.out.println(forLoopArray[2]);
            System.out.println(forLoopArray[5]);
            System.out.println(forLoopArray[10]);
        }
        System.out.println("\nGib jeden zweiten Wert des int[] mit Hilfe einer Schleife aus.");
        for (int i = 2; i < forLoopArray.length; i = i + 2) {
            System.out.println(forLoopArray[i]);
        }
    }

    public static int[] randomNumbersArrayMethodReturn() {
        System.out.println("\nErstelle ein int[] und befülle es mit Zufallszahlen von 0 bis 1000. Erstelle jeweils eine Methode für das Minimum, das Maximum und den Durchschnitt." +
                "Die Methoden sollen jeweils den Wert zurückgeben (nicht Ausgeben). In der main Methode Rufe die Methoden mit den Zufallszahlen auf und gib diese aus.");
        Random random = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1000);
            System.out.println(array[i]);
        }
        return array;
    }

    public static int randomNumbersArrayMethodReturnMaximum() {
        System.out.println("\nErstelle ein int[] und befülle es mit Zufallszahlen von 0 bis 1000. Erstelle jeweils eine Methode für das Minimum, das Maximum und den Durchschnitt." +
                "Die Methoden sollen jeweils den Wert zurückgeben (nicht Ausgeben). In der main Methode Rufe die Methoden mit den Zufallszahlen auf und gib diese aus.");
        Random random = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1000);
        }

        int max = array[0];
        for (int j = 0; j < array.length; j++) {
            if (array[j] > max) {
                max = array[j];
            }
        }
        System.out.println(max);
        System.out.println(Arrays.toString(array));
        return max;
    }

    public static int randomNumbersArrayMethodReturnMinimum() {
        System.out.println("\nErstelle ein int[] und befülle es mit Zufallszahlen von 0 bis 1000. Erstelle jeweils eine Methode für das Minimum, das Maximum und den Durchschnitt." +
                "Die Methoden sollen jeweils den Wert zurückgeben (nicht Ausgeben). In der main Methode Rufe die Methoden mit den Zufallszahlen auf und gib diese aus.");
        Random random = new Random();                                               //int min = Arrays.stream(array).min().getAsInt(); - Schnellere Methode !
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1000);
        }

        int min = array[0];
        for (int j = 0; j < array.length; j++) {
            if (array[j] < min) {
                min = array[j];
            }
        }
        System.out.println(min);
        System.out.println(Arrays.toString(array));
        return min;

    }

    public static int randomNumbersArrayMethodReturnAverage() {
        System.out.println("\nErstelle ein int[] und befülle es mit Zufallszahlen von 0 bis 1000. Erstelle jeweils eine Methode für das Minimum, das Maximum und den Durchschnitt." +
                "Die Methoden sollen jeweils den Wert zurückgeben (nicht Ausgeben). In der main Methode Rufe die Methoden mit den Zufallszahlen auf und gib diese aus.");
        Random random = new Random();                                               //int min = Arrays.stream(array).min().getAsInt(); - Schnellere Methode !
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1000);
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        int avg = sum / array.length;
        System.out.println(avg);
        System.out.println(Arrays.toString(array));
        return avg;
    }



    public static void randomNumbersArrayCrazyRangeWithForEachLoop() {
        System.out.println("\nErstelle ein int[] und befülle es mit Zufallszahlen von -50 bis 50 und gib es mit Hilfe einer foreach-Schleife aus.");
        int min = -50;
        int max = 50;
        Random random = new Random();
        int[] array = new int[16];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(max - min) + min;
        }
        for (int array1 : array) {
            System.out.println(array1);
        }
    }

    public static void bubblesortAscendingNumbers() {
        System.out.println("\nErstelle ein int[] und sortiere es mit einem selbsterstellten Bubblesort Algorithmus und gib es dann aus. Der Bubblesort Algorithmus soll in einer eigenen Methode implementiert werden. Der Aufruf und die Ausgabe erfolgt in der main Methode." +
                "Sortiere der Größe nach aufsteigend (Ascending)");
        int[] numbers = new int[]{6, 13, 24, 50, 19, 16, 49, 43, 36};

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int tmp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(numbers));
    }

    public static void bubblesortDescendingNumbers() {
        System.out.println("\nErstelle ein int[] und sortiere es mit einem selbsterstellten Bubblesort Algorithmus und gib es dann aus. Der Bubblesort Algorithmus soll in einer eigenen Methode implementiert werden. Der Aufruf und die Ausgabe erfolgt in der main Methode." +
                "Sortiere der Größe nach aufsteigend (Ascending)");
        int[] numbers = new int[]{6, 13, 24, 50, 19, 16, 49, 43, 36};
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - 1; j++) {
                if (numbers[j] < numbers[j + 1]) {
                    int tmp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(numbers));
    }

    public static void bubbleSortAscendingStrings() {
        System.out.println("\nVerwende das gegebene String[] und sortiere es mit einem selbsterstellten Bubblesort Algorithmus und gib es dann aus. " +
                "Der Bubblesort Algorithmus soll in einer eigenen Methode implementiert werden. Der Aufruf und die Ausgabe erfolgt in der main Methode.");

        String[] names = new String[]{"Plamena", "Sadaaq", "Gyula", "Eray", "Gerri", "Stefan", "Lena", "Danny", "Oemer", "Stjepan", "Sandro", "Bartosz", "Ingo", "Rauan", "Mahir", "Lukas", "Niklas"};
        for (int j = 0; j < names.length; j++) {
            for (int i = j + 1; i < names.length - 1; i++) {
                if (names[i].compareTo(names[j]) < 0) {
                    String tmp = names[j];
                    names[j] = names[i];
                    names[i] = tmp;
                }
            }
            System.out.println(names[j]);
        }
    }

    public static void bubbleSortDescendingString() {
        System.out.println("\nVerwende das gegebene String[] und sortiere es mit einem selbsterstellten Bubblesort Algorithmus und gib es dann aus. " +
                "Der Bubblesort Algorithmus soll in einer eigenen Methode implementiert werden. Der Aufruf und die Ausgabe erfolgt in der main Methode");

        String[] names = new String[]{"Plamena", "Sadaaq", "Gyula", "Eray", "Gerri", "Stefan", "Lena", "Danny", "Oemer", "Stjepan", "Sandro", "Bartosz", "Ingo", "Rauan", "Mahir", "Lukas", "Niklas"};
        for (int j = 0; j < names.length; j++) {
            for (int i = j + 1; i < names.length - 1; i++) {
                if (names[i].compareTo(names[j]) > 0) {
                    String tmp = names[j];
                    names[j] = names[i];
                    names[i] = tmp;
                }
            }
            System.out.println(names[j]);
        }
    }
}
