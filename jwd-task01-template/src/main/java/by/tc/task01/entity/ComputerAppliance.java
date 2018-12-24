package by.tc.task01.entity;

public class ComputerAppliance extends Appliance{

    private int batteryCapacity;
    private int memoryROM;
    private int displayInches;

    public ComputerAppliance(int batteryCapacity, int memoryROM, int displayInches) {
        this.batteryCapacity = batteryCapacity;
        this.memoryROM = memoryROM;
        this.displayInches = displayInches;
    }

    public ComputerAppliance() {
    }

    public int getBatteryCapacity() {

        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public int getMemoryROM() {
        return memoryROM;
    }

    public void setMemoryROM(int memoryROM) {
        this.memoryROM = memoryROM;
    }

    public int getDisplayInches() {
        return displayInches;
    }

    public void setDisplayInches(int displayInches) {
        this.displayInches = displayInches;
    }
}
