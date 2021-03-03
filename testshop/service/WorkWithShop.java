package by.alex.shop.service;

//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//
//public class WorkWithShop {
//
//
//    WorkDB workDB = WorkDB.getInstance();
//
//
//    public void showGoods(){
//        String showGoods = "select * from goods;";
//            Statement statement = null;
//
//            try {
//                statement = connection.createStatement();
//                ResultSet resultSet = statement.executeQuery("select * from goods;");
//                while (resultSet.next()){
//                    System.out.println(resultSet.getString(1));
//                }
//
//            } catch (SQLException throwables) {
//                LogErrors.WriteLogErrors("SQLException");
//                throwables.printStackTrace();
//            }
//
//
//
//        }
//
//    public void showBasket(){
//       String showBasket = "select * from goods;";
//        System.out.println(workDB.sqlRequest(showBasket));
//
//
//    }
//}
