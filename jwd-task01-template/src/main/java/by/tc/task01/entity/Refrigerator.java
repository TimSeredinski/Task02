package by.tc.task01.entity;

public class Refrigerator extends KitchenAppliance {
    // you may add your own code here
    private int freezerCapacity;

    public Refrigerator(int powerConsumption, int weight, int height, int width, int capacity, int freezerCapacity) {
        super(powerConsumption, weight, height, width, capacity);
        this.freezerCapacity = freezerCapacity;
    }

    public Refrigerator() {
    }


    public int getFreezerCapacity() {
        return freezerCapacity;
    }

    public void setFreezerCapacity(int freezerCapacity) {
        this.freezerCapacity = freezerCapacity;
    }
}
