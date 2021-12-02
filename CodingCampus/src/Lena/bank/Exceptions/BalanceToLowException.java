package Lena.bank.Exceptions;

import java.io.IOException;

public class BalanceToLowException extends IOException {

    public  BalanceToLowException(String ExceptionMessage){
        super(ExceptionMessage);
    }
}
