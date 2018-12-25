package by.tc.task01.entity;

import java.util.List;

public class KitchenAppliance extends Appliance {

    private int powerConsumption;
    private int weight;
    private int height;
    private int width;

    public KitchenAppliance(int powerConsumption, int weight, int height, int width) {
        this.powerConsumption = powerConsumption;
        this.weight = weight;
        this.height = height;
        this.width = width;
    }

    public KitchenAppliance(List<Integer> integers) {
        powerConsumption = integers.get(0);
        weight = integers.get(1);
        height = integers.get(4);
        width = integers.get(5);
    }

    public KitchenAppliance() {
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

}
