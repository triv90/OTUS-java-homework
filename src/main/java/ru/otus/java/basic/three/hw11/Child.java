package ru.otus.java.basic.three.hw11;

import java.util.Objects;

public class Child implements Comparable<Child> {
    private String name;
    private int age;

    public Child(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Child{'" + name + "'," + age + '}';
    }

    @Override
    public int compareTo(Child e) {
        if (this.equals(e)) {
            return 0;
        }

        if (age != e.getAge()) {
            if (age < e.getAge()) {
                return -1;
            } else {
                return 1;
            }
        }

        return name.compareTo(e.getName());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Child child = (Child) o;
        return age == child.age && Objects.equals(name, child.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
