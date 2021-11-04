package Stefan.WeekEight.Personen;

import java.util.ArrayList;
import java.util.List;

public class NameListUser {
    public static void main(String[] args) {
        Persons name1 = new Persons("Gerold", 23, 170, 80);
        Persons name2 = new Persons("Harald", 33, 160, 50);
        Persons name3 = new Persons("Angela", 22, 165, 40);
        Persons name4 = new Persons("Anabel", 50, 169, 70);

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
