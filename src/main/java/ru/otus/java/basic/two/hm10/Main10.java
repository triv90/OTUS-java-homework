package ru.otus.java.basic.two.hm10;

public class Main10 {
    public static void main(String[] args) {
        PhoneBook contacts = new PhoneBook();
        contacts.add("Louis Benson", "+79918034166");
        contacts.add("John Campbell", "+79256845525");
        contacts.add("Lisa Smith", "+79157105237");
        contacts.add("Louis Campbell", "+79139150806");
        contacts.add("Mark King", "+79460622334");
        contacts.add("Paul Allen", "+7926799688");
        contacts.add("Carmen Owens", "+79221470386");
        contacts.add("Gertrude Summers", "+79097861693");
        contacts.add("Gertrude Summers", "+79097861692");
        System.out.println(contacts.getContacts());
        System.out.println(contacts.find("Gertrude Summers"));
        contacts.containsPhoneNumber("+79221470386");
    }
}
