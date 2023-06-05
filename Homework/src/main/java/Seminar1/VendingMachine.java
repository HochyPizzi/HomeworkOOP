package Homework.src.main.java.Seminar1;

import java.util.List;

public class VendingMachine {

    private List<Product> products;


    public VendingMachine(List<Product> products) {
        this.products = products;
    }

    public BottleOfWater getBottleOfWater(double volume){
        for (Product product : products){
            if (product instanceof BottleOfWater){
                if (((BottleOfWater)product).getVolume()  == volume){
                    return (BottleOfWater)product;
                }
            }
        }
        return null;
    }
    public Chocolate getChocolate(double collories) {
        for (Product product : products){
            if (product instanceof Chocolate){
                if (((Chocolate)product).getCollories() == collories){
                    return  (Chocolate)product;
                }
            }
        }
        return null;
    }

}
