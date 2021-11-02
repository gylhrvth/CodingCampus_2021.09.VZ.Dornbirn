package Sandro.test;

public class stringOperationen {

    public static void main(String[] args) {

        emailRegex();
        replaceAll();
        replaceAll2();
        replaceAll3();
    }

    public static void emailRegex() {

        String rebert = "[a-zA-Z0-9\\+\\.\\_\\%\\-\\+]{1,256}" +
                "\\@" +
                "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,64}" +
                "(" +
                "\\." +
                "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,25}" +
                ")+";


        System.out.println("alfons@drlue.at".matches(rebert));
        System.out.println("rambina.alfons@drlue.at".matches(rebert));
        System.out.println("rambina1.1alfons@drlue.at".matches(rebert));
        System.out.println("1rambina1.alfons@drlue.at".matches(rebert));
        System.out.println("@drlue.at".matches(rebert));
        System.out.println("drlue.at".matches(rebert));
        System.out.println("asdf@drlue".matches(rebert));
        System.out.println();
    }

    public static void replaceAll() {

        String sentence = "Heute wird ein guter Tag! Heute wird ein noch guterer Tag! Heute wird ein spitzen guter Tag!";

        System.out.println(sentence.replaceAll("wird", "war und ist"));
        System.out.println();
    }

    public static void replaceAll2() {

        String sentence = "Heute wird ein guter Tag! Heute wird ein noch guterer Tag! Heute wird ein spitzen guter Tag!";
        System.out.println(sentence.replaceAll("[a-z]", ""));
        System.out.println(sentence.replaceAll("[A-Z]", ""));
        System.out.println(sentence.replaceAll(" ", ""));
        System.out.println(sentence.replaceAll("[!]", ""));
        System.out.println();
    }

    public static void replaceAll3() {

        String sentence = "749813247132984712039487123049871204398712039487";
        System.out.println(sentence.replaceAll("[0-9]",""));
        System.out.println(sentence.replaceAll("[1-9]", ""));
        System.out.println(sentence.replaceAll("[2-4]",""));
        System.out.println(sentence.replaceAll("[1-36-9]", ""));

    }


}
