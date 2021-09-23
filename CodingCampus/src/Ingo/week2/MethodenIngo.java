package Ingo.week2;

import Ingo.week1.Christbaum2;

public class MethodenIngo {
    public static void main(String[] args) {

        printNameAndAge();
        printNameAndAge();

        Christbaum2.main(null);
    }



    public static void printNameAndAge() {

        String name = "Ingo";
        int age = 22;

        //  hello(name,age);

        System.out.println("Hello " + name);
        System.out.println("your age is " + age);
    }

//    public static int numbers() {
//        int a = 4;
//        int b = 4;
//        int c = (a + b);
//        System.out.println(c);
//
//    }


}


