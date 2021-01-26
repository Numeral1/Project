package by.alex.shop;

import java.util.Comparator;

public class PriceComparator implements Comparator<Phone> {
    @Override
    public int compare(Phone o1, Phone o2) {
        if (o1.getPrice() == o2.getPrice()){
        return 0;}
        else if(o1.getPrice() > o2.getPrice()){
            return 1;
        }
        else {
            return -1;
        }
    }
}
