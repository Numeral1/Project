package by.alex.shop.service;

import java.sql.*;
import java.util.Scanner;

public class WorkDB {
    private Connection connection = null;
    final String URL = "jdbc:mysql://localhost:3306/shoptest?serverTimezone=Europe/Minsk&useSSL=false";
    final String username = "root";
    final String PASSWORD = "";
    Scanner scanner = new Scanner(System.in);
    private static WorkDB workDB = new WorkDB();




    private WorkDB() {

    }

    public static WorkDB getInstance() {

        return workDB;
    }

    public void setConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            connection = DriverManager.getConnection(URL, username, PASSWORD);
            System.out.println(" ");
        } catch (SQLException throwables) {
            LogErrors.WriteLogErrors("SQLException");
            throwables.printStackTrace();
        }
    }
/**
 * This method adds different data to the database depending on the query
 */
    public void sqlAdd(String query) {

        try(Statement statement = connection.createStatement()) {
            statement.executeUpdate(query);
        } catch (SQLException throwables) {
            LogErrors.WriteLogErrors("SQLException");
            throwables.printStackTrace();
        }

    }

public void showGoods() {
    Statement statement = null;

    try {
        statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from goods;");
        while (resultSet.next()){
            int id = resultSet.getInt("id");
            String type = resultSet.getString("type");
            String model = resultSet.getString("model");
            int price = resultSet.getInt("price");
            System.out.println("=======GOODS========");
            System.out.println("id: " + id);
            System.out.println("type: " + type);
            System.out.println("model: " + model);
            System.out.println("price: " + price);
        }
    } catch (SQLException throwables) {
        LogErrors.WriteLogErrors("SQLException");
        throwables.printStackTrace();
    }
    }
    public void showBasket() {
        Statement statement = null;

        try {
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from basket;");
            while (resultSet.next()){
                int id = resultSet.getInt("id");
                int userId = resultSet.getInt("userid");
                int price = resultSet.getInt("price");
                System.out.println("=======Basket========");
                System.out.println("id: " + id);
                System.out.println("userid: " + userId);
                System.out.println("price: " + price);
            }
        } catch (SQLException throwables) {
            LogErrors.WriteLogErrors("SQLException");
            throwables.printStackTrace();
        }
    }
    public boolean loginUser(){
        Statement statement = null;
        System.out.println("Enter your username:");
        String userName = scanner.nextLine();
        System.out.println("Enter your password:");
        String password = scanner.nextLine();

        try {
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from user where userName = '" + userName + "' and password = '" + password +"';");
            while (resultSet.next()){
                int id = resultSet.getInt("id");
                String firstName = resultSet.getString("firstName");
                String lastName = resultSet.getString("lastName");

                if (userName.equals(resultSet.getString("username"))){
                userName = resultSet.getString("userName");
                } else {
                    System.err.println("Invalid user name or does not exist");
                    loginUser();
                }
                if (password.equals(resultSet.getString("password"))){
                    password=resultSet.getString("password");
                } else {
                    System.err.println("Wrong password");
                    loginUser();
                }

               String email = resultSet.getString("email");
                int amountOfMoney = resultSet.getInt("amountOfMoney");
                System.out.println("=========" + userName + "========");
                System.out.println("id: " + id);
                System.out.println("firstName: " + firstName);
                System.out.println("lastName: " + lastName);
                System.out.println("userName: " + userName);
                System.out.println("email: " + email);
                System.out.println("amountOfMoney: " + amountOfMoney);

            }
        } catch (SQLException throwables) {
            LogErrors.WriteLogErrors("SQLException");
            throwables.printStackTrace();
        }
        return true;

    }
    public void addOrder(){

        System.out.println("Enter goodsID to add good to your basket");
        int goodsId = scanner.nextInt();
        int yourId = scanner.nextInt();


        String addOrder = "insert into orders(userid, price) values ( '" + yourId +"', select price from goods where id = '"+ goodsId +"');";
        workDB.sqlAdd(addOrder);

    }

}




