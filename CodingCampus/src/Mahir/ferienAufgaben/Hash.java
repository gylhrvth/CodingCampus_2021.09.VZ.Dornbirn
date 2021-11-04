package Mahir.ferienAufgaben;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class Hash {


    public static void main(String[] args) throws IOException, NoSuchAlgorithmException {

        File file = new File("C:\\Users\\DCV\\IdeaProjects\\CodingCampus_2021.09.VZ.Dornbirn\\assets\\population-figures-by-country-csv_csv.csv");

        MessageDigest md5Digest = MessageDigest.getInstance("MD5");
        MessageDigest shaDigest = MessageDigest.getInstance("SHA-256");

//        String password = "abc123";
//        String check = getStringCheckSum(shaDigest, password);
//        Scanner scanner = new Scanner(System.in);


        String checksum = getFileCheckSum(md5Digest, file);
        String checksum2 = getFileCheckSum(shaDigest, file);
        System.out.println("MD5 : " + checksum);
        System.out.println("SHA-256 : " + checksum2);
    }

//    public static void logIn(String username, String password) throws NoSuchAlgorithmException, IOException {
//        MessageDigest md5Digest = MessageDigest.getInstance("MD5");
//        String check = getStringCheckSum(md5Digest, password);
//        if (password.contains(check)) {
//
//        }


//}

    public static String getFileCheckSum(MessageDigest digest, File file) throws IOException {
        FileInputStream ln = new FileInputStream(file);
        byte[] buffer = new byte[1024];
        int read = 0;
        while ((read = ln.read(buffer)) != -1) {
            digest.update(buffer, 0, read);
        }
        ln.close();
        byte[] bytes = digest.digest();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < bytes.length; i++) {
            sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
        }
        return sb.toString();
    }

}
