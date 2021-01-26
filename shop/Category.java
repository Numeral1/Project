package by.alex.shop;

import java.util.ArrayList;

public class Category  {
    private String categoryName;
    private ArrayList<Phone> phoneArrayList = new ArrayList<>();

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public ArrayList<Phone> getPhoneArrayList() {
        return phoneArrayList;
    }

    public void setPhoneArrayList(ArrayList<Phone> phoneArrayList) {
        this.phoneArrayList = phoneArrayList;
    }

    @Override
    public String toString() {
        return "Category{" +
                "categoryName='" + categoryName + '\'' +
                ", phoneArrayList=" + phoneArrayList +
                '}';
    }

}

