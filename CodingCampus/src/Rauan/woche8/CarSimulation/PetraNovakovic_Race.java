package Rauan.woche8.CarSimulation;


import java.util.ArrayList;

public class PetraNovakovic_Race {
    public static void main(String[] args) {

        int i, j;
        ArrayList<Car> carList = new ArrayList<Car>(20);
        String listOfSponsors[] = {"Abercrombie & Fitch Co.", "ABM Industries Incorporated",
                "Ace Hardware Corporation", "ACT Manufacturing Inc.", "Acterna Corp.", "Adams Resources "
                + "& Energy, Inc.", "ADC Telecommunications, Inc.", "Adelphia Communications Corporation",
                "Administaff, Inc.", "Adobe Systems Incorporated", "Adolph Coors Company", "Advance Auto Parts,"
                + " Inc.", "Advanced Micro Devices, Inc.", "AdvancePCS, Inc.", "Advantica Restaurant Group, Inc.",
                "The AES Corporation", "Aetna Inc.", "Affiliated Computer Services, Inc.", "AFLAC Incorporated",
                "AGCO Corporation", "Agilent Technologies, Inc.", "Agway Inc.", "Apartment Investment and Management"
                + " Company", "Air Products and Chemicals, Inc.", "Airborne, Inc.", "Airgas, Inc.", "AK Steel Holding"
                + " Corporation", "Alaska Air Group, Inc.", "Alberto-Culver Company", "Albertson's, Inc.", "Alcoa Inc.",
                "Alleghany Corporation", "Allegheny Energy, Inc.", "Allegheny Technologies Incorporated", "Allergan, Inc.",
                "ALLETE, Inc.", "Alliant Energy Corporation", "Allied Waste Industries, Inc.", "Allmerica Financial Corporation",
                "The Allstate Corporation", "ALLTEL Corporation", "The Alpine Group, Inc.", "Amazon.com, Inc.",
                "AMC Entertainment Inc.", "American Power Conversion Corporation", "Amerada Hess Corporation",
                "AMERCO", "Ameren Corporation", "America West Holdings Corporation", "American Axle & Manufacturing Holdings,"
                + " Inc.", "American Eagle Outfitters, Inc.", "American Electric Power Company, Inc."};
        String driverNameList[] = {"William Swopes", "Margurite Miland", "Alva Liska", "Bruna Breen", "Luciana Deshotel",
                "Jeannetta Nesbitt", "Donny Ledger", "Modesto Tennant", "Imelda Hassler", "Karma Agar", "Janis Wisneski",
                "Micha Dillow", "Mattie Boulden", "Ethelyn Boswell", "Erica Corvin", "Marion Holliday", "Laticia Repka",
                "Desirae Guarino", "Ines Wallach", "Deloris Kimbler", "Elliot Shatley", "Millicent Koller", "Bess Medellin",
                "Marcy Lydick", "Garnet Mccabe", "Donna Tannehill", "Dusti Devillier", "Leland Slemp", "Keiko Dolph",
                "Maybell Berggren", "Jeni Crew", "Christi Birdwell", "Una Sprague", "Sheba Mirza", "Alanna Wawrzyniak",
                "Francina Rippel", "Fermin Layne", "Taren Stetson", "Serina Reveles", "Maegan Arvizo", "Tajuana Behringer",
                "Tamara Havel", "Anya Gemmill", "Mel Bustle", "Tandy Nash", "Hue Stefan", "Reina Streett", "Glennie Kist",
                "Latricia Li", "Juliette Bureau"};
        System.out.println("Here is the list of Drivers and their Sponsors: \n");
        for (i = 0; i < 20; i++) {
            Car C = new Car();
            C.carNumber = i;
            C.driverName = driverNameList[i];
            C.sponsor = listOfSponsors[i]; //assigns random sponsor to random car number
            carList.add(C);
            System.out.println("Car Number: " + C.carNumber + "\n Driver Name: " + C.driverName + "\n Sponsor: " + C.sponsor);
        }
        for (i = 0; i < 20; i++) {
            for (j = 0; j < 20; j++) {
                if ((i + 1) % 5 == 0)  //not sure if this part is written correctly, does not add up Odometer Miles correctly
                {
                    Car C = carList.get(j);
                    C.speedInMph = C.ReRandomizeSpeed();
                    C.totalOdometerMiles += C.speedInMph * (1 / 60); //updates Odometer miles
                    carList.add(C);
                    System.out.println("Car Number: " + C.carNumber + " \n Progress: " + C.totalOdometerMiles);
                    if (C.totalOdometerMiles < 100) {
                        C.speedInMph = C.ReRandomizeSpeed();
                        C.totalOdometerMiles += C.speedInMph * (1 / 60); //updates Odometer miles
                        carList.add(C);
                        if (C.totalOdometerMiles >= 100) {
                            System.out.println("The winner is: " + C.driverName + C.totalOdometerMiles);
                            break;
                        }
                    }
                }
            }
        }
    }
}



