package by.tc.task01.entity;

import java.util.List;

public class Laptop extends ComputerAppliance {

    private String OS;
    private int systemMemory;
    private double CPU;
    private int displayInchs;

    public Laptop(int batteryCapacity, int memoryROM, String OS, int systemMemory, double CPU, int displayInchs) {
        super(batteryCapacity, memoryROM);
        this.OS = OS;
        this.systemMemory = systemMemory;
        this.CPU = CPU;
        this.displayInchs = displayInchs;
    }

    public Laptop(List<Integer> integers, List<String> strings) {
        super(integers);
        OS = strings.get(0);
        systemMemory = integers.get(2);
        CPU = Double.parseDouble(strings.get(1));
        displayInchs = integers.get(3);
    }

    public Laptop() {
        super();
    }

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public int getSystemMemory() {
        return systemMemory;
    }

    public void setSystemMemory(int systemMemory) {
        this.systemMemory = systemMemory;
    }

    public int getDisplayInchs() {
        return displayInchs;
    }

    public void setDisplayInchs(int displayInchs) {
        this.displayInchs = displayInchs;
    }

    public double getCPU() {
        return CPU;
    }

    public void setCPU(double CPU) {
        this.CPU = CPU;
    }

    @Override
    public String toString() {
        return "Laptop: " + "batteryCapacity=" + getBatteryCapacity() +
                ", OS=" + OS +
                ", memoryROM=" + getMemoryROM() +
                ", systemMemory=" + systemMemory +
                ", CPU=" + CPU +
                ", displayInchs=" + displayInchs;
    }
}
