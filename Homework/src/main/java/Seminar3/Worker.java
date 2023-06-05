package Homework.src.main.java.Seminar3;

public class Worker extends Employee {

    public Worker(String name, String surname, double salary, int age) {
        super(name, surname, salary, age);
    }

    @Override
    public double calculateSalary() {
        return salary*20;
    }


    @Override
    public String toString() {
        return String.format("%s %s, возраст: %d; Рабочий; Среднемесячная заработная плата: %.2f (руб.)",
                surname, name, age, calculateSalary());
    }
}
