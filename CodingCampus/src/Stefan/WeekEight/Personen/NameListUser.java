package Stefan.WeekEight.Personen;


import java.util.ArrayList;
import java.util.List;

public class NameListUser {
    public static void main(String[] args) {
        Persons name1 = new Persons("Gerold", "m", 23, 170, 80);
        Persons name2 = new Persons("Harald", "m", 40, 165, 65);
        Persons name3 = new Persons("Angela", "w", 35, 160, 50);
        Persons name4 = new Persons("Anabel", "w", 20, 170, 48);

        Persons[] names = new Persons[]{name1, name2, name3, name4};

        List<Persons> persons = new ArrayList<>();
        for (int i = 0; i < names.length; i++) {
            persons.add(names[i]);
        }

//        printUserList(List.of(names));

//        Collections.sort(persons, new Comparator<Persons>() {
//            @Override
//            public int compare(Persons o1, Persons o2) {
//                return o1.getAge() - o2.getAge();
//            }
//        });


//        persons = persons.stream().sorted(Comparator.comparing(Persons::getName)).collect(Collectors.toList());




    }


    //Gibt die vorhandenen Daten aus
//    private static void printUserList(List<Persons> user) {
//        for (Persons names : user) {
//            System.out.println(names);
//        }
//    }


    //Durchschnittsalter
    private void durchschnittsAlter(List<Persons> user) {

    }













    //Sortieren
    public static void personSorter(String test) {

    }

    public static int listSorter(int[] persons) {
        int temp = 0;
        for (int i = 0; i < persons.length; i++) {
            for (int j = 0; j < persons.length - i; j++) {
                if (persons[j] > persons[j + 1]) {
                    temp = persons[j];
                    persons[j] = persons[j + 1];
                    persons[j + 1] = temp;
                }
            }
        }
        return temp;
    }


}
