package by.tc.task01.entity;

import java.util.List;

public class TabletPC extends ComputerAppliance {

    private int displayInches;
    private int flashMemoryCapacity;
    private String color;

    public TabletPC(int batteryCapacity, int memoryROM, int displayInches, int flashMemoryCapacity, String color) {
        super(batteryCapacity, memoryROM);
        this.displayInches = displayInches;
        this.flashMemoryCapacity = flashMemoryCapacity;
        this.color = color;
    }

    public TabletPC(List<Integer> integers, List<String> strings){
        super(integers);
        displayInches = integers.get(1);
        flashMemoryCapacity = integers.get(3);
        color = strings.get(0);
    }

    public TabletPC() {
    }

    public int getDisplayInches() {
        return displayInches;
    }

    public void setDisplayInches(int displayInches) {
        this.displayInches = displayInches;
    }

    public int getFlashMemoryCapacity() {
        return flashMemoryCapacity;
    }

    public void setFlashMemoryCapacity(int flashMemoryCapacity) {
        this.flashMemoryCapacity = flashMemoryCapacity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "TabletPC: " + "batteryCapacity=" + getBatteryCapacity() +
                ", displayInches=" + displayInches +
                ", memoryROM=" + getMemoryROM() +
                ", flashMemoryCapacity=" + flashMemoryCapacity +
                ", color=" + color;
    }
}
