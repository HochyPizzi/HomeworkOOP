package Homework.src.main.java.Seminar6;

import Homework.src.main.java.Seminar6.srp2.InputConsole;
import Homework.src.main.java.Seminar6.srp2.Order;
import Homework.src.main.java.Seminar6.srp2.SaveToJson;

public class Program {

    /**
     * TODO: Задача 1. Домашняя работа. Оптимизировать работу класса Order в  рамках принципа SRP.
     * @param args
     */
    public static void main(String[] args) {
        Order order = new Order();
        SaveToJson save = new SaveToJson();
        InputConsole input = new InputConsole();
        input.inputFromConsole(order);
        save.saveToJson(order);
    }

}
