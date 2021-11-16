package Stefan.Week4;

public class StringBeispiele {
    public static void main(String[] args) {
        char[] c = {'x', 'y', 'z'};
        String s = String.valueOf(c);

        System.out.println(s);


        String myString = "Mein Name lautet Stefan.";

        myString.charAt(0);

        String anotherString = myString.substring(0,4);
        String anotherString2 = myString.substring(2,4);
        anotherString = "AA" + anotherString2;


        System.out.println(myString);
        System.out.println(myString.length());
        System.out.println(anotherString.toUpperCase());
        System.out.println(anotherString2);
    }
}
