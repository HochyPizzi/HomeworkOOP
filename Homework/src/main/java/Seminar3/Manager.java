package Homework.src.main.java.Seminar3;
public class Manager extends Employee{
    public Manager(String name, String surname, double salary, int age) {
        super(name, surname, salary, age);
    }

    @Override
    public double calculateSalary() {
        return salary*20;
    }

    public String toString() {
        return String.format("%s %s, возраст: %d; Менеджер; Среднемесячная заработная плата: %.2f (руб.)",
                surname, name, age, calculateSalary());
    }
}
