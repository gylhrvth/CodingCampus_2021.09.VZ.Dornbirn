package Rauan.woche8.personenSort;

public class personenSortiert {
    public static void main(String[] args) {

        System.out.println("---If---");
        for (MessageTypee messageTypee : MessageTypee.values()) {
            printMessageSwitchMultiline(messageTypee);
        }
        System.out.println("---Switch singleline---");
        for (MessageTypee messageTypee : MessageTypee.values()) {
            printMessageSwitchMultiline(messageTypee);
        }
        System.out.println("---Switch multiline---");
        for (MessageTypee messageTypee : MessageTypee.values()) {
            printMessageSwitchMultiline(messageTypee);
        }
    }

    private static void printMessage(MessageTypee messageTypee) {
        if (messageTypee == MessageTypee.Name) {
            System.out.println("Rauan");
        } else if (messageTypee == MessageTypee.Älter) {
            System.out.println("24");
        } else if (messageTypee == MessageTypee.Gewicht) {
            System.out.println("63");
        } else if (messageTypee == MessageTypee.Grüße) {
            System.out.println("163");
        }
    }

    private static void printMessageSwitch(MessageTypee messageTypee) {
        switch (messageTypee) {
            case Name -> System.out.println("Rauan");
            case Älter -> System.out.println("24");
            case Gewicht -> System.out.println("63");
            case Grüße -> System.out.println("163");
        }
    }

    private static void printMessageSwitchMultiline(MessageTypee messageTypee) {
        if (messageTypee == null) {
            return;
        }
        switch (messageTypee) {
            case Name -> {
                System.out.println("Rauan");
                System.out.println("Rauan");
            }
            case Älter -> {
                System.out.println("24");
                System.out.println("24");
            }
            case Gewicht -> {
                System.out.println("63");
                System.out.println("63");
            }
            case Grüße -> {
                System.out.println("163");
                System.out.println("163");
            }
        }
    }
}
