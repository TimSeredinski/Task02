package by.tc.task01.entity;

import java.util.List;

public class VacuumCleaner extends Appliance {

    private int powerConsumption;
    private String filterType;
    private String bagType;
    private String wandType;
    private int motorSpeedRegulation;
    private int cleaningWidth;

    public VacuumCleaner(int powerConsumption, String filterType, String bagType, String wandType, int motorSpeedRegulation, int cleaningWidth) {
        this.powerConsumption = powerConsumption;
        this.filterType = filterType;
        this.bagType = bagType;
        this.wandType = wandType;
        this.motorSpeedRegulation = motorSpeedRegulation;
        this.cleaningWidth = cleaningWidth;
    }

    public VacuumCleaner(List<Integer> integers, List<String> strings) {
        powerConsumption = integers.get(0);
        filterType = strings.get(0);
        bagType = strings.get(1);
        wandType = strings.get(2);
        motorSpeedRegulation = integers.get(1);
        cleaningWidth = integers.get(2);
    }

    public VacuumCleaner() {
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public String getFilterType() {
        return filterType;
    }

    public void setFilterType(String filterType) {
        this.filterType = filterType;
    }

    public String getBagType() {
        return bagType;
    }

    public void setBagType(String bagType) {
        this.bagType = bagType;
    }

    public String getWandType() {
        return wandType;
    }

    public void setWandType(String wandType) {
        this.wandType = wandType;
    }

    public int getMotorSpeedRegulation() {
        return motorSpeedRegulation;
    }

    public void setMotorSpeedRegulation(int motorSpeedRegulation) {
        this.motorSpeedRegulation = motorSpeedRegulation;
    }

    public int getCleaningWidth() {
        return cleaningWidth;
    }

    public void setCleaningWidth(int cleaningWidth) {
        this.cleaningWidth = cleaningWidth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VacuumCleaner that = (VacuumCleaner) o;
        if (!(that.filterType != null ? that.filterType.equals(this.filterType) : this.filterType == null)) {
            return false;
        }
        if (!(that.bagType != null ? that.bagType.equals(this.bagType) : this.bagType == null)) {
            return false;
        }
        if (!(that.wandType != null ? that.wandType.equals(this.wandType) : this.wandType == null)) {
            return false;
        }
        if (Integer.compare(that.powerConsumption, this.powerConsumption) != 0) {
            return false;
        }
        if (Double.compare(that.motorSpeedRegulation, this.motorSpeedRegulation) != 0) {
            return false;
        }
        if (Integer.compare(that.cleaningWidth, this.cleaningWidth) != 0) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 829;
        result = prime * result + powerConsumption;
        result = prime * result + filterType.length();
        result = prime * result + bagType.length();
        result = prime * result + wandType.length();
        result = prime * result + motorSpeedRegulation;
        result = prime * result + cleaningWidth;
        return result;
    }

    @Override
    public String toString() {
        return "VacuumCleaner: " +
                "powerConsumption=" + powerConsumption +
                ", filterType=" + filterType +
                ", bagType=" + bagType +
                ", wandType=" + wandType +
                ", motorSpeedRegulation=" + motorSpeedRegulation +
                ", cleaningWidth=" + cleaningWidth;
    }
}
