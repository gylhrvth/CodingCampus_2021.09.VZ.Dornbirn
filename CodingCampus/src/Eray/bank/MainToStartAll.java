package Eray.bank;

import java.sql.SQLException;
import java.util.Scanner;

public class MainToStartAll {

    static DataBaseManager dataBaseManager = new DataBaseManager();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        startBankSimulation();
    }

    public static void startBankSimulation() {
        boolean runningBankSimulation = true;


        try {

            dataBaseManager.connectDataBase();
            System.out.println("Connection to DataBase was successfully ");
            System.out.println();
            //deleteAllTables();


            while (runningBankSimulation) {
                int choosingOptionsNumber = startingBankDialog();

                switch (choosingOptionsNumber) {
                    case 1:
                        //Konto erstellen
                        Konto.StartCreateCustomerDialog(dataBaseManager);
                        System.out.println();

                        break;

                    case 2:
                        //kontoStand anzeigen
                        Konto.getAllKontoDetails(dataBaseManager);
                        System.out.println();
                        break;


                    case 3:
                        //Transaktionen anzeigen

                        break;

                    case 4:
                        //Transaktionen tätigen
                        break;

                    case 5:
                        deleteAllTables();
                        break;

                    case 6:
                        //beenden
                        runningBankSimulation = false;
                        System.out.println();
                        System.out.println("Thank You Dear Customer we wish you're a nice Day");
                        System.out.println("The Simulation is successfully closed!!");
                        break;

                    default:
                        System.out.println("Please choose a correct Number!!");
                        break;
                }
            }
            //final at the end
            dataBaseManager.tearDown();
            System.out.println("Connection to DataBase successfully teared Down !");

        } catch (SQLException exc) {
            exc.printStackTrace();
        }
    }


    public static int startingBankDialog() {

        System.out.println();
        System.out.println(colorGreen() + "-----------------------------------------------------------------" + colorWhite());
        System.out.println(colorGreen() + "######## Hello welcome to the Bank ########" + colorWhite());
        System.out.println(colorGreen() + "########  How can i help you're ?  ########" + colorWhite());
        System.out.println();
        System.out.println("!!! IF YOU HAVE NO BANK ACCOUNT YOU ONLY CAN CHOOSE NUMBER 1");
        System.out.println();
        System.out.println("To Create a Bank Account                    press [1]");
        System.out.println("To see all you're Bank Account Details      press [2]");
        System.out.println("To see you're Transactions                  press [3]");
        System.out.println("To make a Transaction                       press [4]");
        System.out.println(colorRed() + "To delete all user Account Datas            press [5]" + colorWhite());
        System.out.println(colorRed() + "To close and leave the Bank Simulation      press [6]" + colorWhite());
        System.out.println(colorGreen() + "-----------------------------------------------------------------" + colorWhite());
        return scanner.nextInt();
    }

    public static void deleteAllTables() throws SQLException {
        System.out.println("You successfully delete all the existing Customer Informations");
        dataBaseManager.deleteTable("konto");
        dataBaseManager.deleteTable("konto_kunde");
        dataBaseManager.deleteTable("kunde");
        dataBaseManager.deleteTable("transaktion");
    }

    public static String colorRed() {
        return "\u001B[31m";
    }

    public static String colorWhite() {
        return "\u001B[0m";
    }

    public static String colorGreen() {
        return "\u001B[32m";
    }

}
