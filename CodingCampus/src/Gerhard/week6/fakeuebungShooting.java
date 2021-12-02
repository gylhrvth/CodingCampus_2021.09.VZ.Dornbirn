package Gerhard.week6;

import java.io.*;
import java.util.Scanner;

public class fakeuebungShooting {

    public static void main(String[] args) {

        try {
            BufferedReader br = new BufferedReader(
                    new FileReader("C:\\Users\\DCV\\Desktop\\testtext.txt"));
            String s;
            while ((s = br.readLine()) != null) {
                System.out.println(s);
            }
            br.close();
        } catch (Exception ex) {
            ex.printStackTrace();

        }
    }
}
//        try {
//            BufferedWriter bw = new BufferedWriter(
//                    new FileWriter("assets/tmp/testFileWrite.txt"));
//
//            bw.write("gerry\n");
//            bw.write("gerry\n");
//            bw.write("test\n");
//            bw.close();
//        } catch (Exception ex){
//            return;
//
//
//    }


