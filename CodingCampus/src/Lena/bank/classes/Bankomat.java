package Lena.bank.classes;

import Lena.bank.Exceptions.BalanceToLowException;
import Lena.bank.Exceptions.NoAccountFoundException;
import Lena.bank.Exceptions.NoCustomerFoundException;
import Lena.bank.database.Database;

import java.sql.*;
import java.util.Calendar;
import java.util.Scanner;

public class Bankomat {
    Scanner sc = new Scanner(System.in);

    private Database database = new Database();
    private Connection connection;

    public Bankomat() throws SQLException {
        database.connect();
        connection = database.getConnection();
    }




    public void checkLoginDate(int customerNr, String name) throws SQLException, NoCustomerFoundException {
        String query = "SELECT name FROM kunden WHERE kundenNR =" + customerNr;
        PreparedStatement preparedStatement2 = connection.prepareStatement(query);
        ResultSet resultSet1 = preparedStatement2.executeQuery(query);
        if (!resultSet1.next()) {
            throw new NoCustomerFoundException("Es konnte kein Kunde mit dieser Kundennummer gefunden werden");

        }else{
            String nameFromQuery = resultSet1.getString("name");
            if(!nameFromQuery.equals(name)){
                throw new NoCustomerFoundException("Kundennummer und Name stimmen nicht überein");
            }
        }
    }

    public void checkAccountNr(int accountNr) throws SQLException, NoAccountFoundException {
        String query = "SELECT * FROM konto WHERE kontoNR =" + accountNr;
        PreparedStatement preparedStatement2 = connection.prepareStatement(query);
        ResultSet resultSet1 = preparedStatement2.executeQuery(query);
        if (!resultSet1.next()) {
            throw new NoAccountFoundException("No Account found");
        }
    }

    public Customer getCustomer(long kundenNrInput) throws SQLException {
        String query = "SELECT kundenNr, name, adresse, geburtsdatum FROM kunden WHERE kundenNr=" + kundenNrInput;
        PreparedStatement preparedStatement2 = connection.prepareStatement(query);
        ResultSet resultSet1 = preparedStatement2.executeQuery(query);
        Customer customer = null;
        if (resultSet1.next()) {
            long kundenNr = resultSet1.getLong(1);
            String name = resultSet1.getString(2);
            String adress = resultSet1.getString(3);
            java.sql.Date gepurtsdatum = resultSet1.getDate(4);

            customer = new Customer(kundenNr, name, adress, gepurtsdatum);

        } else {
            System.out.println("Kein Kunde gefunden");
        }
        selectCustomerAccounts(customer);
        return customer;
    }

    public void executeTransaction(int fromAccountNr, int toAccountNr, double amount) throws SQLException, BalanceToLowException, NoAccountFoundException {
        checkAccountNr(toAccountNr);
        if(fromAccountNr!=0 && calcBalance(fromAccountNr)<amount){
            throw new BalanceToLowException("to low balance");
        }else{
            String sqlInsert = "insert into transaktionen(quelle_kontoNr_fk,ziel_kontoNr_fk, betrag, zeitstempel) VALUES (?, ?, ?, ?);";

            PreparedStatement statement = connection.prepareStatement(sqlInsert, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, fromAccountNr);
            statement.setInt(2, toAccountNr);
            statement.setDouble(3, amount);
            statement.setDate(4, getDate());
            int rows = statement.executeUpdate();

        }

    }

    public void executeDisposition(int toAccountNr, double amount) throws SQLException{

            String sqlInsert = "insert into transaktionen(ziel_kontoNr_fk, betrag, zeitstempel) VALUES ( ?, ?, ?);";

            PreparedStatement statement = connection.prepareStatement(sqlInsert, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, toAccountNr);
            statement.setDouble(2, amount);
            statement.setDate(3, getDate());
            int rows = statement.executeUpdate();

    }

    public void executePayout(int fromAccountNr, double amount) throws SQLException, BalanceToLowException {
        if(fromAccountNr!=0 && calcBalance(fromAccountNr)<amount){
            throw new BalanceToLowException("to low balance");
        }else {
            String sqlInsert = "insert into transaktionen(quelle_kontoNr_fk, betrag, zeitstempel) VALUES ( ?, ?, ?);";

            PreparedStatement statement = connection.prepareStatement(sqlInsert, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, fromAccountNr);
            statement.setDouble(2, amount);
            statement.setDate(3, getDate());
            int rows = statement.executeUpdate();
        }
    }

    private Date getDate(){
        Calendar calendar = Calendar.getInstance();
        java.util.Date date = calendar.getTime();
        return new Date(date.getTime());
    }

    public double calcBalance(int fromAccountNr) throws SQLException {
        String query = "select sum(betrag)from transaktionen where ziel_kontoNr_fk =" + fromAccountNr;
        PreparedStatement preparedStatement2 = connection.prepareStatement(query);
        ResultSet resultSet1 = preparedStatement2.executeQuery(query);

        double positiveBalance=0;
        double negativeBalance=0;
        if (resultSet1.next()) {
            positiveBalance = resultSet1.getLong(1);
        }

        query = "select sum(betrag)from transaktionen where quelle_kontoNr_fk =" + fromAccountNr;
        preparedStatement2 = connection.prepareStatement(query);
        resultSet1 = preparedStatement2.executeQuery(query);
        if (resultSet1.next()) {
            negativeBalance = resultSet1.getLong(1);
        }

        return positiveBalance-negativeBalance;

    }

    private void selectCustomerAccounts(Customer customer) throws SQLException {

        String query = "SELECT konto.kontoNr, konto.name from kunden " +
                "join konto_kunde on kunden.kundenNr = konto_kunde.kundenNr_fk " +
                "join konto on konto.kontoNr = konto_kunde.kontoNr_fk " +
                "where kundenNr =" + customer.getKundenNr();
        PreparedStatement preparedStatement2 = connection.prepareStatement(query);
        ResultSet resultSet1 = preparedStatement2.executeQuery(query);
        while (resultSet1.next()) {
            long kontoNr = resultSet1.getLong(1);
            String name = resultSet1.getString(2);
            Account tempAcc = new Account((int) kontoNr, name);
            double balance = calcBalance((int) kontoNr);
            tempAcc.setBalance(balance);
            customer.fillAccountList(tempAcc);
        }


    }

    private void insertIntoKunden(String name, String adresse, Date geburtsdatum) {
        try {
            String sqlInsert = "INSERT INTO kunden(name, adresse, geburtsdatum) VALUES (?, ?, ?);";

            PreparedStatement statement = connection.prepareStatement(sqlInsert, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, name);
            statement.setString(2, adresse);
            statement.setDate(3, geburtsdatum);
            int rows = statement.executeUpdate();
            long primaryKey = statement.getGeneratedKeys().getLong(1);
        } catch (SQLException sqlException) {
            //TODO
        }
    }

    private Date convertDateInput(String dateInput) {
        String[] dateSplitted = dateInput.split("\\.");
        int[] dateConverted = new int[dateSplitted.length];
        for (int i = 0; i < dateSplitted.length; i++) {
            dateConverted[i] = Integer.parseInt(dateSplitted[i]);
        }

        Calendar calendar = Calendar.getInstance();
        calendar.set(dateConverted[2], (dateConverted[1] - 1), dateConverted[0]);
        java.util.Date date = calendar.getTime();
        return new Date(date.getTime());
    }
}
