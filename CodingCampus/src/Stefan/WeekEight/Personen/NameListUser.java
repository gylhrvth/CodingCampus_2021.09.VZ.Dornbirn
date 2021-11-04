package Stefan.WeekEight.Personen;

import java.util.ArrayList;
import java.util.List;

public class NameListUser {
    public static void main(String[] args) {
        Persons name1 = new Persons("Gerold", "m", 23, 170,80);
        Persons name2 = new Persons("Harald", "m", 40, 165,65);
        Persons name3 = new Persons("Angela", "w", 35, 160,50);
        Persons name4 = new Persons("Anabel", "w", 20, 170,18);

        Persons[] names = new Persons[]{name1, name2, name3, name4};

        List<Persons> persons = new ArrayList<>();
        for (int i = 0; i < names.length; i++) {
            persons.add(names[i]);
        }

        printUserList(List.of(names));

    }

    private static void printUserList(List<Persons> user) {
        for (Persons names : user) {
            System.out.println(names);
        }
    }
}
