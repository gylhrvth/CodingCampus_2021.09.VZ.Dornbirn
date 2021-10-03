package Rauan.woche3.Array;

public class ArrayInfos {
    public static void main(String[] args) {

        //WAS IST ARRAY?!!
        //Daten Struktur, in der Datenelemente des gleiches DatenTyps unter einem gemeinsamen
        //Namen zusammen gefusst werden (homogene Struktur).
        //Die elemente das Array werden durch Indizierung des Arraynames angesprochen.

        int[] myArray = new int[4];
        myArray[0] = 1;
        myArray[1] = 2;
        myArray[2] = 3;
        myArray[3] = 4;

        System.out.println(java.util.Arrays.toString(myArray));

        String[] ana = {"Rauan", "Assaf"};
        System.out.println(java.util.Arrays.toString(ana));

        //Multi-dimensional Array
        int[][] Array = new int[2][3];
        Array[0][0] = 1;
        Array[0][1] = 2;
        Array[0][2] = 3;

        Array[1][0] = 1;
        Array[1][1] = 2;
        Array[1][2] = 3;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(java.util.Arrays.toString(new int[]{Array[i][j]}));

            }

        }

    }
}
