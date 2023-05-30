package Seminar2;

import java.util.ArrayList;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Barsik", 5);
        Cat cat2 = new Cat("Biba", 15);
        Cat cat3 = new Cat("Pupa", 30);
        Cat cat4 = new Cat("Julick", 100);

        Plate plate = new Plate(100);
        plate.info();
        List<Cat> cats = new ArrayList<>();
        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);
        cats.add(cat4);
        for (Cat cat: cats) {
            cat.eat(cat, plate);
        }


    }
}
