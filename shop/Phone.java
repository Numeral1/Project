package by.alex.shop;

public class Phone {
    private String name;
    private int price;
    private String countryOfOrigin;

    public Phone(String name, int price, String countryOfOrigin) {
        this.name = name;
        this.price = price;
        this.countryOfOrigin = countryOfOrigin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", countryOfOrigin='" + countryOfOrigin + '\'' +
                '}';
    }
}
