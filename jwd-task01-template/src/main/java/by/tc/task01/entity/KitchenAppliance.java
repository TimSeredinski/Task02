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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        KitchenAppliance that = (KitchenAppliance) o;
        if (Integer.compare(that.powerConsumption, this.powerConsumption) != 0) {
            return false;
        }
        if (Double.compare(that.weight, this.weight) != 0) {
            return false;
        }
        if (Integer.compare(that.height, this.height) != 0) {
            return false;
        }
        if (Double.compare(that.width, this.width) != 0) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 829;
        result = prime * result + powerConsumption;
        result = prime * result + weight;
        result = prime * result + height;
        result = prime * result + width;
        return result;
    }
}
