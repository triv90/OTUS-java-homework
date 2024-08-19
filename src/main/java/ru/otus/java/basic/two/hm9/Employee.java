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

    public static List<String> nameEmployee(List<Employee> company) {
        List<String> names = new ArrayList<>();
        for (Employee staff : company) {
            names.add(staff.getName());
        }
        return names;
    }

    public static List<String> moreAgeEmployee(List<Employee> company, Integer a) {
        List<String> namesMoreThanAges = new ArrayList<>();
        for (Employee staff : company) {
            if (staff.getAge() >= a) {
                namesMoreThanAges.add(staff.getName());
            }
        }
        return namesMoreThanAges;
    }

    public static boolean averageAgeEmployee(List<Employee> company, Integer a) {
        Integer averageTemp = 0;
        for (Employee staff : company)
            averageTemp += staff.getAge();
        if (averageTemp / company.size() >= a) {
            return true;
        } else {
            return false;
        }
    }

    public static Employee yangestEmployee(List<Employee> company) {
        Employee yangest;
        Integer maxYear = company.get(0).getAge();
        int index = 0;
        for (int i = 0; i < company.size(); i++) {
            if (company.get(i).getAge() <= maxYear) {
                index = i;
            }
        }
        yangest = company.get(index);
        return yangest;
    }
}
