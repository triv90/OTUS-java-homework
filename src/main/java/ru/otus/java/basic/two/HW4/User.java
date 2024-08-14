package ru.otus.java.basic.two.HW4;

public class User {
    // Поля (переменные):
    private String family;
    private String name;
    private String middleName;
    private int yearOfBirthday;
    private String email;

    // Конструктор
    public User(String family, String name, String middleName, int yearOfBirthday, String email) {
        this.family = family;
        this.name = name;
        this.middleName = middleName;
        this.yearOfBirthday = yearOfBirthday;
        this.email = email;
    }

    // getters / setters
    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public int getYearOfBirthday() {
        return yearOfBirthday;
    }

    public void setYearOfBirthday(int yearOfBirthday) {
        this.yearOfBirthday = yearOfBirthday;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
