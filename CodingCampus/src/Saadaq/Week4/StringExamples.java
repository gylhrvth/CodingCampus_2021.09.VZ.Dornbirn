package Saadaq.Week4;

import java.util.Arrays;
import java.util.Locale;

public class StringExamples {

   public static void main(String[] args){

       String testText = "Hello my Coders! Today is a nice day for coding";
       String secondText = "abcdfjlksdfjlksflksfjksfj";

       System.out.println(testText);

       System.out.println("Länge: "+ testText.length());

       for(int i=0; i<testText.length(); i++){
           System.out.println(" "+ testText.charAt(i));

       }if(testText.contains("World!")){
           System.out.println("World! has been found");
       }
       if (testText.contains("nichtVorhanden")){
           System.out.println("!!!! That shal not happen");

       }
       if (testText.startsWith("He")){
           System.out.println("Ends with \"he\"");

       }
       if (testText.endsWith("He")){
           System.out.println("Ends with \"HE\"");
       }

       System.out.println("LowerCase: "+ testText.toLowerCase());
       System.out.println("UpperCase: "+ testText.toUpperCase());

       System.out.println("repeat: "+ testText.repeat(5));
       System.out.println("Concate: "+ testText + secondText);
       System.out.println("Concate: "+ testText.concat(secondText));

       System.out.println(testText.replace("World", "Saadaq"));
       System.out.println("substring 2x");
       System.out.println("Substring(....0, 3):"+ testText.substring(0, 3));
       System.out.println("Substring(..., 3 )"+ testText.substring(3));


       String[] words = testText.split(" ");

       System.out.println("________Splite_____");

       System.out.println(Arrays.toString(words));








   }// End of Main


}  // End of Class
