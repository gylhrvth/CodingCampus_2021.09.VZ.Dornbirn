package Ingo.week5;

import java.util.Arrays;

public class day1 {
    public static void main(String[] args) {

        String[] namesCourse = new String[]{"Stjepan", "Ömer", "Danny", "Bartosz", "Sadaaq", "Gerhard", "Stefan", "Plamena", "Eray", "Sandro", "Lena", "Ingo", "Mahir", "Rauan", "Lukas"};

        for (int i = 0; i < namesCourse.length; i++) {
            System.out.println(namesCourse[i]);
        }
        for (String names : namesCourse){
            System.out.print("  " +names);
        }
        for (int i = 0; i < namesCourse.length; i++) {

        }
        System.out.println("---------------------------------");
        System.out.println(Arrays.toString(namesCourse));
        Arrays.sort(namesCourse);
        System.out.println(Arrays.toString(namesCourse));

        System.out.println("----------------------------");

        for (int i = namesCourse.length-1; i >=0; i--) {
            System.out.print("  " +namesCourse[i]);
        }
        System.out.println("-----------------------");

        for (int i = 0; i < namesCourse.length; i++) {
            for (int j = 0; j < namesCourse.length-1; j++) {
                if (namesCourse[j].compareTo(namesCourse[j+1])>0){
                    String temp = namesCourse[j+1];
                    namesCourse[j+1] = namesCourse[j];
                    namesCourse[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(namesCourse));

        System.out.println("-----------------------");
        // Aufgabe längstes Wort finden !!!

        for (int i = 0; i < namesCourse.length; i++) {
            for (int j = 0; j < namesCourse.length-1; j++) {
                if (namesCourse[j].length() < namesCourse[j+1].length()){
                    String tmp = namesCourse[j+1];
                    namesCourse[j+1] = namesCourse[j];
                    namesCourse[j] = tmp;
                }
            }
        }
        System.out.println();
        System.out.println(namesCourse[namesCourse.length-1]);
        // Aufgabe kürzestes Wort finden !!!

        for (int i = 0; i < namesCourse.length; i++) {
            for (int j = 0; j < namesCourse.length-1; j++) {
                if (namesCourse[j].length() > namesCourse[j+1].length()){
                    String tmp = namesCourse[j];
                    namesCourse[j] = namesCourse[j+1];
                    namesCourse[j+1] = tmp;
                }
            }
        }
        System.out.println(namesCourse[namesCourse.length-1]);

        String[] fritz = {"cih","wir","du","sie","euch"};
        char[] char1 = fritz[0].toCharArray();

    }

}
