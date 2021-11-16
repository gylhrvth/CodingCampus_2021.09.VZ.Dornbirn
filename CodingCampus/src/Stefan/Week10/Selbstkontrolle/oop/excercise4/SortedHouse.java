package Stefan.Week10.Selbstkontrolle.oop.excercise4;

import Stefan.Week10.Selbstkontrolle.oop.excercise2.Person;
import Stefan.Week10.Selbstkontrolle.oop.excercise3.House;



public class SortedHouse extends House {

    public SortedHouse(int door, int windows, String adress) {
        super(door, windows, adress);
    }



    @Override
    public void addPerson(Person person) {
        super.addPerson(person);

        Person temp = null;
        for (int i = 0; i < getPersons().size(); i++) {
            for (int j = 0; j < getPersons().size() -1 -i; j++) {
                if (getPersons().get(j).getName().compareTo(getPersons().get(j+1).getName()) > 0) {
                    temp = getPersons().get(j);
                    getPersons().set(j,getPersons().get(j+1));
                    getPersons().set(j+1,temp);
                }
            }
        }
        //sortiera
    }

}
