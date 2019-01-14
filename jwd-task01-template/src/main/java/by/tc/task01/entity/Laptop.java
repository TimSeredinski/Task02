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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Laptop that = (Laptop) o;
        if (!(that.OS != null ? that.OS.equals(this.OS) : this.OS == null)) {
            return false;
        }
        if (Integer.compare(that.systemMemory, this.systemMemory) != 0) {
            return false;
        }
        if (Double.compare(that.CPU, this.CPU) != 0) {
            return false;
        }
        if (Integer.compare(that.displayInchs, this.displayInchs) != 0) {
            return false;
        }
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 829;
        result = prime * result + systemMemory;
        result = prime * result + OS.length();
        result = (int) (prime * result + CPU);
        result = prime * result + displayInchs;
        return result;
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
