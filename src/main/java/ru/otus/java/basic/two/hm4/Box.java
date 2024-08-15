package ru.otus.java.basic.two.hm4;

public class Box {

    private final int length;
    private final int width;
    private final int height;
    private String color;
    private Boolean openStatus;
    private String emptyStatus;

    public Box(int length, int width, int height, String color, Boolean openStatus, String emptyStatus) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.color = color;
        this.openStatus = openStatus;
        this.emptyStatus = emptyStatus;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean getOpenStatus() {
        return openStatus;
    }

    public String getEmptyStatus() {
        return emptyStatus;
    }

    public void boxInfo() {
        System.out.println("Коробка: длина " + length + ", " + "ширина " + width + ", " + "высота " + height);
        System.out.println("Цвет коробки: " + color);
        if (openStatus) {
            System.out.println("Коробка открыта");
        } else {
            System.out.println("Коробка закрыта");
        }
        if (emptyStatus.equals("")) {
            System.out.println("Коробка пустая");
        } else {
            System.out.println("Коробка заполнена: " + emptyStatus);
        }
    }

    // Открываем и закрываем коробку
    public void openBox() {  // Открываем закрытую коробку
        if (!openStatus) {
            openStatus = true;
            System.out.println("Открыли коробку");
        } else {
            System.out.println("Коробка уже открыта");
        }
    }

    public void closeBox() { // Закрываем открытую коробку
        if (openStatus) {
            openStatus = false;
            System.out.println("Закрыли коробку");
        } else {
            System.out.println("Коробка уже закрыта");
        }
    }

    // Складываем и выкидываем предмет в/из открытой коробки
    public void putThing(String subject) {   // Кладем предмет в пустую коробку
        if (emptyStatus.equals("")) {
            emptyStatus = subject;
            System.out.println("Положили предмет " + subject + " в пустую коробку");
        } else {
            System.out.println("В коробке уже лежит предмет");
        }
    }

    public void getThing() { // Берем предмет из заполненной коробки
        if (!emptyStatus.equals("")) {
            System.out.println("Забрали предмет" + emptyStatus + " из коробку");
            emptyStatus = "";
        } else {
            System.out.println("Коробка уже пустая");
        }
    }
}
