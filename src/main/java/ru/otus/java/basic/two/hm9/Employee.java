package ru.otus.java.basic.two.hm9;

import java.util.ArrayList;
import java.util.List;

public class Employee {

    private String name;
    private Integer age;

    public Employee(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public static List<String> nameEmployee(ArrayList<Employee> company) {
        List<String> names = new ArrayList<>();
        System.out.println("Имена сотрудников:");
        for (Employee staff : company) {
            names.add(staff.getName());
        }
        System.out.println(names);
        System.out.println();
        return names;
    }

    public static ArrayList<String> moreAgeEmployee(ArrayList<Employee> company, Integer a) {
        List<String> namesMoreThanAges = new ArrayList<>();
        System.out.println("Cписок сотрудников, возраст которых больше или равен указанному значению:");
        for (Employee staff : company) {
            if (staff.getAge() >= a) {
                namesMoreThanAges.add(staff.getName());
            }
        }
        System.out.println(namesMoreThanAges);
        System.out.println();
        return (ArrayList<String>) namesMoreThanAges;
    }

    public static boolean averageAgeEmployee(ArrayList<Employee> company, Integer a) {
        Integer averageTemp = 0;
        for (Employee staff : company)
            averageTemp += staff.getAge();
        if (averageTemp / company.size() >= a) {
            System.out.println("Средний возраст превышает указанный предел");
            System.out.println();
            return true;
        } else {
            System.out.println("Средний возраст не превышает указанный предел");
            System.out.println();
            return false;
        }
    }

    public static List<Employee> yangestEmployee(ArrayList<Employee> company) {
        List<Employee> yangest = new ArrayList<>();
        Integer maxYear = company.get(0).getAge();
        int index = 0;
        for (int i = 0; i < company.size(); i++) {
            if (company.get(i).getAge() <= maxYear) {
                index = i;
            }
        }
        System.out.println("Имя и возраст самого молодого сотрудника: " + company.get(index).getName() + "  " + company.get(index).getAge());
        yangest.add(company.get(index));
        return yangest;
    }
}
