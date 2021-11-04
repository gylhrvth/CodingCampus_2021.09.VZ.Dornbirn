package Ingo.week7.enumUebung;

public class EnumExcercise {

    public static void main(String[] args) {

    }

    private static void printMessage(MessageType messageType) {
        if (messageType == MessageType.WELCOME) {
            System.out.println("Hallo");
        }else if (messageType == MessageType.GOODDAY) {
            System.out.println("Schönen guten Tag!");
        }else if (messageType == MessageType.HIGHNOOM) {
            System.out.println("Guten Mittag und Mahlzeit! ");
        }else if (messageType == MessageType.GOODNIGHT) {
            System.out.println("Wir wünschen dir eine traumhafte Nacht :-)  !!");
        }
    }

}
