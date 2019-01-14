package by.tc.task01.entity;

import java.util.List;

public class Refrigerator extends KitchenAppliance {

    private int freezerCapacity;
    private int overallCapacity;

    public Refrigerator(int powerConsumption, int weight, int height, int width, int overallCapacity, int freezerCapacity) {
        super(powerConsumption, weight, height, width);
        this.freezerCapacity = freezerCapacity;
        this.overallCapacity = overallCapacity;
    }

    public Refrigerator(List<Integer> integers, List<String> strings) {
        super(integers);
        freezerCapacity = integers.get(2);
        overallCapacity = integers.get(3);
    }

    public Refrigerator() {
    }

    public int getOverallCapacity() {
        return overallCapacity;
    }

    public void setOverallCapacity(int overallCapacity) {
        this.overallCapacity = overallCapacity;
    }

    public int getFreezerCapacity() {
        return freezerCapacity;
    }

    public void setFreezerCapacity(int freezerCapacity) {
        this.freezerCapacity = freezerCapacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Refrigerator that = (Refrigerator) o;
        if (Integer.compare(that.freezerCapacity, this.freezerCapacity) != 0) {
            return false;
        }
        if (Double.compare(that.overallCapacity, this.overallCapacity) != 0) {
            return false;
        }
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 829;
        result = prime * result + freezerCapacity;
        result = prime * result + overallCapacity;
        return result;
    }

    @Override
    public String toString() {
        return "Refrigerator: " +
                "powerConsumption=" + getPowerConsumption() +
                ", weight=" + getWeight() +
                ", freezerCapacity=" + freezerCapacity +
                ", overallCapacity=" + overallCapacity +
                ", height=" + getHeight() +
                ", width=" + getWidth();
    }
}
