package Gerhard.week3.day1;

public class Arrays {

    public static void main(String[] args) {


        String s1 = "Das ist ein Java String";
        String s2 = new String("Das ist ein zweiter Java String");

        char char1 = s1.charAt(12);//char1 speichert die Rückgabe der Methode am Objekt s1
        System.out.println(char1);// Rückgabe J

        char char2 = s2.charAt(12);//char2 speichert die Rückgabe der Methode auf dem Objekt s2
        System.out.println(char2);// Rückgabe z
    }
}

