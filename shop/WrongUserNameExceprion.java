package by.alex.shop;

public class WrongUserNameExceprion extends Exception {
    public WrongUserNameExceprion(){
        super();
    }
    public WrongUserNameExceprion(String message){
        super(message);
    }
    public WrongUserNameExceprion(Throwable throwable){
        super(throwable);
    }
    public WrongUserNameExceprion(String message, Throwable throwable){
        super(message,throwable);
    }
}
