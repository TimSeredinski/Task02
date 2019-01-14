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

    public TabletPC(List<Integer> integers, List<String> strings) {
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TabletPC that = (TabletPC) o;
        if (!(that.color != null ? that.color.equals(this.color) : this.color == null)) {
            return false;
        }
        if (Integer.compare(that.displayInches, this.displayInches) != 0) {
            return false;
        }
        if (Integer.compare(that.flashMemoryCapacity, this.flashMemoryCapacity) != 0) {
            return false;
        }
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 829;
        result = prime * result + displayInches;
        result = prime * result + color.length();
        result = prime * result + flashMemoryCapacity;
        return result;
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
