package Lena.bank.classes;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Customer {

    long kundenNr;
    String name;
    String adress;
    Date birthday;
    List<Account>accounts = new ArrayList<>();


    public Customer(long kundenNr, String name, String adress, Date birthday){
        this.kundenNr = kundenNr;
        this.name=name;
        this.adress=adress;
        this.birthday=birthday;
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

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

   public void fillAccountList(Account account){
        accounts.add(account);

    }

    public List<Account> getAccounts(){
        return this.accounts;
    }
}
