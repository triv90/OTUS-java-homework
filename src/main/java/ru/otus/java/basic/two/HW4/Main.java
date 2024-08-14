package ru.otus.java.basic.two.HW4;

import java.time.Year;

public class Main {
    public static void main(String args[]) {
        User[] users = {
                new User("Мальцева",  "Софья",  "Георгиевна", 1994, "email@email.ru"),
                new User("Вавилов", "Марк", "Александрович", 1940, "email@email.ru"),
                new User("Корчагин", "Арсений", "Артёмович", 2010, "email@email.ru"),
                new User("Архипов", "Арсений", "Ильич", 2017, "email@email.ru"),
                new User("Соколов", "Владимир", "Даниилович", 1899, "email@email.ru"),
                new User("Власова", "Антонина", "Александровна",2104, "email@email.ru"),
                new User("Баранова", "Дарья", "Семёновна", 1941, "email@email.ru"),
                new User("Васильева", "Софья", "Денисовна", 1950, "email@email.ru"),
                new User("Медведев", "Добрыня", "Даниилович", 1977, "email@email.ru"),
                new User("Галкин", "Мирослав", "Валерьевич", 1945, "email@email.ru")
        };

        int year = Year.now().getValue();
        for (int i = 0; i < users.length; i++) {
            if ((year - users[i].getYearOfBirthday()) > 40) {
                System.out.println(users[i].getFamily() + ", " + users[i].getName() + ", "
                        + users[i].getMiddleName() + ", " + users[i].getYearOfBirthday() + ", " + users[i].getEmail());
            }
        }
    }
}
