package Stefan.thirdWeek.Strings;

public class funktionen {
    public static void main(String[] args) {
//        int[] zahl =  new int[5];
//        int i=0;
//        while (i<zahl.length) {
//            zahl[i]=i;
//            System.out.println(zahl[i]);
//            i++;
//        }

        String[] cars = {"Volvo", "BMW", "Mazda", "Merzedes"};

        cars[3] = "Opel";   //Tauscht das angegebene Element auf der Position

        System.out.println(cars[3]);   //Gibt die angegebene Position aus

        System.out.println(cars.length);   //Gibt wieviel Werte im Arrey gespeichert sind

        for (int i = 0; i < cars.length; i++) {   //Gibt den ganzen Inhalt des Arreys aus
            System.out.println(cars[i]);
        }
    }
}
