package Homework.src.main.java.Seminar2;

public class Cat {
    private String name;
    private int appetite;

    private boolean satiety;

    public int getAppetite() {
        return appetite;
    }

    public String getName() {
        return name;
    }

    public void setSatiety(boolean satiety){
        this.satiety = satiety;
    }

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }
    public void eat(Cat cat, Plate plate) {
        if (cat.getAppetite() > plate.getFood()){
            System.out.println(cat.getName() + " is hungry :с " );
            System.out.println("Food is over :c " + '\n');
        } else {
            plate.setFood(plate.getFood() - cat.getAppetite());
            cat.setSatiety(true);
            System.out.println(cat.getName() + " ate " + cat.getAppetite() + " left " + plate.getFood());
            System.out.println(cat.getName() + " cat well-fed c: " + '\n');
        }
    }


}
