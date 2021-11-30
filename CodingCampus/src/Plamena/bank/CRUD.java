package Plamena.bank;

import Plamena.bank.model.Customer;
import java.sql.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class CRUD {
        private Database database;

        public void setUp() throws SQLException {
            database = new Database("jdbc:mysql://localhost:3306/banktest?user=root&password=marsha1l");
            database.connect();
            deleteTable("customer");
            deleteTable("accounts");
            deleteTable("account_customer");
            deleteTable("transaction");
        }

        public void deleteTable(String table) throws SQLException {
            PreparedStatement statement = database.getConnection().prepareStatement("DELETE FROM " + table);
            statement.executeUpdate();
        }

        public void tearDown() throws SQLException {
            database.disconnect();
        }

        private long createCustomer(String name, String address, Date birthdate) throws SQLException {
            String sql = "INSERT INTO customer(name, address, birthdate) VALUES (?, ?, ?);";

            PreparedStatement statement = database.getConnection().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, name);
            statement.setString(2, address);
            statement.setDate(3, birthdate);

            ResultSet resultSet = statement.getGeneratedKeys();

            long customerid = 0;
            if (resultSet.next()) {
                customerid = resultSet.getLong(1);
            } else {
                System.out.println("No primary key returned...");
            }
            return customerid;
        }

        private List<Customer> queryCustomers(String whereClause) throws SQLException {
            String query = "SELECT idcustomer, address, birthdate, name FROM customer" + whereClause + ";";
            PreparedStatement statement = database.getConnection().prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();
            List<Customer> customers = new ArrayList<>();

            while (resultSet.next()) {
                long queriedCustomerID = resultSet.getLong(1);
                String address = resultSet.getString(2);
                java.util.Date birthdate = resultSet.getDate(3);
                String name = resultSet.getString(4);

                Customer customer = new Customer(queriedCustomerID, name, address, new Date(birthdate.getTime()));
                customers.add(customer);
            }
            return customers;
        }

        private Date getCalendarDate(int year, int month, int day) {
            Calendar calendar = Calendar.getInstance();
            calendar.set(year, month, day, 0, 0, 0);
            calendar.set(Calendar.MILLISECOND, 0);
            java.util.Date date = calendar.getTime();
            return new Date(date.getTime());
        }


        public void insertAndSelect() {
            try {
                Calendar calendar = Calendar.getInstance();
                calendar.set(2001, 0, 1, 0, 0, 0);
                calendar.set(Calendar.MILLISECOND, 0);
                java.util.Date date = calendar.getTime();

                long customerid = createCustomer("Alfons", "Nüziders", new Date(date.getTime()));

                List<Customer> customers = queryCustomers("");

                for (int i = 0; i < 10; i++) {
                    createCustomer("Peter" + i, "Bregenzerwald Löwenzahnstraße", getCalendarDate(1990, 2, 3));
                }

                customers = queryCustomers("");
                customers = queryCustomers(" WHERE name LIKE 'Pete%'");
            } catch (SQLException exc) {
                exc.printStackTrace();
            }
        }
    }
