package Saadaq.Week4;

import java.util.Arrays;
import java.util.Collection;
import java.util.Locale;

public class Sorting {


    public static void main(String[] args) {



        // String manipulation random things


        String text = "Hello world is my first coding lesson that i had my first class in the campus";

        // Replace

        System.out.println(text.replace("world","friends"));

        // to lower case


        System.out.println(text.toLowerCase(Locale.ROOT));

        // sub String













        // Creating Strings

        String first = "Java";
        String second = "Java";
        String third = "JavaScript";

        // prints Strings

        System.out.println(first);
        System.out.println(second);
        System.out.println(third);

        int length = first.length();
        System.out.println("Lenth: "+ length);



        int i = first.compareTo(second);// 0 for both are equal

        if(i==0){
            System.out.println("Both string are equal.");

        }else {
            System.out.println("string are not equal.");
        }









    }




}
