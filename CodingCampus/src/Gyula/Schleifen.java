package Gyula;

public class Schleifen {
    public static void main(String[] args) {
        int rest = 10; // init
        while (rest > 0){ // prüfung
            System.out.println("Hello World!");
            --rest; // hochzählen
        }

        for (int i = 0; i < 10; ++i){
            System.out.println(i + ". round");
        }

        int size = 5;
        for (int i = 0; i < size; ++i){
            for (int j = 0; j < size; j++) {
                System.out.print("A");
            }
            System.out.println();
        }

    }
}
