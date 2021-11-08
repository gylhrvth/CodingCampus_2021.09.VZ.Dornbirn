package danny.hashsum;

import java.io.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;


public class Checksum {
    // Algo MD5 or SHA256
    public static String algo = "SHA256";

    public static byte[] createChecksum(String filename) {

        byte[] buffer = new byte[1024];
        MessageDigest complete = null;
        try {
            complete = MessageDigest.getInstance(algo);
        } catch (NoSuchAlgorithmException nsae){
            // Programming Error
            System.out.println("Algorithm is not avaiable");
            return null;
        }
        int numRead;

        try {
            InputStream fis = new FileInputStream(filename);
            do {
                numRead = fis.read(buffer);
                if (numRead > 0) {
                    complete.update(buffer, 0, numRead);

                }
            } while (numRead != -1);

            fis.close();
        } catch (FileNotFoundException fnfe){
            System.out.println("Error at reading of File, checksum may be invalid.");
        } catch (IOException ioe){
            // File is not readable
            System.out.println("Error at reading of File, checksum may be invalid.");
        }
        return complete.digest();
    }

    public static String getChecksum(String filename) throws Exception {
        byte[] b = createChecksum(filename);
        String result = "";

        for (int i = 0; i < b.length; i++) {
            result += Integer.toString((b[i] & 0xff) + 0x100,16).substring(1);
        }
        return result;
    }

    public static void main(String[] args) {
        try {
            System.out.println(getChecksum("assets/file.txt"));
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}