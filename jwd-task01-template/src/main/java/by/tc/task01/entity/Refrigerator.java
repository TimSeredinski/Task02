package by.tc.task01.entity;

import java.util.List;

public class Refrigerator extends KitchenAppliance {
    // you may add your own code here
    private int freezerCapacity;
    private int overallCapacity;

    public Refrigerator(int powerConsumption, int weight, int height, int width, int overallCapacity, int freezerCapacity) {
        super(powerConsumption, weight, height, width);
        this.freezerCapacity = freezerCapacity;
        this.overallCapacity = overallCapacity;
    }

    public Refrigerator(List<Integer> integers, List<String> strings){
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
}
