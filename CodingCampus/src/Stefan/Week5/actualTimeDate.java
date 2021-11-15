package Stefan.Week5;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class actualTimeDate {
    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        System.out.println("Aktuelles Datum und Uhrzeit: -> "+dtf.format(LocalDateTime.now()));


        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("yyyy/MMMM/dd HH:mm:ss");
        System.out.println("Aktuelles Datum und Uhrzeit: -> "+dtf3.format(LocalDateTime.now()));
    }
}
