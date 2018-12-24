package by.tc.task01.entity;

public class TabletPC extends ComputerAppliance {
	// you may add your own code here

    private int flashMemoryCapacity;
    private String color;

    public TabletPC(int batteryCapacity, int memoryROM, int displayInches, int flashMemoryCapacity, String color) {
        super(batteryCapacity, memoryROM, displayInches);
        this.flashMemoryCapacity = flashMemoryCapacity;
        this.color = color;
    }

    public TabletPC() {
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
}
