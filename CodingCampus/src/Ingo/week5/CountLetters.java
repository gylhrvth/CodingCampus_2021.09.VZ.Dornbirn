package Ingo.week5;

public class CountLetters {

    public static void main(String[] args) {
        String[] arr = new String[]{"Stjepan", "Ömer", "Danny", "Bartosz", "Sadaaq", "Gerhard", "Stefan", "Plamena", "Eray", "Sandro", "Lena", "Ingo", "Mahir", "Rauan", "Lukas"};
        int count2 = 0;
        String result = "";
        for (int i = 0; i < arr.length; i++) {
            int counter = 0;
            char[] ctmp = arr[i].toCharArray();
            for (int j = 0; j < ctmp.length; j++) {

                if (ctmp[j] == 'a') {
                    counter++;
                }
                if (ctmp[j] == 'e') {
                    counter++;
                }
                if (ctmp[j] == 'i') {
                    counter++;
                }
                if (ctmp[j] == 'o') {
                    counter++;
                }
                if (ctmp[j] == 'u') {
                    counter++;
                }
            }

            if (counter > count2) {
                count2 = counter;
                result = arr[i];
            }
        }
        System.out.println(result);

        //Home.printMessage();
    }
}
