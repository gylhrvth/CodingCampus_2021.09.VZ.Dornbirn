package Eray.week6.uebungsBeispiele;

import java.util.Arrays;

public class BubbleSortWithNames {
    public static void main(String[] args) {
        printSortedNames();
    }

    private static void printSortedNames() {
        printNames();
        printNamesWithCustomIndex();
    }

    private static void printNames() {
        //true for Ascending false for Descending
        String[] names = new String[]{"Plamena", "Sadaaq", "Gyula", "Eray", "Gerri", "Stefan", "Lena", "Danny", "Ömer", "Stjepan", "Sandro", "Bartosz", "Ingo", "Rauan", "Mahir", "Lukas", "Niklas"};
        swapString(names, true);
        System.out.println(Arrays.toString(names));
    }

    private static void printNamesWithCustomIndex() {
        String[] names = new String[]{"Plamena", "Sadaaq", "Gyula", "Eray", "Gerri", "Stefan", "Lena", "Danny", "Ömer", "Stjepan", "Sandro", "Bartosz", "Ingo", "Rauan", "Mahir", "Lukas", "Niklas"};
        swapStringCustom(names, true,2);
        System.out.println(Arrays.toString(names));
    }


    private static String[] swapStringCustom(String[] names, boolean Ascending, int userIndex) {
        while (Ascending) {
            for (int i = 0; i < names.length; i++) {
                for (int j = userIndex; j < names.length - 1 - i; j++) {
                    if (names[j].compareTo(names[j + 1]) > 0) {
                        String tmp = names[j];
                        names[j] = names[j + 1];
                        names[j + 1] = tmp;
                    }
                }
            }
            return names;
        }
        for (int i = 0; i < names.length; i++) {
            for (int j = userIndex; j < names.length - 1 - i; j++) {
                if (names[j].compareTo(names[j + 1]) < 0) {
                    String tmp = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = tmp;
                }
            }
        }
        return names;
    }

    private static String[] swapString(String[] names, boolean Ascending) {
        while (Ascending) {
            for (int i = 0; i < names.length; i++) {
                for (int j = 0; j < names.length - 1 - i; j++) {
                    if (names[j].compareTo(names[j + 1]) > 0) {
                        String tmp = names[j];
                        names[j] = names[j + 1];
                        names[j + 1] = tmp;
                    }
                }
            }
            return names;
        }
        for (int i = 0; i < names.length; i++) {
            for (int j = 0; j < names.length - 1 - i; j++) {
                if (names[j].compareTo(names[j + 1]) < 0) {
                    String tmp = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = tmp;
                }
            }
        }
        return names;
    }

}
