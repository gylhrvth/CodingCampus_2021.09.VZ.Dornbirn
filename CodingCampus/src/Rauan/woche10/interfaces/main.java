package Rauan.woche10.interfaces;

public class main {
    public static void main(String[] args) {
        Tier t = new Tier();
        Hund h = new Hund();
        Fisch f = new Fisch();
        t.atme();
        h.atme();
        f.atme();

        Lebewesen l= new  Fisch();
        l.atme();
     /*
        Lebewesen[] ls = new Lebewesen[10];
        for (int i = 0; i <10 ; i++) {
            ls[i]= new Fisch();
        }
        ls[5] = new Hund();
        ls[4] = new Tier();
        for (int i = 0; i <10 ; i++) {
            ls[i].atme();

        }


      */
        Lebewesen[] ls = new Lebewesen[5];
        for (int i = 0; i <5 ; i++) {
            ls[i]= new Tier();
        }
        ls[3]= new Hund();
        for (int i = 0; i <5 ; i++) {
            ls[i].atme();

        }
    }




}
