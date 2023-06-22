package Homework.src.main.java.Seminar7.observer;

public interface Observer {

    void receiveOffer(String companyName, double salary, String vacancy);

    boolean takeJob (String vacancy);

    String getVacancyName();

}