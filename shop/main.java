package by.alex.shop;

import java.util.ArrayList;
import java.util.Collections;

public class main {
    public static void main(String[] args)  {
        User user1 = new User("Piter","1234a");
        User user2 = new User("Andrey","dasdsa");
        User user = new User("ap", "jdfhi3");
//        user.setUserNamePassword("ap","34234","2323");
        try {

            user.setUserNamePassword("Maxim", "ad111", "ad111");
        }catch (WrongPasswordException | WrongUserNameExceprion v){
            System.out.println(v.getMessage());



        }
        Phone phone = new Phone("Iphone12",1000,"USA");
        Phone phone1 = new Phone("Iphone11",400,"USA");
        Phone phone2 = new Phone("Samsung7",200,"Korea");
        Phone phone3 = new Phone("Samsung5",500,"Korea");
        ArrayList<Phone> phones = new ArrayList<>();
        phones.add(phone);
        phones.add(phone1);
        Category category = new Category();
        category.setCategoryName("phonesName");
//        System.out.println(phones);
        category.setPhoneArrayList(phones);

//        System.out.println(category);
        PriceComparator priceComparator = new PriceComparator();
        Collections.sort(phones, priceComparator);
        System.out.println(phones);
        ArrayList<Phone> phoneBasket = new ArrayList<>();
        user1.getBasket().buy(phone1);
        System.out.println(user1.getBasket());











    }
}
