package Mahir.objektorientierung.valueOfAPerson;

import Mahir.objektorientierung.dataclass.Dataclass;

import java.util.ArrayList;
import java.util.List;

public class PersonMinMaxAvg {
    public static void main(String[] args) {
        Values person1 = new Values(1.72,27,"Tom",75);
        Values person2 = new Values(1.84,34,"David",81);
        Values person3 = new Values(1.67,29,"Klaus",79);
        Values person4 = new Values(1.77,40,"Georg",92);
        Values person5 = new Values(1.92,32,"Tim",86);
        Values[] persons = new Values[]{person1,person2,person3,person4,person5};
        List<Values> personList = new ArrayList<>();
        for (int i = 0; i < persons.length; i++) {
            personList.add(persons[i]);

        }

    }
//    private static Values minMaxAvrg(List<Values> values) {
//    int min = 0;
//    int max = 0;
//    double sum = 0;
//        for (int i = 0; i < values.size(); i++) {
//
//
//        }
//
//    }
}
