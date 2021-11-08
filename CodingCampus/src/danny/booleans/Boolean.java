package danny.booleans;


public class Boolean {
    public static void main(String[] args) {
//Aufgabe 1

        int schokiImKuelschrank = 2;
        boolean mussKaufen = schokiImKuelschrank <= 2;
        if (mussKaufen) {
            System.out.println("muss neue Schoki kaufen");
        } else {
            System.out.println("Genug Schoki da");
        }
//Aufgabe 2
        boolean feiertag = true;
        boolean wochenende = false;
        boolean prima = feiertag == !wochenende;

        if (prima) {
            System.out.println("Finde es Prima");
        } else {
            System.out.println("Finde es Blöd");
        }

        //Aufgabe 3
        boolean enoughMoneyWithIt = false;
        boolean bankcardWithIt = false;
        boolean enoughMoneyOnTheAccount = true;

        boolean BuyShoes = (enoughMoneyWithIt || bankcardWithIt == enoughMoneyOnTheAccount);

        if (BuyShoes) {
            System.out.println("Geh Schuhe kaufen:)");
        }else{
            System.out.println(("Kann keine Schuhe kaufen:("));
        }

        double x = 3.44433;
                int y = (int)x;

        System.out.println(y);

    }

}






