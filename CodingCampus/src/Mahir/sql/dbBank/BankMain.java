package Mahir.sql.dbBank;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class BankMain {
    public static void main(String[] args) throws SQLException {
        Database database = new Database("jdbc:mysql://localhost:3306/bank?user=root&password=Mahirmahir0");
        database.connect();

        DbServiceKunde dbService = new DbServiceKunde(database);
        DbServiceKonto dbServiceKonto = new DbServiceKonto(database);
        Scanner scanner = new Scanner(System.in);


        System.out.println("create customer account");
        System.out.println("\n\n Customer");
        //Kunde
        System.out.println("Enter the name of the customer ");
        String name = scanner.nextLine();
        System.out.println("Enter the address of the customer ");
        String adresse = scanner.nextLine();
        System.out.println("Enter the birthdate of the customer ");
        System.out.println("year");
        int year = scanner.nextInt();
        System.out.println("month");
        int month = scanner.nextInt() + 1;
        System.out.println("day");
        int day = scanner.nextInt();
        scanner.nextLine();
        System.out.println("\n\n Account");
        //Konto
        System.out.println("Enter the name of the Account ");
        String kontoName = scanner.nextLine();
        System.out.println("Enter the account balance ");
        double kontoStand = scanner.nextDouble();


        dbServiceKonto.createKonto(dbService.createKunde
                (name, adresse, dbService.getCalendarDate(year, month, day)), kontoName, kontoStand);

//        deleteTable("kunde");
//        deleteTable("konto");
        database.disconnect();
    }

    private static void deleteTable(String table) throws SQLException {
        Database database = new Database();
        PreparedStatement statement = database.getConnection().prepareStatement("DELETE FROM " + table);
        statement.executeUpdate();
    }
}
