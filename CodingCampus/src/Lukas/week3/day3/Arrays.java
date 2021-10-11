package Lukas.week3.day3;

public class  Arrays {
    public static void main(String[] args) {
        int[] intArray1 = new int[3];
        intArray1[0] = 1;
        intArray1[1] = 2;
        intArray1[2] = 3;

        System.out.println(java.util.Arrays.toString(intArray1));

        //Nur möglich wenn Deklaration mit direkter initialisierung erfolgt
        int[] intArray2 = {1, 2, 3};
        //NICHT MÖGLICH
        //intArray2 = {1,2,3};

        System.out.println(java.util.Arrays.toString(intArray2));

        int[] intArray3 = new int[]{1, 2, 3};
        //MÖGLICH
        //intArray3 = new int[]{1,2,3};

        System.out.println(java.util.Arrays.toString(intArray3));

        for (int i = 0; i < intArray3.length; i++) {
            System.out.println("Index: " + i + "->" + intArray3[i]);
        }

        for (int x : intArray3) {
            System.out.println(x);
        }

        //Namen vom Kurs
        //Variablen deklaration
        String[] namesOfCourse;
        //Initialisierung
        namesOfCourse = new String[]{"Stjepan", "Ömer", "Danny", "Bartosz", "Sadaaq", "Gerhard", "Stefan", "Plamena", "Eray", "Sandro", "Lena", "Ingo", "Mahir", "Rauan", "Lukas"};

        for (int i = 0; i < namesOfCourse.length; i++) {
            System.out.println(namesOfCourse[i]);
        }

        for (String name : namesOfCourse) {
            System.out.println(name);
        }

        //Mit Leerzeichen getrennt
        for (String name : namesOfCourse) {
            System.out.print(name + " ");
        }
        System.out.println();

        //Mit Beistrich getrennt
        for (String name : namesOfCourse) {
            System.out.print(name + ", ");
        }
        System.out.println();

        //Mit Beistrich getrennt, aber nicht ganz am Schluss
        for (int i = 0; i < namesOfCourse.length - 1; i++) {
            System.out.print(namesOfCourse[i] + ", ");
        }
        System.out.println(namesOfCourse[namesOfCourse.length - 1]);

        //Mit Beistrich getrennt, aber nicht ganz am Schluss, andere Lösung
        boolean setComma = false;
        for (String name : namesOfCourse) {
            if (setComma) {
                System.out.print(", ");
            } else {
                setComma = true;
            }
            System.out.print(name);
        }
        System.out.println();

        String output = "";
        for (String name : namesOfCourse) {
            if (output.length() > 0) {
                output += ", ";
            }
            output += name;
        }
        System.out.println(output);

        StringBuilder builder = new StringBuilder();
        for (String name : namesOfCourse) {
            if (builder.length() > 0) {
                builder.append(", ");
            }
            builder.append(name);
        }
        System.out.println(builder);

        System.out.println("Im Kurs befinden sich " + namesOfCourse.length + " Teilnehmer_innen");

        String myString1 = "Hallo";
        char[] myCharArray = myString1.toCharArray();

        //https://tools.piex.at/ascii-tabelle/
        System.out.println('1' == 1);
        System.out.println('1' == 49);

        //Gibt die Zahlenwerte der Character aus
        for (int myInt : myCharArray) {
            System.out.println(myInt);
        }

        //Obere Lösung gebugfixed
        for (int myInt : myCharArray) {
            System.out.println((char) myInt);
        }

        //Obere Lösung richtig gebugfixed
        for (char myChar : myCharArray) {
            System.out.println(myChar);
        }

        //Umwandlung von char array zu String
        char[] myCharArray2 = new char[]{'H', 'a', 'l', 'l', 'o'};

        String myString2 = new String(myCharArray2);
        System.out.println(myString2);
    }

    //1)
    //Leichte Aufgabe zum Aufwärmen


    //Eine Zeile aus der Kommandozeile einlesen
    //Zeile ausgeben
    //Zeile in Character Array verwandeln
    //Variante a) Direkt umgedreht ausgeben
    //Variante b) Umdrehen mithilfe eines Strings -> String ausgeben
    //Variante c) Umdrehen mithilfe eines neuen Character Arrays -> Character Array in String umwandeln und ausgeben
    //Variante d) Umdrehen im bestehenden Array des Inputs -> Character Array in String umwandeln und ausgeben


    //2)
    //Buchstaben case insensitive Zählen (A zählt für a)




    //und ausgeben wie oft jeder Buchstabe vorkommt
    //TIP aus einem Character kann man eine Zahl gewinnen, bzw. man kann diesen als Zahl annehmen

    //3)
    //Schlaue Menge
    //Lies dir folgendes durch:
    //https://www.brandeins.de/magazine/brand-eins-wirtschaftsmagazin/2005/die-mitte/schlaue-menge
    //Entwickle ein Program welches zuerst fragt, wieviele Teilnehmer beim Expirement mitmachen
    //erstelle ein Array in der größe der Teilnehmer, der Typ des Arrays soll Float sein.
    //Frage jeden Teilnehmer nach seiner Schätzung.
    //Am Ende berechne den Durchschnitt (arithmetisches Mittel) aller Werte und gib diesen aus.
}
