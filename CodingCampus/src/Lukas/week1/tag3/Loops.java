package Lukas.week1.tag3;

public class Loops {
    public static void main(String[] args) {
        //Format Code Strg + Alt + L

        //For schleife
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        //While schleife
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
        }

        //Sinnbefreite for schleife
        int j = 0;
        for (; j < 10; ) {
            System.out.println(j);
            j++;
        }

        //continue
        for (int k = 0; k < 10; k++) {
            if (k % 2 != 0) {
                continue;
            }
            System.out.println(k);
        }

        //break
        int l = 0;
        while (true) {
            System.out.println(l);
            l++;
            if (l == 10) {
                break;
            }
        }

        for (int m = 0; m < 10; m++) {
            System.out.println("m->" + m);
            for (int n = 0; n < 10; n++) {
                System.out.print("n->" + n);
            }
        }
    }
}
