package Homework.src.main.java.Seminar4;

import java.util.ArrayList;


public class Program {
     /**
     Домашняя работа, задача:
     ========================

     + a. Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
     + b. Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта,
     поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
     + c. Для хранения фруктов внутри коробки можно использовать ArrayList;
     + d. Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество:
     вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);
     + e. Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той, которую
     подадут в compare() в качестве параметра. true – если их массы равны, false в противоположном случае.
     Можно сравнивать коробки с яблоками и апельсинами;
     + f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую.
     Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами.
     Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в первой;
     + g. Не забываем про метод добавления фрукта в коробку.
     */
    public static void main(String[] args) {
        ArrayList<Apple> apple = new ArrayList<>();
        Box boxApple = new Box(apple);
        Apple apple1 = new Apple();
        Apple apple2 = new Apple();

        boxApple.addFruit(apple1);
        boxApple.addFruit(apple2);
        System.out.println(apple);

        ArrayList<Apple> orange = new ArrayList<>();
        Box boxOrange = new Box(orange);
        Orange orange1 = new Orange();
        Orange orange2 = new Orange();

        boxOrange.addFruit(orange1);
        boxOrange.addFruit(orange2);
        System.out.println(orange);

        System.out.println(boxApple.getWeight());
        System.out.println(boxOrange.getWeight());

        ArrayList<Apple> appleArrray2 = new ArrayList<>();
        Box boxApple2 = new Box(appleArrray2);
        Apple apple3 = new Apple();
        Apple apple4 = new Apple();

        boxApple2.addFruit(apple3);
        boxApple2.addFruit(apple4);
        System.out.println(boxApple2.getFruits());

        boxApple.compare(boxOrange);

        boxApple2.sprinkleFruits(boxApple);
        System.out.println(boxApple.getFruits());
        System.out.println(boxApple2.getFruits());
    }

}
