package Gerhard.week11;

import java.sql.*;

public class mysqltest {

    public static void main(String[] args) {
        try {
            Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "Gerry191919!");
            Statement myStmt = myConn.createStatement();
            ResultSet myRS = myStmt.executeQuery("select * from persons");
            while (myRS.next()) {
                System.out.println(myRS.getString("LastName"));
            }
        } catch (Exception exc) {
            exc.printStackTrace();
        }

    }

}

