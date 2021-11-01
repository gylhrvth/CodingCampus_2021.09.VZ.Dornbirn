package Danny.woche7.day6;

import java.io.*;
import java.security.MessageDigest;


public class Checksum {
    // Algo MD5 or SHA256
    public static String algo = "SHA256";

    public static byte[] createChecksum(String filename) throws Exception {
        InputStream fis = new FileInputStream(filename);

        byte[] buffer = new byte[1024];
        MessageDigest complete = MessageDigest.getInstance(algo);
        int numRead;

        do {
            numRead = fis.read(buffer);
            if (numRead > 0) {
                complete.update(buffer,0,numRead);
                
            }
        } while (numRead != -1);

        fis.close();
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