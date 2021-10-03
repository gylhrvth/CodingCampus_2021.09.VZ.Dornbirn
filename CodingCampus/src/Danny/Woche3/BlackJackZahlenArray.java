package Danny.Woche3;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BlackJackZahlenArray {
    public static void main(String[] args) {


        int[] deck = new int[52];
        deck = kartenDeckErstellen(deck);
        int kartenPositionImDeck = 0;
        int positonnummerDerKarte = deck[kartenPositionImDeck];
        boolean dealerOver21 = true;
        Scanner scanner = new Scanner(System.in);
        int stelleKartendeckPlayer = 0;

//Spieler erstellen [1] Player [2] Kartendeck [3] Kartendeckgröße
        System.out.println("Wieviele Spieler wollen mitspielen?");
        int[][] player = new int[scanner.nextInt() + 1][52];
//Counter
        int cout = 0;
//Erste Runde(jeder bekommt eine Karte)

        for (int i = 0; i < player.length; i++) {
            player[i][0] = kartenPositionImDeck;
            kartenPositionImDeck++;
            player[i][51] = cout;
        }
        cout++;
//Karten aller Player anzeigen (Erste Runde)

        for (int a = 0; a < player.length; a++) {
            for (int x = 0; x <= player[a][51]; x++) {
                if (a < player.length - 1) {
                    System.out.println("Spieler " + (a + 1));
                    kartenName(player[a][x]);
                    System.out.println();

                    System.out.println("Punkte " + kartenWert(player[a][x],false) );
                    player[a][50] = kartenWert(player[a][x],false);
                    System.out.println("Gesammtpunkte " + player[a][50] );
                    System.out.println("--------------------");
                } else {
                    System.out.println("Dealer ");
                    kartenName(player[a][x]);
                    System.out.println();

                    System.out.println("Punkte " + kartenWert(player[a][x],false) );
                    player[a][50] = kartenWert(player[a][x],false);
                    System.out.println("Gesammtpunkte " + player[a][50] );
                    System.out.println("--------------------");
                }
            }
        }
//Ab Runde 2 ohne Dealer bis Player fertig       hier weiter machen



    }








    public static int[] kartenDeckErstellen(int deck[]) {
//array mit Kartenanzahl füllen
        int a = 0;
        for (int x = 1; x <= deck.length; x++) {
            deck[a] = x;
            a++;
        }

//Kartendeck mischen
        int puffer = deck[0];
        Random rand = new Random();
        int letzerRand = 0;

        for (int y = 0; y <= 1000; y++) {
            int randVar = rand.nextInt(52);
            deck[letzerRand] = deck[randVar];
            letzerRand = randVar;
        }
        deck[letzerRand] = puffer;
        return deck;
    }


//KartenName zuordnen

    public static void kartenName(int positonnummerDerKarte) {

        //Farbe zuordnen
        if (positonnummerDerKarte >= 0 && positonnummerDerKarte <= 13) {
            System.out.print("Herz ");
        } else if (positonnummerDerKarte >= 14 && positonnummerDerKarte <= 26) {
            System.out.print("Karo ");
        } else if (positonnummerDerKarte >= 27 && positonnummerDerKarte <= 39) {
            System.out.print("Shell ");
        } else if (positonnummerDerKarte >= 40 && positonnummerDerKarte <= 52) {
            System.out.print("Blatt ");
        }

        //Zahl oder Person zuordnen
        if (positonnummerDerKarte >= 2 && positonnummerDerKarte <= 10) {
            System.out.print(positonnummerDerKarte);
        } else if (positonnummerDerKarte >= 15 && positonnummerDerKarte <= 24) {
            System.out.print(positonnummerDerKarte - 13);
        } else if (positonnummerDerKarte >= 28 && positonnummerDerKarte <= 36) {
            System.out.print(positonnummerDerKarte - 26);
        } else if (positonnummerDerKarte >= 41 && positonnummerDerKarte <= 49) {
            System.out.print(positonnummerDerKarte - 39);
        } else if (positonnummerDerKarte == 11 || (positonnummerDerKarte - 11) % 13 == 0) {
            System.out.print("Bube");
        } else if (positonnummerDerKarte == 12 || (positonnummerDerKarte - 12) % 13 == 0) {
            System.out.print("Dame");
        } else if (positonnummerDerKarte == 13 || (positonnummerDerKarte - 13) % 13 == 0) {
            System.out.print("König");
        } else if (positonnummerDerKarte == 1 || (positonnummerDerKarte - 1) % 13 == 0) {
            System.out.print("Ass");
        }

    }

    //KartenWert zuordnen

    public static int kartenWert(int positonnummerDerKarte, boolean dealerOver21) {
        int wert = 0;
        //Wert zuordnen
        if (positonnummerDerKarte >= 2 && positonnummerDerKarte <= 10) {
            wert = (positonnummerDerKarte);
        } else if (positonnummerDerKarte >= 15 && positonnummerDerKarte <= 24) {
            wert = (positonnummerDerKarte - 13);
        } else if (positonnummerDerKarte >= 28 && positonnummerDerKarte <= 36) {
            wert = (positonnummerDerKarte - 26);
        } else if (positonnummerDerKarte >= 41 && positonnummerDerKarte <= 49) {
            wert = (positonnummerDerKarte - 39);
        } else if (positonnummerDerKarte == 11 || (positonnummerDerKarte - 11) % 13 == 0) {
            wert = 10; //Bube
        } else if (positonnummerDerKarte == 12 || (positonnummerDerKarte - 12) % 13 == 0) {
            wert = 10; //Dame
            ;
        } else if (positonnummerDerKarte == 13 || (positonnummerDerKarte - 13) % 13 == 0) {
            wert = 10; //König
            ;
        } else if (positonnummerDerKarte == 1 || (positonnummerDerKarte - 1) % 13 == 0) {
            if (dealerOver21 == true) { //ASS
                wert = 1;
            } else {
                wert = 11;
            }
        }

        return wert;
    }


}
