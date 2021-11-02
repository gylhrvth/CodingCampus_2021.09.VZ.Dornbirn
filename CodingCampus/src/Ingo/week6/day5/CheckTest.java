package Ingo.week6.day5;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class CheckTest {

    public static void main(String[] args) {

        String ingo = "ich, du, er, sie, es, wir, ihr, sie";
        String mahir = "wir,leben. im! ausgezeichneten, Austria in österreich, haHahaHHaaa";
        System.out.println(ingo);
        String[] splitIngo = ingo.split(", ");
        String[] splitMahir = mahir.split("[,.!]");
        System.out.println(Arrays.toString(splitMahir).toUpperCase());
        System.out.println(Arrays.toString(splitMahir).toLowerCase());
        System.out.println(Arrays.toString(splitMahir).replaceAll("e","000"));
        System.out.println(Arrays.toString(splitMahir).length());
        System.out.println(Arrays.toString(splitMahir).toCharArray());
        char[] zeichen = {'a','b','c','i','k','z','x'};
        System.out.println(zeichen);
        for (int i = 0; i < zeichen.length; i++) {
            for (int j = 0; j < zeichen.length-1; j++) {
                if(zeichen[j+1] > zeichen[j]){
                    char tmp = zeichen[j];
                    zeichen[j] = zeichen[j+1];
                    zeichen[j+1] = tmp;
                }
            }
            System.out.println(zeichen);

        }




    }
}
