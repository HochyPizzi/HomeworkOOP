package Homework.src.main.java.Seminar4;

import java.util.ArrayList;


public class Box <T extends Fruit>{
    private static int count = 0;

    private int id = ++count;

    private ArrayList<T> fruits;
    private Double weight;

    public Box(ArrayList<T> fruits) {
        this.fruits = fruits;
    }

    public Double getWeight() {
        double weight = 0;
        for (T fruit: fruits) {
            weight += fruit.getWeight();
        }
        return weight;
    }

    public ArrayList<T> getFruits() {
        return fruits;
    }

    public void addFruit(T fruit) {
        fruits.add(fruit);
    }

//    public void transferFruits(Box<T> otherBox) {
//        if (this == otherBox) {
//            return;
//        }
//        for (T fruit : fruits) {
//            otherBox.addFruit(fruit);
//        }
//        fruits.clear();
//    }

   public boolean compare(Box<? extends Fruit> box){
        if (this.getWeight() == box.getWeight()){
            System.out.println("Вес ящиков равен.");
            return true;
        } else if (this.getWeight() > box.getWeight()){
            System.out.printf("%s тяжелее чем %s\n", this.toString(), box.toString());
            return false;
        } else {
            System.out.printf("%s тяжелее чем %s\n",box.toString(),this.toString());
            return false;
        }
    }

    public void sprinkleFruits(Box<T> box){
        this.fruits.addAll(box.fruits);
        box.fruits.clear();
        System.out.println("Фрукты были высыпаны из " + box.toString() + " в " + this.toString());
    }

    @Override
    public String toString() {
        return "Box" + id;
    }
}
