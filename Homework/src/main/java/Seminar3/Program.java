package Homework.src.main.java.Seminar3;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Program {

    static Random random = new Random();

    /**
     * TODO: Переработать метод generateEmployee в рамках домашнего задания,
     *  метод должен генерировать рабочих (Employee) разных типов.
     * @return
     */
    static Employee generateEmployee(){
        String[] names = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман" };
        String[] surnames = new String[] { "Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов" };
        int randomType = random.nextInt(2);

        switch (randomType) {
            case 0:
                return new Worker(names[random.nextInt(names.length)], surnames[random.nextInt(surnames.length)], 2000, random.nextInt(18, 50));
            case 1:
                return new Manager(names[random.nextInt(names.length)], surnames[random.nextInt(surnames.length)], 4000, random.nextInt(18, 50));
            default:
                throw new IllegalArgumentException("Неправильный тип рабочего");
        }
    }

    static void showEmployees(Employee[] employees){
        for (Employee employee: employees) {
            System.out.println(employee);
        }
        System.out.println("------------------------------");
    }


    /**
     * TODO: Придумать новые состояния для наших сотрудников
     *   Придумать несколько Comparator'ов для сортировки сотрудников
     *   по фамилии + имени или по возрасту + уровню зп.
     * @param args
     */
    public static void main(String[] args) {

        Employee[] employees = new Employee[10];
        for (int i = 0; i < employees.length; i++)
        {
            employees[i] = generateEmployee();
            employees[i].calculateSalary();
        }
        Arrays.sort(employees);
        System.out.println("Сортировка по имени и заработной плате");
        showEmployees(employees);

        Arrays.sort(employees, new SalaryComparator<Employee>().reversed());
        System.out.println("Сортировка по заработной плате");
        showEmployees(employees);

        Arrays.sort(employees, new AgeSalaryComparator<Employee>());
        System.out.println("Сортировка по возрасту и заработной плате");
        showEmployees(employees);

        Arrays.sort(employees, (o1, o2) -> {
            int res = o1.getSurname().compareTo(o2.getSurname());
            if (res == 0){
                return o1.getName().compareTo(o2.getName());
            }
            return res;
        });
        System.out.println("Сортировка по фамилии и имени");
        showEmployees(employees);

    }
}

