package by.alex.shop.domain;
import by.alex.shop.service.*;

public class User {
    private String firstName;
    private String lastName;
    private String userName;
    private String password;
    private String confirmPassword;
    private String email;
    final int admin = 0;
    private int amountOfMoney;
    UserService us = new UserService();





    public String getFirstName() {
        return firstName;
    }
/**
 * This method checks the validity of the firstname
 */
    public void setFirstName(String firstName) {
        try {
            if (firstName.length() < 3 || firstName.length() > 15 || !firstName.matches("[a-zA-Z]*")) {
                throw new WrongFirstNameException();

            } else {
                this.firstName = firstName;
            }
        } catch (WrongFirstNameException e) {
            LogErrors.WriteLogErrors("Wrong FirstName " + e.getMessage());
            System.err.println("Wrong FirstName " + e.getMessage());
            us.addUser();

        }
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }
    /**
     * This method checks the validity of the password
     */
    public void setPassword(String password) {
        try {
            if (password.length() > 25 || !password.matches("[a-zA-z0-9]*")) {
                throw new WrongPasswordException();
            } else {
                this.password = password;

            }
        } catch (WrongPasswordException ex) {
            LogErrors.WriteLogErrors("Wrong password!! " + ex.getMessage());
            System.err.println("Wrong password!! " + ex.getMessage());
            us.addUser();
        }

    }

    public String getConfirmPassword() {

        return confirmPassword;
    }
    /**
     * This method checks the validity of the password
     * and makes sure that it is identical to the previously entered one
     */
    public void setConfirmPassword(String confirmPassword) {
        try {
            if (password.length() > 25 || !password.matches("[a-zA-z0-9]*") || !password.equals(confirmPassword)) {
                throw new WrongPasswordException();

            } else {
                this.confirmPassword = confirmPassword;

            }
        } catch (WrongPasswordException ex) {
            LogErrors.WriteLogErrors("Wrong password!! " + ex.getMessage());
            System.err.println("Wrong password!! " + ex.getMessage());
            us.addUser();
        }

    }

    public String getEmail() {
        return email;
    }
    /**
     * This method checks the validity of the email
     */
    public void setEmail(String email) {
        try {
            if (!email.matches("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" +
                    "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$")) {
                throw new WrongEmailException();
            } else {
                this.email = email;
            }
        } catch (WrongEmailException em) {
            LogErrors.WriteLogErrors("Wrong Email! " + em.getMessage());
            System.err.println("Wrong Email! " + em.getMessage());
            us.addUser();

        }
    }

    public int getAmountOfMoney() {
        return amountOfMoney;
    }

    public void setAmountOfMoney(int amountOfMoney) {
        this.amountOfMoney = amountOfMoney;
    }




}
