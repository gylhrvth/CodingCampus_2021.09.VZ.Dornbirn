package Danny.woche8.klassen.a;

public class TakePhoto {
    public static void main(String[] args) {

        Camera nikon = new Camera(18,105,
                "D5200","Nikon",24.1);

        Camera canon = new Camera(30,70,
                "XY150","Nikon",18.5);


       // canon.takeFoto();

        takePhoto(nikon);
        System.out.println();
        System.out.println(canon);
    }
    public static void takePhoto (Camera manufacture) {

        System.out.println("Eine nette Ausgabe " + manufacture);

    }

}
