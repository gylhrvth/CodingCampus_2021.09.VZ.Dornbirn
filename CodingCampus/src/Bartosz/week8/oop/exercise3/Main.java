package Bartosz.week8.oop.exercise3;

public class Main {
    public static void main(String[] args) {
        Fotoapparat LeicaQ2 = new Fotoapparat("Q2", "Leica", 50);
        Fotoapparat Canon_EOS = new Fotoapparat("R6", "Canon", 21);

        System.out.println(Canon_EOS.toString());
    }

    protected static String takePhoto(){
        String kadse = "░░░░░░░░░░░░░░░░░░░░░▄▀░░▌\n" +
                "░░░░░░░░░░░░░░░░░░░▄▀▐░░░▌\n" +
                "░░░░░░░░░░░░░░░░▄▀▀▒▐▒░░░▌\n" +
                "░░░░░▄▀▀▄░░░▄▄▀▀▒▒▒▒▌▒▒░░▌\n" +
                "░░░░▐▒░░░▀▄▀▒▒▒▒▒▒▒▒▒▒▒▒▒█\n" +
                "░░░░▌▒░░░░▒▀▄▒▒▒▒▒▒▒▒▒▒▒▒▒▀▄\n" +
                "░░░░▐▒░░░░░▒▒▒▒▒▒▒▒▒▌▒▐▒▒▒▒▒▀▄\n" +
                "░░░░▌▀▄░░▒▒▒▒▒▒▒▒▐▒▒▒▌▒▌▒▄▄▒▒▐\n" +
                "░░░▌▌▒▒▀▒▒▒▒▒▒▒▒▒▒▐▒▒▒▒▒█▄█▌▒▒▌\n" +
                "░▄▀▒▐▒▒▒▒▒▒▒▒▒▒▒▄▀█▌▒▒▒▒▒▀▀▒▒▐░░░▄\n" +
                "▀▒▒▒▒▌▒▒▒▒▒▒▒▄▒▐███▌▄▒▒▒▒▒▒▒▄▀▀▀▀\n" +
                "▒▒▒▒▒▐▒▒▒▒▒▄▀▒▒▒▀▀▀▒▒▒▒▄█▀░░▒▌▀▀▄▄\n" +
                "▒▒▒▒▒▒█▒▄▄▀▒▒▒▒▒▒▒▒▒▒▒░░▐▒▀▄▀▄░░░░▀\n" +
                "▒▒▒▒▒▒▒█▒▒▒▒▒▒▒▒▒▄▒▒▒▒▄▀▒▒▒▌░░▀▄\n" +
                "▒▒▒▒▒▒▒▒▀▄▒▒▒▒▒▒▒▒▀▀▀▀▒▒▒▄▀";
        return kadse;
    }
}
