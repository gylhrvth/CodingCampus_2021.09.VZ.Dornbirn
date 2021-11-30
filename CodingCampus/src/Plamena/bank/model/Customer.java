package Plamena.bank.model;


import java.util.Date;

public class Customer {
    private String name;
    private String address;
    private long customerid;
    private Date birthdate;

    public Customer(long customerid, String name, String address, Date birthdate) {
        this.name = name;
        this.address = address;
        this.customerid = customerid;
        this.birthdate = birthdate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getCustomerid() {
        return customerid;
    }

    public void setCustomerid(long customerid) {
        this.customerid = customerid;
    }

    public java.util.Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(java.util.Date birthdate) {
        this.birthdate = birthdate;
    }


}
