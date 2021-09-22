package Saadaq.weekOne;

public class JavaDataTypes {


    public static void main(String[] args) {

        // byte is 8 bit it can store -128 to 127 values
        byte byteSymbol = 100;
        // short  is 16  bit  it can store -32768 up to 32767(inclusive)
        short shortSymbol = 10000;

        // int is a 32-bit minimum value of -2³1 up to 2³1 -1 values
        int intSymbol = 299999998;
        // long is 64-bit minimum values is -2 power 63 up to 2 power 63-1
        long longSymbol = 252458489;

        // float is single-precision 32-bit IEEE754 floating points, it range of values is beyond scope!!!
        float floatSymbol = 844848868F;
        // double is double-precision 64-bit IEEE 754 floating point  for decimal values. also beyond scope!!!
        double doubleSymbol = 2.54548165848D;

        //boolean 1-bit data type has only two possible values: true or false! use this for simple flags for tracking yes/no
        boolean booleanSymbol = true;
        //char data type is 16-bit Unicode character it has a minimut of "\u0000" or (0) 'uffff' (or 65,535)
        char charSymbol = 'A';

        System.out.println(byteSymbol);
        // prints byteSymbol variable
        System.out.println(shortSymbol);
        // prints Short variable
        System.out.println(intSymbol);
        // prints int Variable
        System.out.println(intSymbol);
        // prints Int
        System.out.println(longSymbol);
        // prints float
        System.out.println("is singel-precision " + floatSymbol);
        // prints double
        System.out.println(doubleSymbol);
        //  prints boolean
        System.out.println(booleanSymbol);
        //  prints character
        System.out.println(charSymbol);

        System.out.println("++++++++++++++++++++++++++++++++++++");

        // Addition

        System.out.println(byteSymbol+shortSymbol);

        // Subtraction

        System.out.println(intSymbol-longSymbol);

        // Multiplication

        System.out.println(shortSymbol*longSymbol);

        // Division

        System.out.println(shortSymbol/doubleSymbol);

        // %

        System.out.println("%% "+shortSymbol%longSymbol);


        System.out.println("_______________________________");






    }


}
