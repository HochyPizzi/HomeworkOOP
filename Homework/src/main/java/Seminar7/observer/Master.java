package Homework.src.main.java.Seminar7.observer;

import java.util.Random;

public class Master extends Worker {

    public Master(String name, String vacancy) {
        this.name = name;
        this.nameVacancy = vacancy;
        minSalary = random.nextDouble(60000, 80000);
        hasJob = false;
    }

    @Override
    public String toString() {
        return "Мастер";
    }
}
