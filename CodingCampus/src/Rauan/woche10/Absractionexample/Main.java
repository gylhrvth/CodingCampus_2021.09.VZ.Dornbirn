package Rauan.woche10.Absractionexample;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Fahrzeug> fahrzeugs = creatFahrzeug(10);
        drive(100, fahrzeugs);


         Fahrzeug rollerblades = new Fahrzeug() {
             @Override
             public void start() {
                 System.out.println("Ich ziehe mein Rollerblades an");
             }

             @Override
             public void stop() {
                 System.out.println("Ich machen einen T-Break und ziehe die Rollerblades aus");}

         };
         rollerblades.drive(1000);

    }

    private static void drive(int km, List<Fahrzeug> fahrzeugs) {
        for (int i = 0; i < fahrzeugs.size(); i++) {
            fahrzeugs.get(i).drive(km);

        }

    }

    private static List<Fahrzeug> creatFahrzeug(int nummber) {
        List<Fahrzeug> fahrzeugList = new ArrayList<>();
        for (int i = 0; i < nummber; i++) {
            if (Math.random() >= 0.5) {
                fahrzeugList.add(new Auto());
            } else {
                fahrzeugList.add(new Fahrrad());
            }


        }
        return fahrzeugList;
    }

}
