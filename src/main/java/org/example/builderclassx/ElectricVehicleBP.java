package org.example.builderclassx;

public class ElectricVehicleBP {

    private final String engineType;
    private final String powerSource;
    private final String batteryType;
    private final String batteryRange;
    private final String batteryCharge;
    private final String price;


    ElectricVehicleBP(String engineType, String powerSource, String batteryType, String batteryRange, String batteryCharge, String price) {
        this.engineType = engineType;
        this.powerSource = powerSource;
        this.batteryType = batteryType;
        this.batteryRange = batteryRange;
        this.batteryCharge = batteryCharge;
        this.price = price;
    }



    public String getEngineType() {
        return engineType;
    }

    public String getPowerSource() {
        return powerSource;
    }

    public String getBatteryType() {
        return batteryType;
    }

    public String getBatteryRange() {
        return batteryRange;
    }

    public String getBatteryCharge() {
        return batteryCharge;
    }

    public String getPrice() {
        return price;
    }


    @Override
    public String toString() {
        return "ElectricVehicleBP{" +
                "engineType='" + engineType + '\'' +
                ", powerSource='" + powerSource + '\'' +
                ", batteryType='" + batteryType + '\'' +
                ", batteryRange='" + batteryRange + '\'' +
                ", batteryCharge='" + batteryCharge + '\'' +
                ", price='" + price + '\'' +
                '}';
    }




}
