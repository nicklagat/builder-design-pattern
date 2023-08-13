package org.example.blueprint;

public class ElectricVehicle {


    public String powerSource;
    public String batteryType;
    public String batteryRange;
    public String batteryCharge;
    public String price;

    public ElectricVehicle() {

    }

    public ElectricVehicle(String engineType, String powerSource, String batteryType, String batteryRange, String batteryCharge, String price) {
        this.engineType = engineType;
        this.powerSource = powerSource;
        this.batteryType = batteryType;
        this.batteryRange = batteryRange;
        this.batteryCharge = batteryCharge;
        this.price = price;
    }

    public String engineType;

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public String getPowerSource() {
        return powerSource;
    }

    public void setPowerSource(String powerSource) {
        this.powerSource = powerSource;
    }

    public String getBatteryType() {
        return batteryType;
    }

    public void setBatteryType(String batteryType) {
        this.batteryType = batteryType;
    }

    public String getBatteryRange() {
        return batteryRange;
    }

    public void setBatteryRange(String batteryRange) {
        this.batteryRange = batteryRange;
    }

    public String getBatteryCharge() {
        return batteryCharge;
    }

    public void setBatteryCharge(String batteryCharge) {
        this.batteryCharge = batteryCharge;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void range() {
        System.out.println("The range is: 68");
    }

    public int mileCovered() {

        return 79;
    }

    public static String startEngine() {
        return "This model has one the most autonomous engine start";
    }


    public static String launchEngineMode() {
        return "Engine modes have been launched";
    }


    @Override
    public String toString() {
        return "ElectricVehicle{" +
                "powerSource='" + powerSource + '\'' +
                ", batteryType='" + batteryType + '\'' +
                ", batteryRange='" + batteryRange + '\'' +
                ", batteryCharge='" + batteryCharge + '\'' +
                ", price='" + price + '\'' +
                ", engineType='" + engineType + '\'' +
                '}';
    }

}
