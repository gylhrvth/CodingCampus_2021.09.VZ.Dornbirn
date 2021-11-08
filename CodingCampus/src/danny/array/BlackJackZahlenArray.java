package danny.array;

import java.util.Random;
import java.util.Scanner;

public class BlackJackZahlenArray {
    public static int aktuellPL = 0;

    public static void main(String[] args) {


        int[] deck = new int[52];
        deck = kartenDeckErstellen(deck);
        int kartenPositionImDeck = 0;
        int positonnummerDerKarte = deck[kartenPositionImDeck];
        boolean dealerOver21 = true;
        Scanner scanner = new Scanner(System.in);
        int stelleKartendeckPlayer = 0;
        int gesammtWert = 0;
        boolean wertOver21 = false;
        boolean wertOver17 = true;

//Spieler erstellen [1] Player [2] Kartendeck
        System.out.println("Wieviele Spieler wollen mitspielen?");
        int[][] player = new int[scanner.nextInt() + 1][52];
        int[] endPoints = new int[player.length];
//Counter
        int cout = 0;
//Erste Runde(jeder bekommt zwei Karten)
        for (int i = 0; i < player.length; i++) {
            for (int s = 0; s < 2; s++) {
                player[i][s] = kartenPositionImDeck;
                kartenPositionImDeck++;
                player[i][51]++;
            }
        }
//Karten aller Player anzeigen (Erste Runde)
        for (int aktuellPL = 0; aktuellPL < player.length; aktuellPL++) {
            if (aktuellPL < player.length - 1) {
                kartendeckAnzeigenSpieler(aktuellPL, player, deck);
                System.out.println();
                kartenWertAnzeigenSpieler(aktuellPL, player, deck);
                System.out.println();
                gesammtWertausgebenSpieler(aktuellPL, player, deck, gesammtWert, endPoints, wertOver21);
                if (endPoints[aktuellPL] == 21) {
                    wertOver21 = true;
                    System.out.println("Du hast gewonnen");
                }
                System.out.println();
            } else {
                kartendeckAnzeigenDealer(aktuellPL, player, deck);
                System.out.println();
                kartenWertAnzeigenSpieler(aktuellPL, player, deck);
                System.out.println();
                gesammtWertausgebenDealer(aktuellPL, player, deck, gesammtWert, endPoints, wertOver21);
                if (endPoints[aktuellPL] == 21) {
                    wertOver21 = true;
                    System.out.println("Du hast gewonnen");
                }
                System.out.println();
            }
        }

//Ab Runde 2 ohne Dealer bis Player fertig

        for (int aktuellPL = 0; aktuellPL < player.length - 1; aktuellPL++) {
            int jANein = 0;
            wertOver21 = false;
            while (jANein != 2 && wertOver21 == false) {
                System.out.println("Spieler " + (aktuellPL + 1) + " möchtest du eine weitere Karte");
                System.out.println("1 = JA");
                System.out.println("2 = NEIN");
                System.out.println("--------------------");
                jANein = scanner.nextInt();

                //Spieler zieht Karte
                if (jANein == 1) {
                    cout = player[aktuellPL][51];
                    player[aktuellPL][cout] = kartenPositionImDeck;
                    kartenPositionImDeck++;
                    cout++;
                    player[aktuellPL][51] = cout;
                    kartendeckAnzeigenSpieler(aktuellPL, player, deck);
                    System.out.println();
                    kartenWertAnzeigenSpieler(aktuellPL, player, deck);
                    System.out.println();
                    gesammtWertausgebenSpieler(aktuellPL, player, deck, gesammtWert, endPoints, wertOver21);
                    if (endPoints[aktuellPL] > 21) {
                        wertOver21 = true;
                        System.out.println("Game Over");
                    } else if (endPoints[aktuellPL] == 21) {
                        wertOver21 = true;
                        System.out.println("Du hast gewonnen");
                    }
                    System.out.println("--------------------");
                }}}
        //Dealer isr an der Reihe
        aktuellPL = player.length - 1;
        wertOver17 = false;
        while (wertOver17 == false && endPoints[aktuellPL] < 17) {
            //Dealer zieht Karte
            cout = player[aktuellPL][51];
            player[aktuellPL][cout] = kartenPositionImDeck;
            kartenPositionImDeck++;
            cout++;
            player[aktuellPL][51] = cout;
            kartendeckAnzeigenDealer(aktuellPL, player, deck);
            System.out.println();
            kartenWertAnzeigenSpieler(aktuellPL, player, deck);
            System.out.println();
            gesammtWertausgebenDealer(aktuellPL, player, deck, gesammtWert, endPoints, wertOver21);
            if (endPoints[aktuellPL] > 21) {
                wertOver21 = true;
                System.out.println("Game Over");
            } else if (endPoints[aktuellPL] == 21) {
                wertOver21 = true;
                System.out.println("Du hast gewonnen");
            }
            System.out.println("--------------------");

        }
        //Punkte aller Spieler anzeigen und Gewinner ermitteln
        int playerGewinner = 0;
        int gewinnerPunkte = 0;
        for (int i = 0; i < endPoints.length; i++) {

            if (i == endPoints.length - 1) {
                System.out.println("Dealer " + "Punkte " + endPoints[i]);
            } else {
                System.out.println("Spieler " + (i + 1) + " Punkte " + endPoints[i]);
            }
            if (endPoints[i] > gewinnerPunkte && endPoints[i] <= 21) {
                gewinnerPunkte = endPoints[i];
                playerGewinner = i;
            }
        }
        if (playerGewinner == endPoints.length - 1) {
            System.out.println("Dealer gewinnt mit" + gewinnerPunkte + "Punkten");
        } else {
            System.out.println("Spieler " + (playerGewinner + 1) + " gewinnt mit " + gewinnerPunkte + " Punkten");
        }

    }


//////////////////////////////////////////////////////////////////////

