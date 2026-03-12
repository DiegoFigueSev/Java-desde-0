package org.diegofigueroa.tema_03_poo.clase_06_Interfacesyclasesabs;

public class ElectricCar extends Vehicle implements Electric{

    private int batteryLevel;

    public ElectricCar(String model, int year, String brand) {
        super(model, year, brand);
        this.batteryLevel = 100;
    }

    @Override
    void drive() {
        System.out.println("El auto electirco esta en marcha");
    }

    @Override
    public void chargeBattery() {
        batteryLevel = MAX_BATTERY_CAPACITY;
    }
}
