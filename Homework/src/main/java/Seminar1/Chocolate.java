package Seminar1;

public class Chocolate extends Product{
    private double collories;

    public double getCollories() {
        return collories;
    }
    public void setCollories() {
        this.collories = collories;
    }

    public Chocolate(String brand, String name, double price, double collories) {
        super(brand, name, price);
        this.collories = collories;
    }

    public String displayInfo() {
        return String.format("%s - %s - %f - %f", brand, name, price, collories);
    }
}
