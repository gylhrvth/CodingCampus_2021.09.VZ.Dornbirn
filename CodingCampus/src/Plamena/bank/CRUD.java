package Plamena.bank;

import Plamena.bank.model.Customer;
import java.sql.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class CRUD {
        private Database database;

        public void setUp() throws SQLException {
            database = new Database("jdbc:mysql://localhost:3306/bank?user=root&password=marsha1l");
            database.connect();
        }

        public void tearDown() throws SQLException {
            database.disconnect();
        }

        public void createCustomer(Customer customer) throws SQLException {
            String sql = "INSERT INTO customer(name, address, birthdate) VALUES (?, ?, ?);";

            PreparedStatement statement = database.getConnection().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, customer.getName());
            statement.setString(2, customer.getAddress());
            statement.setDate(3, new java.sql.Date(customer.getBirthdate().getTime()));

            statement.executeUpdate();
            ResultSet resultSet = statement.getGeneratedKeys();

            long customerid = 0;
            if (resultSet.next()) {
                customerid = resultSet.getLong(1);
                customer.setCustomerid(customerid);
            } else {
                System.out.println("No primary key returned...");
            }
        }

        public List<Customer> queryCustomers(String whereClause) throws SQLException {
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

        public void deleteCustomer(long idcustomer) throws SQLException {
            String sql = "DELETE FROM customer WHERE idcustomer = " + idcustomer + ";";
            PreparedStatement statement = database.getConnection().prepareStatement(sql);
            statement.executeUpdate();
        }
    }
