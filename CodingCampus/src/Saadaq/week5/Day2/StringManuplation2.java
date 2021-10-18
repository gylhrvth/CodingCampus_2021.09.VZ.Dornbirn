package Saadaq.week5.Day2;

public class StringManuplation2 {
    public static void main(String[] args) {





        String someString = "Hello world friends";
        char someChar = 'e';

        int count = 0;

        for (int i=0; i<someString.length(); i++){

            if (someString.charAt(i) == someChar){
                count++;
            }

        }

        String str3= "Testing";

        int count2 = str3.length();

        System.out.println("this String has "+count2+"  characters");













    }// end of Main


}// End of Class
