package Lena.bank.Exceptions;

import java.io.IOException;

public class NoAccountFoundException extends IOException {

    public  NoAccountFoundException(String ExceptionMessage){
        super(ExceptionMessage);
    }
}
