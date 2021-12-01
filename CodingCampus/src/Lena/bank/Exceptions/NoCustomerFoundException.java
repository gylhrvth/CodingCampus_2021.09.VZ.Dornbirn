package Lena.bank.Exceptions;

import java.io.IOException;

public class NoCustomerFoundException extends IOException {

    public  NoCustomerFoundException(String ExceptionMessage){
        super(ExceptionMessage);
    }
}
