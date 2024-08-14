package ru.otus.java.basic.two.HW7;

public class Man {

    private String name;
    private Travel currentTransport;
    private String nameTrans;

    public Man(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Travel getCurrentTransport() {
        return currentTransport;
    }

    public void namesTransport(Travel currentTransport) {
        nameTrans = "";
        if (currentTransport == null) {
            return;
        }
        if (currentTransport != null) {
            if (currentTransport.getClass().getName().equals("ru.otus.java.basic.two.HW7.Bicycle")) {
                nameTrans = "велосипед";
            }
            if (currentTransport.getClass().getName().equals("ru.otus.java.basic.two.HW7.Car")) {
                nameTrans = "машину";
            }
            if (currentTransport.getClass().getName().equals("ru.otus.java.basic.two.HW7.Horse")) {
                nameTrans = "лошадь";
            }
            if (currentTransport.getClass().getName().equals("ru.otus.java.basic.two.HW7.AllTerrainVehicle")) {
                nameTrans = "вездеход";
            }
        }
    }

    public void kindOfTransport(Travel transport) {
        if (transport == null) {
            currentTransport = transport;
            System.out.println(name + " идет пешком");
        } else {
            currentTransport = transport;
            namesTransport(transport);
            System.out.println(name + " сел на " + nameTrans);
        }
    }

    public void travellingMan(int distance, Terrain territory) {
        if (currentTransport == null) {
            System.out.println(name + " прошел дистанцию успешно");
        } else {
            currentTransport.moving(distance, territory);
        }
    }
}
