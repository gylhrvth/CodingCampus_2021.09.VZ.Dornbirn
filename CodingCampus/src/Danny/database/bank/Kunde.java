package Danny.database.bank;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Kunde {
    private long kundenNr;
    private String name;
    private String adresse;
    private String gebDatum;
    private Date gebDatumDate;
    private Database database = new Database();

    public Kunde(String name, String adresse, String GebDatum) throws ParseException {
        this.name = name;
        this.adresse = adresse;
        this.gebDatumDate = new SimpleDateFormat("dd/MM/yyyy").parse(GebDatum);

    }

    public void createCustomer() throws SQLException {

            database.connect();
            Connection connection = database.getConnection();
            String sql = "INSERT INTO kunde(name, adresse, Gebdatum) VALUES (?,?,?);";
            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, this.name);
            statement.setString(2, this.adresse);
            java.sql.Date sqlDate = new java.sql.Date(this.gebDatumDate.getTime());
            statement.setDate(3, sqlDate);
            statement.executeUpdate();


            ResultSet resultSet = statement.getGeneratedKeys();
            if (resultSet.next()) {
                long kundenNr2 = resultSet.getLong(1);

            } else {

            }

            database.disconnect();


    }

    public void readCustomer() throws SQLException {
        database.connect();
        Connection connection = database.getConnection();
        String sql = "SELECT kunde(name, adresse, Gebdatum) VALUES (?,?,?);";
        PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
    }


    public long getKundenNr() {
        return kundenNr;
    }

    public void setKundenNr(long kundenNr) {
        this.kundenNr = kundenNr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getGebDatum() {
        return gebDatum;
    }

    public void setGebDatum(String gebDatum) {
        this.gebDatum = gebDatum;
    }

    @Override
    public String toString() {
        return String.format("| KundenNr: %d | Name %s | Adresse: %s | Geburtsdatum: %t", this.kundenNr, this.name, this.adresse, this.gebDatum);
    }


}
