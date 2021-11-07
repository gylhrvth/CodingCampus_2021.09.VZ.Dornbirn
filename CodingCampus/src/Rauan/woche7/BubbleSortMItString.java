package Rauan.woche7;

public class BubbleSortMItString {
    public static void main(String[] args) {

        String[] names = new String[]{"Plamena", "Sadaaq", "Gyula", "Eray", "Gerri", "Stefan", "Lena", "danny", "" +
                "Ömer", "Stjepan", "Sandro", "Bartosz", "Ingo", "Rauan", "Mahir", "Lukas", "Niklas"};


        String temp;
        System.out.println("Strings in sorted order:");
        for (int j = 0; j < names.length; j++) {
            for (int i = j + 1; i < names.length; i++) {
                // comparing adjacent strings
                if (names[i].compareTo(names[j]) < 0) {
                    temp = names[j];
                    names[j] = names[i];
                    names[i] = temp;
                }
            }
            System.out.print(names[j]);
            System.out.print(",");
        }
    }
}
