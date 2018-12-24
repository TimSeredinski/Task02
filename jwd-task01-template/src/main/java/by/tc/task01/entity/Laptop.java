package by.tc.task01.entity;

public class Laptop extends ComputerAppliance {
	// you may add your own code here

    private String OS;
    private int systemMemory;
    private double CPU;


    public Laptop(int batteryCapacity, int memoryROM, int displayInches, String OS, int systemMemory, double CPU) {
        super(batteryCapacity, memoryROM, displayInches);
        this.OS = OS;
        this.systemMemory = systemMemory;
        this.CPU = CPU;
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

    public double getCPU() {
        return CPU;
    }

    public void setCPU(double CPU) {
        this.CPU = CPU;
    }
}
