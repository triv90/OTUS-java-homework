package ru.otus.java.basic.two.hm10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class PhoneBook {

    private Map<String, List<String>> contacts;

    public PhoneBook (){
        this.contacts = new HashMap<>();
    }

    public Map<String, List<String>> getContacts() {
        return contacts;
    }

    public void add(String fullName, String phoneNumber) {
        if (contacts.containsKey(fullName)) {
            System.out.println("Такое имя уже есть. Пробую добавить номер.");
            if (contacts.get(fullName).contains(phoneNumber)) {
                System.out.println("Такой номер телефона уже есть. Добавление не нужно.");
            } else {
                System.out.println("Новый номер добавлен.");
                contacts.get(fullName).add(phoneNumber);
            }
        } else {
            System.out.println("Добавил новую запись в телефонную книгу.");
            ArrayList<String> listNew = new ArrayList<>();
            listNew.add(phoneNumber);
            contacts.put(fullName, listNew);
        }
    }

    public List<String> find(String fullName) {
        return contacts.get(fullName);
    }

    public boolean containsPhoneNumber(String phoneNumber) {
        for (String fullName : contacts.keySet()) {
            if (contacts.get(fullName).contains(phoneNumber)) {
                System.out.println("Телефон " + phoneNumber + " есть в справочнике.");
                return true;
            }
        }
        return false;
    }
}
