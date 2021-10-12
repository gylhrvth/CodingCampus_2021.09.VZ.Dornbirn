package Gyula;

import org.apache.commons.text.StringEscapeUtils;

import java.util.regex.Pattern;

public class SondernStrings {
    public static void main(String[] args) {
        System.out.println(Pattern.quote(".*"));
        System.out.println("Hello World!".replaceAll(".*", "X"));
        System.out.println("Hello World!".replaceAll(Pattern.quote(".*"), "X"));
    }
}
