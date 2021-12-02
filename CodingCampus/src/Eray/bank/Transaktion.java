package Eray.bank;

import Eray.bank.DataBase;
import Eray.bank.DataBaseManager;
import Eray.bank.Konto;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Transaktion{

    private static DataBase dataBase = new DataBase();
    private static Scanner scanner = new Scanner(System.in);
    private Konto konto = new Konto();

    public static void makeTransactionDialog(DataBaseManager dataBaseManager){
        System.out.println("       Welcome To the Transaction Menu");
        System.out.println("    Please tap the target Bank Number in");
        System.out.println("The length of the Bank Id musst be 12 Numbers Long");
        System.out.println("               XXXX-XXXX-XXXX-XXXX ");
        long targetKontoNr = scanner.nextLong();

        System.out.println("Please tap in the Amount to Transfer to the Target");
        double transferAmount = scanner.nextDouble();

        System.out.println("TRANSFER TIME: " );


        System.out.println("You're Transaction was successfully");
        System.out.println("Target KontoNr = " + targetKontoNr);
        System.out.println("Amount of Transfer = " + transferAmount + " €");

    }

    public static void transferMoneyToTarget(DataBaseManager dataBaseManager,long targetKontoNr, double transferAmount)throws SQLException {

        String sql = "INSERT INTO kunde(name, adresse, geburtsdatum) VALUES (?, ?, ?);";

        PreparedStatement statement = dataBaseManager.getConnection().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        statement.setLong(1, targetKontoNr);
        statement.setDouble(2, transferAmount);

    }
}
