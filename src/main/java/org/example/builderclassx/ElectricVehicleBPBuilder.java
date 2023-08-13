package org.example.builderclassx;

public class ElectricVehicleBPBuilder {

    private String engineType;
    private String powerSource;
    private String batteryType;
    private String batteryRange;
    private String batteryCharge;
    private String price;

    public ElectricVehicleBPBuilder setEngineType(String engineType) {
        this.engineType = engineType;
        return this;
    }

    public ElectricVehicleBPBuilder setPowerSource(String powerSource) {
        this.powerSource = powerSource;
        return this;
    }

    public ElectricVehicleBPBuilder setBatteryType(String batteryType) {
        this.batteryType = batteryType;
        return this;
    }

    public ElectricVehicleBPBuilder setBatteryRange(String batteryRange) {
        this.batteryRange = batteryRange;
        return this;
    }

    public ElectricVehicleBPBuilder setBatteryCharge(String batteryCharge) {
        this.batteryCharge = batteryCharge;
        return this;
    }

    public ElectricVehicleBPBuilder setPrice(String price) {
        this.price = price;
        return this;
    }


    public ElectricVehicleBP build(){
        return new ElectricVehicleBP(engineType, powerSource, batteryType, batteryRange, batteryCharge, price);
    }


}
