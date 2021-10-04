package Rauan.woche3.Array;


import java.util.Arrays;
import java.util.Random;


public class ArrayTest {

    public static Random rnd = new Random();


    public static void main(String[] args) {

        //TODO: Array auflisten mit Arrays.toString() und manuell
        int[] a = new int[20];
        for (int i = 0; i < a.length; i++) {
            a[i] = rnd.nextInt(50);
        }


        System.out.println(Arrays.toString(a));
        System.out.print("[");
        for (int i = 0; i < a.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(a[i]);
        }
        System.out.println("]");



}


// andere möglichkeit zur lösung
// int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
// for (int i = 0; i < a.length; i++) {
// System.out.println(a[i]);

// gerade zahlen


//prim zahl




       public static void primzahl(int[]a){
        System.out.print("[");
        boolean printComma=false;
        for(int j=0;j<a.length;j++){
        if(isAPrim(a[j])){
        if(printComma){
        System.out.print(", ");
        }
        System.out.print(a[j]);
        printComma=true;
        }
        }
        System.out.println("]");
        }


// primzahl und geradezahl in einer methode
public static void geradezah(int[]a){
        System.out.print("[");
        boolean geradcomma=false;
        for(int i=0;i<a.length;i++){
        if(a[i]%2==0){
        if(geradcomma){
        System.out.print(", ");
        }
        System.out.print(a[i]);
        geradcomma=true;
        }
        }
        System.out.println("]");
        }

public static boolean isAPrim(int value){
        for(int i=2;i<=(int)Math.sqrt(value);i++){
        if(value%i==0)return false;
        }
        return true;


        }
        }









