package Danny.Woche3;

public class ModulaTest {
    public static void main(String[] args) {

        int x = 1;


        for (int i = 1; i <= 52; i++) {
            int zahl = 52 % x;
            System.out.print(i + ", ");
            System.out.println(zahl + ", ");
            x++;
        }

    }
}
