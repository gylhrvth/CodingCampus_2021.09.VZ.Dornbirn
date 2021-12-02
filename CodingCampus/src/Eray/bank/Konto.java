package Eray.bank;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Konto {

    private static DataBase dataBase = new DataBase();
    private static Scanner scanner = new Scanner(System.in);
    private Konto konto = new Konto();

    public static void StartCreateCustomerDialog(DataBaseManager dataBaseManager) throws SQLException {
        System.out.println("Welcome in the User Creating Menu Please follow the Following steps");
        System.out.println("Please Tap you're full Name in: ");
        String userName = scanner.nextLine();

        System.out.println("Please Tap you're Address in: ");
        String userAddress = scanner.nextLine();

        System.out.println("Please Tap you're BirthDay in: ");
        System.out.println("First write the Year     |   Then the Month    |  Then the Day");
        System.out.println();

        System.out.println("Please write the Year in: ");
        int year = scanner.nextInt();

        System.out.println("Please write the Month in: ");
        int month = scanner.nextInt() - 1;

        System.out.println("Please write the Day in: ");
        int day = scanner.nextInt();

        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month, day);

        createCustomer(userName, userAddress, calendar.getTime(), dataBaseManager);


        System.out.println("Please tap in how much Money you want to deposit: ");
        double userMoney = scanner.nextDouble();

        createCustomerBankAccount(userMoney, userName, dataBaseManager);
    }

    public static void createCustomer(String name, String adresse, Date geburtsdatum, DataBaseManager dataBaseManager) throws SQLException {
        String sql = "INSERT INTO kunde(name, adresse, geburtsdatum) VALUES (?, ?, ?);";

        PreparedStatement statement = dataBaseManager.getConnection().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        statement.setString(1, name);
        statement.setString(2, adresse);

        java.sql.Date sqlDate = new java.sql.Date(geburtsdatum.getTime());

        statement.setDate(3, sqlDate);
        statement.executeUpdate();
        System.out.println("Name: " + name);
        System.out.println("Address: " + adresse);
        System.out.println("BirthDate: " + geburtsdatum.toString());
        System.out.println("The User Insert is Successfully finished !!!");
        System.out.println();
    }


    public static void createCustomerBankAccount(double kontostand, String name, DataBaseManager dataBaseManager) throws SQLException {

        String sql = "INSERT INTO konto(kontostand, name) VALUES (?, ?);";
        PreparedStatement statement = dataBaseManager.getConnection().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

        statement.setDouble(1, kontostand);
        statement.setString(2, name);
        statement.executeUpdate();

        System.out.println("The BankAccount ");
        System.out.println("Amount of Konto: " + kontostand + " €");

        System.out.println("The Konto Insert is Successfully finished !!!");
        System.out.println();
    }

    public static void getAllKontoDetails(DataBaseManager dataBaseManager) throws SQLException {
        String query = "SELECT * FROM konto,kunde";
        PreparedStatement statement = dataBaseManager.getConnection().prepareStatement(query);
        ResultSet resultSet = statement.executeQuery();

        String name = "";
        double kontoAmount = 0;
        long kontoNr = 0;
        String address = "";
        Date date = null;
        int kundenNr = 0;

       /*ResultSetMetaData md = resultSet.getMetaData();
        for (int i = 1; i <= md.getColumnCount(); i++) {
            System.out.println(md.getColumnLabel(i) + " " + md.getColumnTypeName(i));
       } */
        while (resultSet.next()) {
            kontoNr = resultSet.getLong(1);
            kontoAmount = resultSet.getDouble(2);
            name = resultSet.getString(3);
            kundenNr = resultSet.getInt(4);
            address = resultSet.getString(6);
            date = resultSet.getDate(7);

        }
        System.out.println();
        System.out.println("All Konto Details about you");
        System.out.println("Customer Name = " + name);
        System.out.println("Customer KontoNumber = " + kontoNr);
        System.out.println("Customer HomeAddress = " + address);
        System.out.println("Customer BirthDate = " + date);
        System.out.println("Customer BankNumber = " + kundenNr);
        System.out.println("Actually Konto Amount: " + kontoAmount + " €");
    }
}
