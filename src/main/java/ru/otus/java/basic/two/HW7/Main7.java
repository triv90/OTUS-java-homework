package ru.otus.java.basic.two.HW7;

public class Main7 {
    public static void main(String[] args) {

        Travel travel;
        Travel car = new Car(100, 120);
        Travel bicycle = new Bicycle(200);
        Travel horse = new Horse(160, 30);
        Travel allTerrainVehicle = new AllTerrainVehicle(150, 120);

        Man human = new Man("Иван");

        human.kindOfTransport(car);
        human.travellingMan(120, Terrain.PLAIN);
        System.out.println();
    }
}
