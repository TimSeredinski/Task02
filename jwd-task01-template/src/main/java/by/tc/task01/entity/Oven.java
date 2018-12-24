package by.tc.task01.entity;

public class Oven extends KitchenAppliance {
    // you may add your own code here

    private int depth;

    public Oven() {
        super();
    }

    public Oven(int powerConsumption, int weight, int height, int width, int capacity, int depth) {
        super(powerConsumption, weight, height, width, capacity);
        this.depth = depth;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }
}
