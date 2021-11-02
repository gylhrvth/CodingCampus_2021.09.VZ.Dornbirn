package Eray.week6FerienUebungen.hashSummePruefSumme;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Md5AndSha256 {
    public static void main(String[] args) {
        printAll();
    }

    public static void printAll() {
        try {
            md5Sum();
            printSha256();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static File file = new File("assets/file.txt");

    public static void printSha256() throws NoSuchAlgorithmException, IOException {

        MessageDigest shaDigest = MessageDigest.getInstance("SHA-256");
        String sha256Checksum = getFileChecksum(shaDigest, file);
        System.out.println("Die HashNummer der md5 datei beträgt: " + sha256Checksum);
    }


    public static void md5Sum() throws NoSuchAlgorithmException, IOException {
        MessageDigest md5Digest = MessageDigest.getInstance("MD5");
        String checksum = getFileChecksum(md5Digest, file);
        System.out.println("Die HashNummer der md5 datei beträgt: " + checksum);
    }


    public static String getFileChecksum(MessageDigest digest, File file) throws IOException {
        FileInputStream fis = new FileInputStream(file);
        byte[] byteArray = new byte[1024];
        int bytesCount = 0;

        while ((bytesCount = fis.read(byteArray)) != -1) {
            digest.update(byteArray, 0, bytesCount);
        }

        fis.close();

        byte[] bytes = digest.digest();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < bytes.length; i++) {
            sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
        }

        return sb.toString();
    }
}
