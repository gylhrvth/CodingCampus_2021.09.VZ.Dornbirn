package Stefan.WeekFour;

import java.util.Arrays;

public class AufgabenTextSort {
    public static void main(String[] args) {
        String text = "Das Freisebad ist eine ehemalige Badeanstalt an der Dr.-Kahlbaum-Allee in der Görlitzer Innenstadt in Sachsen.\n" +
                "\n" +
                "Im Jahr 1887 gründete der Magdeburger Sanitätsrat Walter Freise die Kaltwasser-Heilanstalt an der Promenade (heute: Dr.-Kahlbaum-Allee) gegenüber dem Tivoli und unweit der Kahlbaum’schen Nervenheilanstalt (später: II. medizinische Klinik). Es war neben der Hoffmann’schen Badeanstalt am Lindenweg und dem Zentralbad in der Hospitalstraße eine von drei Badeanstalten in der Stadt.\n" +
                "\n" +
                "Freise war Assistenzarzt im Krankenhaus an der Berliner Straße in Görlitz. Im Jahr 1885 eröffnete er eine Arztpraxis an der Promenade. Die Promenade war damals ein beliebter Flanierweg der Görlitzer Bürger und führte von der Stadt kommend vorbei am Stadtpark bis zum Blockhaus am Neißeviadukt.\n" +
                "\n" +
                "In Freises Heilanstalt wurden Wannen-, Dampf- und Heißluftbäder sowie Sole-, Fichtennadel- und Kräuterbäder sowie Moorbäder in Franzensbader Moorerde angeboten. Elektrische Licht- und Kohlensäurebäder ergänzten das Angebot. Von Beginn an stand den Besuchern auch ein Schwimmbecken zur Verfügung, das sowohl für Nichtschwimmer als auch für Schwimmer angelegt war. Es war sieben Meter breit, 15 Meter lang und an der tiefsten Stelle 2,80 Meter tief, wobei das Becken zur gegenüberliegenden Seite anstieg.\n" +
                "\n" +
                "Walter Freise leitete die Heilbadeanstalt bis 1905. Er gab das Bad auf Grund der hohen finanziellen Verluste an einen Verein ab, der das Bad noch bis 1919 weiter betrieb. Trotz der Zuschüsse, die die Stadt bereits seit 1901 zahlte, konnte die Badeanstalt keinen Gewinn verzeichnen. Der Verein bot das Bad schließlich der Stadt zum Kauf an, die den Betrieb ab dem 1. April 1920 weiterführte.\n" +
                "\n" +
                "Auch nach dem Zweiten Weltkrieg wurde das Freisebad fortgeführt und beherbergte zuletzt Dampfbad, Sauna, Duschen, Wannenbäder, ein Solarium und das Schwimmbecken. Die Stadt schloss das Freisebad am 31. März 1996.\n" +
                "\n" +
                "Die Stadt ließ 2009 den Großschornstein auf der Rückseite sichern und das Dach sowie die Dachentwässerung notdürftig erneuern, jedoch bedürfte das Dach nach Angaben der Stadt einer Kompletterneuerung und das Bad einer Grundsanierung, die die Stadt jedoch finanziell nicht leisten kann.\n" +
                "\n" +
                "Im Juni 2009 sollte im Freisebad unter dem Motto unerhörte Orte der 14. Jazztage Görlitz ein Konzert der Band Funk de Nite stattfinden, dies wurde jedoch in die alte Maschinenfabrik des Waggonbaus verlegt. Im gleichen Jahr öffnete das Bad jedoch zum Tag des offenen Denkmals seine Türen. Für den Film Grand Budapest Hotel diente es als Drehort.\n" +
                "\n" +
                "Es gab Pläne, das Bad und die ehemalige II. medizinische Klinik als Kompetenzzentrum für die Betreuung von Demenzpatienten (Kahlbaum-Projekt) zu reaktivieren und das Bad auch den Bürgern wieder zugänglich zu machen. Die Pläne lagen jedoch 2011 auf Eis.";

        String[] words = text.split(" ");


        //Ersetze jedes Freisebad durch ___ und gib den Text aus
        System.out.println();
        String fixedInput = text.replaceAll("Freisebad", "_________");
        System.out.println(fixedInput);

        //Ersetze jedes ist, und oder durch ___ und gib den Text aus
        System.out.println();
        String fixedInput1 = text.replaceAll("ist|und|oder", "_____");
        System.out.println(fixedInput1);
        System.out.println();


        //Zählt alle Buchstaben und gibt deren Menge aus
        String neuer = text.toLowerCase();
        char[] character = neuer.toCharArray();
        int[] counter = new int[26];
        System.out.println("Gezählte Buchstaben im Array: ");
        for (int i = 0; i < character.length; i++) {
            char myChar = character[i];
            int indexOfCounter = myChar - 97;
            if (indexOfCounter >= 0 && indexOfCounter < counter.length) {
                counter[indexOfCounter]++;
            }
        }
        for (int i = 0; i < counter.length; i++) {
            if (counter[i] != 0) {
                System.out.print(("[" + (char) (i + 97)) + "]" + " = " + counter[i] + ", ");
            }
        }
    }



}
