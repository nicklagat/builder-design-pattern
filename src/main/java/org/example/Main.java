package org.example;

import org.example.abstractx.TeslaEv;
import org.example.abstractx.TeslaModel3;
import org.example.blueprint.ElectricVehicle;
import org.example.builderclassx.ElectricVehicleBP;
import org.example.builderclassx.ElectricVehicleBPBuilder;
import org.example.interfacex.TeslaEngineInfra;
import org.example.interfacex.TeslaEngineManufacturing;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        ElectricVehicle electricVehicle = new ElectricVehicle();
        electricVehicle.setPowerSource("Charge station");
        electricVehicle.setBatteryRange("50000");
        electricVehicle.setBatteryCharge("900");
        electricVehicle.setBatteryType("lithium-ion batteries");
        electricVehicle.setEngineType("Auto chargeable");
        electricVehicle.setPrice("USD 67000");
        System.out.println(electricVehicle);
        electricVehicle.range();
        System.out.println(electricVehicle.mileCovered());
        System.out.println(ElectricVehicle.startEngine());
        System.out.println(ElectricVehicle.launchEngineMode());





        // creating an object from an abstract
//        TeslaEv teslaEv = new TeslaEv(); // 'TeslaEv' is abstract; cannot be instantiated
        TeslaEv teslaEv = new TeslaModel3();
        TeslaModel3 teslaModel3 = new TeslaModel3();
        System.out.println(TeslaModel3.modelName());
        teslaModel3.setEngineType("Electric Motor");
        teslaModel3.setPrice(35000);
        teslaModel3.setChargeDuration("170 miles");
        teslaModel3.setBatteryCapacity("50kWh-70kWh");
        teslaModel3.setTeslaType("Tesla Model 3");
        teslaEv.bluePrint();
        System.out.println(teslaModel3);


        // creating an object from an interface class

//        TeslaEngineInfra teslaEngineInfra = new TeslaEngineInfra(); // 'TeslaEngineInfra' is abstract; cannot be instantiated

        TeslaEngineInfra teslaEngineInfra = new TeslaEngineManufacturing();
        System.out.println(teslaEngineInfra.buildBatteryManagementSystem());
        System.out.println(teslaEngineInfra.buildCoolingSystem());
        System.out.println(teslaEngineInfra.buildElectricMotors());
        System.out.println(teslaEngineInfra.buildInverter());
        System.out.println(teslaEngineInfra.buildRegenerativeBrake());
        System.out.println(teslaEngineInfra.buildSoftwareControl());

        TeslaEngineManufacturing teslaEngineManufacturing = new TeslaEngineManufacturing();
        System.out.println(teslaEngineManufacturing.buildSoftwareControl());


        ElectricVehicleBPBuilder electricVehicleBPBuilder = new ElectricVehicleBPBuilder();
        ElectricVehicleBP electricVehicleBP = electricVehicleBPBuilder.setBatteryCharge("97%")
                .setBatteryRange("767 miles")
                .setBatteryType("Lithium")
                .setEngineType("Electric")
                .setPowerSource("Solar")
                .setPrice("$95000")
                .build();

        System.out.println(electricVehicleBP);




    }
}