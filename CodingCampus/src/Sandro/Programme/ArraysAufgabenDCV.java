package Sandro.Programme;

public class ArraysAufgabenDCV {
    public static void main(String[] args) {


        // Übung 3 - sortArray
        int[] array = {1, 2, 3, 8, 8, 22};

        System.out.println("Eingabe - 8 " + " Ausgabe - " + array[0]);
        System.out.println("Eingabe - 3 " + " Ausgabe - " + array[1]);
        System.out.println("Eingabe - 2 " + " Ausgabe - " + array[2]);
        System.out.println("Eingabe - 22 " + " Ausgabe - " + array[3]);
        System.out.println("Eingabe - 8 " + " Ausgabe - " + array[4]);
        System.out.println("Eingabe - 1 " + " Ausgabe - " + array[5]);


        // Übung 2 Palindrom detection
        boolean RENTNER = true;
        boolean Peter = false;


        if (RENTNER) {
            System.out.println(true);

        } else {
            System.out.println(false);

        }


        //Übung 1 ReverseString
        char katze = 'E';


        //übung Array Eindimensional
        int[] arrray1 = {17, 31, 49, 13, 21};

        for (int f = 0; f < arrray1.length; f++) {
            System.out.println(arrray1[f]);
        }

        System.out.println();


        int[] arrray2 = {21, 13, 49, 31, 17};

        for (int g = 0; g < arrray2.length; g++) {
            System.out.println(arrray2[g]);
        }


    }


    //übung Array Zweidimensional
    {
        int[][] arrray1 = {{0, 17}, {1, 31}, {2, 49}, {3, 13}, {4, 21}};

        for (int f = 0; f < arrray1.length; f++) {
            System.out.println(arrray1[f][0] + "," + arrray1[f][1]);
        }

        System.out.println();

        for (int f = 0; f < arrray1.length; f++) {
            System.out.println(arrray1[f][1] + "," + arrray1[f][0]);


        }

    }
}





