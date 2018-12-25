package by.tc.task01.entity;

import java.util.List;

public class ComputerAppliance extends Appliance{

    private int batteryCapacity;
    private int memoryROM;

    public ComputerAppliance(int batteryCapacity, int memoryROM) {
        this.batteryCapacity = batteryCapacity;
        this.memoryROM = memoryROM;
    }

    public ComputerAppliance(List<Integer> integers){
        batteryCapacity = integers.get(0);
        memoryROM = integers.get(2);
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

}
