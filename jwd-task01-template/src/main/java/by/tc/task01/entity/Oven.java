package by.tc.task01.entity;

import java.util.List;

public class Oven extends KitchenAppliance {

    private int capacity;
    private int depth;

    public Oven() {
        super();
    }

    public Oven(int powerConsumption, int weight, int height, int width, int capacity, int depth) {
        super(powerConsumption, weight, height, width);
        this.depth = depth;
        this.capacity = capacity;
    }

    public Oven(List<Integer> integers, List<String> strings) {
        super(integers);
        capacity = integers.get(2);
        depth = integers.get(3);
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    @Override
    public String toString() {
        return "Oven: " +
                "powerConsumption=" + getPowerConsumption() +
                ", weight=" + getWeight() +
                ", height=" + getHeight() +
                ", width=" + getWidth() +
                ", capacity=" + capacity +
                ", depth=" + depth;
    }
}
