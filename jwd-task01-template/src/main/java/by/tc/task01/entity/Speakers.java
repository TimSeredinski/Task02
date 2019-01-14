package by.tc.task01.entity;

import java.util.List;

public class Speakers extends Appliance {

    private int powerConsumption;
    private int numberOfSpeakers;
    private String frequencyRange;
    private int cordLength;

    public Speakers(int powerConsumption, int numberOfSpeakers, String frequencyRange, int cordLength) {
        this.powerConsumption = powerConsumption;
        this.numberOfSpeakers = numberOfSpeakers;
        this.frequencyRange = frequencyRange;
        this.cordLength = cordLength;
    }

    public Speakers(List<Integer> integers, List<String> strings) {
        powerConsumption = integers.get(0);
        numberOfSpeakers = integers.get(1);
        frequencyRange = strings.get(0);
        cordLength = integers.get(2);
    }

    public Speakers() {
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

    public String getFrequencyRange() {
        return frequencyRange;
    }

    public void setFrequencyRange(String frequencyRange) {
        this.frequencyRange = frequencyRange;
    }

    public int getCordLength() {
        return cordLength;
    }

    public void setCordLength(int cordLength) {
        this.cordLength = cordLength;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Speakers that = (Speakers) o;
        if (Integer.compare(that.powerConsumption, this.powerConsumption) != 0) {
            return false;
        }
        if (Double.compare(that.numberOfSpeakers, this.numberOfSpeakers) != 0) {
            return false;
        }
        if (!(that.frequencyRange != null ? that.frequencyRange.equals(this.frequencyRange) : this.frequencyRange == null)) {
            return false;
        }
        if (Double.compare(that.cordLength, this.cordLength) != 0) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 829;
        result = prime * result + powerConsumption;
        result = prime * result + numberOfSpeakers;
        result = prime * result + frequencyRange.length();
        result = prime * result + cordLength;
        return result;
    }

    @Override
    public String toString() {
        return "Speakers: " +
                "powerConsumption=" + powerConsumption +
                ", numberOfSpeakers=" + numberOfSpeakers +
                ", frequencyRange=" + frequencyRange +
                ", cordLength=" + cordLength;
    }
}
