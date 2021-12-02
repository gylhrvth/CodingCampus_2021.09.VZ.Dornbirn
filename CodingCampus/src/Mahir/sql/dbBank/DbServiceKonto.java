package Mahir.sql.dbBank;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DbServiceKonto {
    private Database database;

    public DbServiceKonto(Database database) {
        this.database = database;
    }

    public void createKonto(long kontoNr, String name, double kontostand) throws SQLException {

        String sql = "INSERT INTO konto(kontoNr, name, kontostand) VALUES (?, ?, ?);";

        PreparedStatement statement = database.getConnection().prepareStatement(sql);
        statement.setLong(1, kontoNr);
        statement.setString(2, name);
        statement.setDouble(2, kontostand);

    }
}
