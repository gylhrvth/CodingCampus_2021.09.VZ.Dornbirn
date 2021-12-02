package Rauan.bank;

import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
        Database db = new Database();
        try {
            db.connect();
            DatabaseManager dm = new DatabaseManager(db);
/*
            SimpleDateFormat fmt = new SimpleDateFormat();
            String str = fmt.format(new Date());
            System.out.println(str);
*/
            GregorianCalendar gc = new GregorianCalendar(1979, 2,2);
            Kunde newKunde = new Kunde(-1, "Sara", "Dornbirn", gc.getTime());
            dm.createKunde(newKunde);

            // List all customers
            for (Kunde k: dm.readKunden()) {
                System.out.println(k);
            }

            db.disconnect();
        } catch (SQLException sqle){
            sqle.printStackTrace();
        }
    }
}
