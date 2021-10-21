package Danny.Woche4;

public class PrintColorAsString {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static boolean returnEndLine = true;

    public static void main(String[] args) {


        textPrintColor("test", ANSI_RED," ", false);
        textPrintColor("test", ANSI_RED," ", false);

    }

    /**
     *
     * @param word
     * @param textColorANSI Can be one of {@link PrintColorAsString}{@link #ANSI_BLACK}
     * @param punctuation
     * @param returnEndLine
     */
    public static void textPrintColor(final String word, final String textColorANSI,String punctuation, boolean returnEndLine) {
        String newlineRemovedWord = word;
        if(newlineRemovedWord.equals("\n")) {
            newlineRemovedWord = "\\n";
        }

        switch (textColorANSI) {
            case ANSI_RED: {
                if (returnEndLine == true) {
                    System.out.println(ANSI_RED + word + punctuation + ANSI_RESET);
                    break;
                } else {
                    System.out.print(ANSI_RED + word + punctuation + ANSI_RESET);
                    break;
                }
            }
            case ANSI_YELLOW: {
                if (returnEndLine == true) {
                    System.out.println(ANSI_YELLOW + word + punctuation + ANSI_RESET);
                    break;
                } else {
                    System.out.print(ANSI_YELLOW + word + punctuation + ANSI_RESET);
                    break;
                }
            }
            case ANSI_BLUE: {
                if (returnEndLine == true) {
                    System.out.println(ANSI_BLUE + word + punctuation + ANSI_RESET);
                    break;
                } else {
                    System.out.print(ANSI_BLUE + word + punctuation + ANSI_RESET);
                    break;
                }
            }
            case ANSI_GREEN: {
                if (returnEndLine == true) {
                    System.out.println(ANSI_GREEN + word + punctuation + ANSI_RESET);
                    break;
                } else {
                    System.out.print(ANSI_GREEN + word + punctuation + ANSI_RESET);
                    break;
                }
            }
            case ANSI_PURPLE: {
                if (returnEndLine == true) {
                    System.out.println(ANSI_PURPLE + word + punctuation + ANSI_RESET);
                    break;
                } else {
                    System.out.print(ANSI_PURPLE + word + punctuation + ANSI_RESET);
                    break;
                }
            }
            case ANSI_CYAN: {
                if (returnEndLine == true) {
                    System.out.println(ANSI_CYAN + word + punctuation + ANSI_RESET);
                    break;
                } else {
                    System.out.print(ANSI_CYAN + word + punctuation + ANSI_RESET);
                    break;
                }


            }
            case ANSI_WHITE: {
                if (returnEndLine == true) {
                    System.out.println(ANSI_WHITE + word + punctuation + ANSI_RESET);
                    break;
                } else {
                    System.out.print(ANSI_WHITE + word + punctuation + ANSI_RESET);
                    break;
                }


            }

        }
    }
}