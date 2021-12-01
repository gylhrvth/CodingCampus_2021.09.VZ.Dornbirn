package Lena.bank;

import Lena.bank.classes.Bankomat;
import Lena.bank.userInterface.ATM_LoginFrame;

import java.sql.SQLException;

public class BankMain {

    public static void main(String[] args) {
        try {
        Bankomat bankomat = new Bankomat();

           //ATM_Frame atm_frame = new ATM_Frame(bankomat);

            ATM_LoginFrame atm_loginFrame = new ATM_LoginFrame(bankomat);


            //  bankomat.newCustomer();
        }catch (SQLException sqlException){
            sqlException.printStackTrace();
        }
    }
}
