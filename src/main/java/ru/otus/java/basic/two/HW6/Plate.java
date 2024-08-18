package ru.otus.java.basic.two.HW6;

public class Plate {

    private int foodVolumeMax;
    private int foodVolumeCurrent;



    public Plate(int foodVolumeMax, int foodVolumeCurrent) {
        this.foodVolumeMax = foodVolumeMax;
        this.foodVolumeCurrent = foodVolumeCurrent;
    }

    public int getFoodVolumeMax() {
        return foodVolumeMax;
    }

    public int getFoodVolumeCurrent() {
        return foodVolumeCurrent;
    }

    public boolean decreaseFood(int amount) {
        foodVolumeCurrent -= amount;
        if (foodVolumeCurrent < 0) {
            this.foodVolumeCurrent = 0;
            return false;
        } else {
            return true;
        }
    }

    public void increaseFood(int amount) {
        foodVolumeCurrent += amount;
        if (foodVolumeCurrent >= foodVolumeMax) {
            foodVolumeCurrent = foodVolumeMax;
        }
    }
}
