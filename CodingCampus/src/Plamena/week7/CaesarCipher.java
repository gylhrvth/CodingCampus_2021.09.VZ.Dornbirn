package Plamena.week7;

public class CaesarCipher {
    public static void main(String[] args) {
        String test = "Heute ist ein guter Tag!";
        encrypting(test, 3);
        decrypting("Khxwh#lvw#hlq#jxwhu#Wdj$", 3);
        System.out.println(caeserEncrypting(test, 3));
        System.out.println(caeserDecrypting("Khxwh lvw hlq jxwhu Wdj!", 3));

        String username = "Zmojmz|{";
        // key = 8; username = Regberts;
        String password = "VikfivxwVypi~6465";
        // key = 4; password = RegbertsRulez2021;
        for (int i = 0; i < 10; i++) {
            System.out.print("key = " + i + ", decrypted message: ");
            decrypting(username, i);
        }
        for (int i = 0; i < 10; i++) {
            System.out.print("key = " + i + ", decrypted message: ");
            decrypting(password, i);

        }
    }

    private static void encrypting(String test, int key) {
        char[] testData = test.toCharArray();
        for (int i = 0; i < testData.length; i++) {
            testData[i] += key;
        }
        System.out.println(testData);
    }

    private static void decrypting(String test, int key) {
        char[] testData = test.toCharArray();
        for (int i = 0; i < testData.length; i++) {
            testData[i] -= key;
        }
        System.out.println(testData);
    }

    private static String caeserEncrypting(String test, int key) {
        char tmp = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < test.length(); i++) {
            if (test.charAt(i) >= 65 && test.charAt(i) <= 90) {
                tmp = (char) (test.charAt(i) + key);
                if (tmp > 90) {
                    tmp -= 26;
                }
                sb.append(tmp);
            } else if (test.charAt(i) >= 97 && test.charAt(i) <= 122) {
                tmp = (char) (test.charAt(i) + key);
                if (tmp > 122) {
                    tmp -= 26;
                }
                sb.append(tmp);
            } else {
                sb.append(test.charAt(i));
            }
        }
        return sb.toString();
    }

    private static String caeserDecrypting(String test, int key) {
        char tmp = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < test.length(); i++) {
            if (test.charAt(i) >= 65 && test.charAt(i) <= 90) {
                tmp = (char) (test.charAt(i) - key);
                if (tmp > 90) {
                    tmp -= 26;
                }
                sb.append(tmp);
            } else if (test.charAt(i) >= 97 && test.charAt(i) <= 122){
                tmp = (char) (test.charAt(i) - key);
                if(tmp > 122){
                    tmp -= 26;
                }
                sb.append(tmp);
            } else{
                sb.append(test.charAt(i));
            }
        }
        return sb.toString();
    }
}

