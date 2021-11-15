package Danny.string;

public class Strings_Aufgaben_Aufgabe_1 {

    public static void main(String[] args) {

        String name = "Alexander";
        boolean gleicherName = name.equalsIgnoreCase("Trump");
        if (gleicherName) {
            System.out.println("Name ist gleich");
        } else {
            System.out.println("Name ist nicht gleich");
        }
        char b = name.charAt(1);
        System.out.println(b);

        System.out.println(name.substring(0, 3));

        String upperName = name.toUpperCase();
        System.out.println(upperName);
        String lowerName = upperName.toLowerCase();
        System.out.println(lowerName);

}


}




