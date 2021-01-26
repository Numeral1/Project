package by.alex.shop;

import java.util.ArrayList;

public class Basket {
    private ArrayList<Phone> bought = new ArrayList<>();

    public ArrayList<Phone> getBought() {
        return bought;
    }

    public void setBought(ArrayList<Phone> bought) {
        this.bought = bought;
    }
    public void buy(Phone phone){

        bought.add(phone);
    }

    @Override
    public String toString() {
        return "Basket{" +
                "bought=" + bought +
                '}';
    }
}
