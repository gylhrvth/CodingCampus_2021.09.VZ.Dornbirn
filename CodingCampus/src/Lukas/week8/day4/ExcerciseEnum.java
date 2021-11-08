package Lukas.week8.day4;

public class ExcerciseEnum {

    public static void main(String[] args) {
        System.out.println("---If---");
        for (MessageType messageType : MessageType.values()) {
            printMessageSwitchMultiline(messageType);
        }
        System.out.println("---Switch singleline---");
        for (MessageType messageType : MessageType.values()) {
            printMessageSwitchMultiline(messageType);
        }
        System.out.println("---Switch multiline---");
        for (MessageType messageType : MessageType.values()) {
            printMessageSwitchMultiline(messageType);
        }
    }

    private static void printMessage(MessageType messageType) {
        if (messageType == MessageType.WELCOME) {
            System.out.println("Hallo");
        } else if (messageType == MessageType.GOODBYE) {
            System.out.println("God bye");
        } else if (messageType == MessageType.HOW_ARE_YOU) {
            System.out.println("How are you?");
        } else if (messageType == MessageType.GOOD_DAY) {
            System.out.println("Heute ist ein guter Tag!!!");
        }
    }

    private static void printMessageSwitch(MessageType messageType) {
        switch (messageType) {
            case WELCOME -> System.out.println("Hallo");
            case GOODBYE -> System.out.println("God bye");
            case HOW_ARE_YOU -> System.out.println("How are your");
            case GOOD_DAY -> System.out.println("Heute ist ein guter Tag!!!");
        }
    }

    private static void printMessageSwitchMultiline(MessageType messageType) {
        if(messageType == null) {
            return;
        }
        switch (messageType) {
            case WELCOME -> {
                System.out.println("Hallo");
                System.out.println("Hallo");
            }
            case GOODBYE -> {
                System.out.println("God bye");
                System.out.println("God bye");
            }
            case HOW_ARE_YOU -> {
                System.out.println("How are your");
                System.out.println("How are your");
            }
            case GOOD_DAY -> {
                System.out.println("Heute ist ein guter Tag!!!");
                System.out.println("Heute ist ein guter Tag!!!");
            }
        }
    }
}
