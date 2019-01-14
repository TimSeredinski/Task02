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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Oven that = (Oven) o;
        if (Integer.compare(that.capacity, this.capacity) != 0) {
            return false;
        }
        if (Double.compare(that.depth, this.depth) != 0) {
            return false;
        }
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 829;
        result = prime * result + capacity;
        result = prime * result + depth;
        return result;
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