    public static int[] gesammtWertausgebenDealer(int aktuellPL, int[][] player, int[] deck, int gesammtWert, int[] endPoints, boolean wertOver21) {
        gesammtWert = 0;
        for (int x = 0; x < player[aktuellPL][51]; x++) {
            gesammtWert += kartenWert(deck[player[aktuellPL][x]], false);
        }
        if (gesammtWert > 21) {
            gesammtWert = 0;
            for (int x = 0; x < player[aktuellPL][51]; x++) {
                gesammtWert += kartenWert(deck[player[aktuellPL][x]], true);
            }
        }
        System.out.println("Gesammtpunkte " + gesammtWert);
        endPoints[aktuellPL] = gesammtWert;

        return endPoints;
    }


    public static int[] gesammtWertausgebenSpieler(int aktuellPL, int[][] player, int[] deck, int gesammtWert, int[] endPoints, boolean wertOver21) {
        gesammtWert = 0;
        for (int x = 0; x < player[aktuellPL][51]; x++) {
            gesammtWert += kartenWert(deck[player[aktuellPL][x]], false);
        }
        if (gesammtWert > 21) {
            gesammtWert = 0;
            for (int x = 0; x < player[aktuellPL][51]; x++) {
                gesammtWert += kartenWert(deck[player[aktuellPL][x]], true);
            }
        }
        System.out.println("Gesammtpunkte " + gesammtWert);
        endPoints[aktuellPL] = gesammtWert;


        return endPoints;
    }

    public static void kartenWertAnzeigenSpieler(int aktuellPL, int[][] player, int[] deck) {

        for (int w = 0; w < player[aktuellPL][51]; w++) {
            System.out.print("Punkte " + kartenWert(deck[player[aktuellPL][w]], false) + ", ");
            player[aktuellPL][50] = kartenWert(deck[player[aktuellPL][w]], false);
        }

    }

    public static void kartendeckAnzeigenDealer(int aktuellPL, int[][] player, int[] deck) {
        System.out.println("Dealer ");
        for (int x = 0; x < player[aktuellPL][51]; x++) {
            kartenName(deck[player[aktuellPL][x]]);
            System.out.print(", ");
        }
    }


    public static void kartendeckAnzeigenSpieler(int aktuellPL, int[][] player, int[] deck) {
        System.out.println("Spieler " + (aktuellPL + 1));
        for (int x = 0; x < player[aktuellPL][51]; x++) {
            kartenName(deck[player[aktuellPL][x]]);
            System.out.print(", ");
        }
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
        //      System.out.println(Arrays.toString(deck));
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

        } else if (positonnummerDerKarte == 13 || (positonnummerDerKarte - 13) % 13 == 0) {
            wert = 10; //König

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
