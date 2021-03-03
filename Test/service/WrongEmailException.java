package by.alex.shop.service;

public class WrongEmailException extends Exception{
    public WrongEmailException() {
        super();
    }

    public WrongEmailException(String message) {
        super(message);
    }

    public WrongEmailException(String message, Throwable cause) {
        super(message, cause);
    }

    public WrongEmailException(Throwable cause) {
        super(cause);
    }
}
