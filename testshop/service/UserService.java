package by.alex.shop.service;

import by.alex.shop.domain.User;

import java.util.Scanner;

public class UserService {
    Scanner scanner = new Scanner(System.in);
    WorkDB workDB = WorkDB.getInstance();



    /**
     * This method adds a new user to DB using the sqlAdd method
     */
    public User addUser(){
        User user =new User();
        System.out.println("Add your Firstname");
        String firstName = scanner.nextLine();

        System.out.println("Add your Lastname");
        String lastName = scanner.nextLine();

        System.out.println("Add your Username");
        String userName = scanner.nextLine();

        System.out.println("Add your password");
        String password = scanner.nextLine();


        System.out.println("Confirm your password");
        String confirmPassword = scanner.nextLine();

        System.out.println("Add your E-mail");
        String email = scanner.nextLine();

        System.out.println("Add money");
        int amountOfMoney = scanner.nextInt();

        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setUserName(userName);
        user.setPassword(password);
        user.setConfirmPassword(confirmPassword);
        user.setEmail(email);
        user.setAmountOfMoney(amountOfMoney);


        String addUser = "insert into user(admin, firstName, lastName, username, password, email, amountOfmoney) values ('"+ 0 + "','"+ firstName +"','"+
                lastName +"','" + userName +"','" + confirmPassword +"', '" + email +"' , '" + amountOfMoney +"')";
        workDB.sqlAdd(addUser);
        return user;
    }


}
