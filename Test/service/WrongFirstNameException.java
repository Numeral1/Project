package by.alex.shop.service;

public class WrongFirstNameException extends Exception{
    public WrongFirstNameException() {
        super();
    }

    public WrongFirstNameException(String message) {
        super(message);
    }

    public WrongFirstNameException(String message, Throwable cause) {
        super(message, cause);
    }

    public WrongFirstNameException(Throwable cause) {
        super(cause);
    }
}
