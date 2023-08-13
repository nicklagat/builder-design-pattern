package org.example.abstractx;

public abstract class TeslaEv {


    private String performance;
    private int price;
    private String batteryCapacity;
    private String chargeDuration;
    private String engineType;
    private String teslaType;

    public  TeslaEv(){

    }

    public TeslaEv(String teslaType, String chargeDuration, String engineType, String performance, int price, String batteryCapacity) {
        this.teslaType = teslaType;
        this.chargeDuration = chargeDuration;
        this.engineType = engineType;
        this.performance = performance;
        this.price = price;
        this.batteryCapacity = batteryCapacity;
    }

    public String getTeslaType() {
        return teslaType;
    }

    public void setTeslaType(String teslaType) {
        this.teslaType = teslaType;
    }

    public String getChargeDuration() {
        return chargeDuration;
    }

    public void setChargeDuration(String chargeDuration) {
        this.chargeDuration = chargeDuration;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public String getPerformance() {
        return performance;
    }

    public void setPerformance(String performance) {
        this.performance = performance;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(String batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public void bluePrint(){
        System.out.println("This is the blueprint/template used to make the individual objects/tesla cars");
    }

    @Override
    public String toString() {
        return "TeslaEv{" +
                "teslaType='" + teslaType + '\'' +
                ", chargeDuration='" + chargeDuration + '\'' +
                ", engineType=" + engineType +
                ", performance='" + performance + '\'' +
                ", price=" + price +
                ", batteryCapacity='" + batteryCapacity + '\'' +
                '}';
    }


}
