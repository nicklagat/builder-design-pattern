package org.example.interfacex;

public class TeslaEngineManufacturing implements TeslaEngineInfra{
    @Override
    public String buildElectricMotors() {
        return "The electric motors are being built";
    }

    @Override
    public String buildRegenerativeBrake() {
        return "The regenerative brakes are being built";
    }

    @Override
    public String buildInverter() {
        return "The inverters are being built";
    }

    @Override
    public String buildBatteryManagementSystem() {
        return "The battery management systems are being built";
    }

    @Override
    public String buildCoolingSystem() {
        return "The cooling systems are being built";
    }

    @Override
    public String buildSoftwareControl() {
        return "The software controls are being built";
    }
}
