package Sandro.week3.tag3;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysÜbungVonLukas {

    public static void main(String[] args) {

        //  TODO:  Eine Zeile aus der Kommandozeile einlesen
        //         Zeile ausgeben
        //         Zeile in Character Array verwandeln

        System.out.println("Tragen Sie die Namen des Studenten ein: ");

        Scanner scanner = new Scanner(System.in);
        String nameStudents = scanner.nextLine();
        System.out.println(nameStudents);
        char[] myCharArray = nameStudents.toCharArray();

        //TODO: Variante a) Direkt umgedreht ausgeben

        for (int i = myCharArray.length - 1; i >= 0; i--) {
            System.out.print(myCharArray[i]);
        }
        //TODO: Variante b) Umdrehen mithilfe eines Strings -> String ausgeben

        System.out.println(Arrays.toString(myCharArray));

        //TODO: Variante c) Umdrehen mithilfe eines neuen Character Arrays -> Character Array in String umwandeln und ausgeben


    }




















    /*
    //n i k l a s      <- length: 6
    //0 1 2 3 4 5
    //-3 -2 -1 0 1 2 3 4 5
        System.out.println();

        System.out.println("WieViele Studenten möchten Sie eintragen: ");

        Scanner scanner = new Scanner(System.in); // Scanner instanziiert

        int amountStudents = scanner.nextInt(); // Eingabe der Anzahl der Studenten in der Konsole
        String[] studentsArray = new String[amountStudents]; // Eingabe in ein Array gepackt
        System.out.println(amountStudents); // Ausgabe Anzahl der Studenten (Array)


        System.out.println();


        System.out.println("Tragen Sie die Namen der Studenten ein: ");

        for (int i = 0; i < studentsArray.length; i++) {                                                                        // For Schleife für die Eingabe der Namen
            studentsArray[i] = scanner.next();                                                                                  // Eingabe der Namen


            System.out.println(Arrays.toString(studentsArray)); // Ausgabe der Namen der Studenten (Array)


            String[] studentsArray2 = new String[amountStudents];
            char myChar = new char (studentsArray2);
            System.out.println(myChar);
*/


}
