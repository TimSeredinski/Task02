package by.tc.task01.entity;

public class Speakers extends Appliance{
	// you may add your own code here

    private int powerConsumption;
    private int numberOfSpeakers;
    private int frequencyRange;
    private int cordLength;

    public Speakers(int powerConsumption, int numberOfSpeakers, int frequencyRange, int cordLength) {
        this.powerConsumption = powerConsumption;
        this.numberOfSpeakers = numberOfSpeakers;
        this.frequencyRange = frequencyRange;
        this.cordLength = cordLength;
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public int getNumberOfSpeakers() {
        return numberOfSpeakers;
    }

    public void setNumberOfSpeakers(int numberOfSpeakers) {
        this.numberOfSpeakers = numberOfSpeakers;
    }

    public int getFrequencyRange() {
        return frequencyRange;
    }

    public void setFrequencyRange(int frequencyRange) {
        this.frequencyRange = frequencyRange;
    }

    public int getCordLength() {
        return cordLength;
    }

    public void setCordLength(int cordLength) {
        this.cordLength = cordLength;
    }
}
