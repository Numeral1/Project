package by.alex.shop.view;

import by.alex.shop.domain.User;
import by.alex.shop.service.UserService;
import by.alex.shop.service.WorkDB;

import java.util.Scanner;

public class ConsoleView {
    public void selectMenu() {
        WorkDB workDB = WorkDB.getInstance();
        workDB.setConnection();
        Scanner scanner = new Scanner(System.in);
        UserService userService = new UserService();
        boolean theChoiceIsStop = false;
        User user = null;
        while (!theChoiceIsStop) {
            System.out.println("========Select menu========");
            System.out.println("Enter 1 - for registration;");
            System.out.println("Enter 2 - login for registered users");
            System.out.println("Enter 0 - EXIT");
            int userChoice = scanner.nextInt();
            switch (userChoice) {
                case 1:
                 user = userService.addUser() ;

                    break;
                case 2:
                    if (workDB.loginUser()) {
                        boolean registeredChoiceIsStop = false;
                        while (!registeredChoiceIsStop) {
                            System.out.println("========Select menu========");
                            System.out.println("Enter 1 - to view all products");
                            System.out.println("Enter 2 - to add goods in your orders");
                            System.out.println("Enter 3 - to view your basket");
                            System.out.println("Enter 0 - EXIT");
                            int registeredChoice = scanner.nextInt();
                            switch (registeredChoice) {
                                case 1:
                                    workDB.showGoods();
                                    break;
                                case 2:
                                    workDB.addOrder();
                                    break;
                                case 3:
                                    workDB.showBasket();
                                case 0:
                                    registeredChoiceIsStop = true;
                                    break;
                            }

                        }
                        break;
                    } else {
                        break;
                    }
                    case 0:
                            theChoiceIsStop = true;
                            break;



            }
        }
    }
}