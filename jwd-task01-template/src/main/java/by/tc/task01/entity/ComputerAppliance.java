package by.tc.task01.entity;

import java.util.List;

public class ComputerAppliance extends Appliance {

    private int batteryCapacity;
    private int memoryROM;

    public ComputerAppliance(int batteryCapacity, int memoryROM) {
        this.batteryCapacity = batteryCapacity;
        this.memoryROM = memoryROM;
    }

    public ComputerAppliance(List<Integer> integers) {
        batteryCapacity = integers.get(0);
        memoryROM = integers.get(1);
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ComputerAppliance that = (ComputerAppliance) o;
        if (Integer.compare(that.batteryCapacity, this.batteryCapacity) != 0) {
            return false;
        }
        if (Double.compare(that.memoryROM, this.memoryROM) != 0) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 829;
        result = prime * result + batteryCapacity;
        result = prime * result + memoryROM;
        return result;
    }
}
