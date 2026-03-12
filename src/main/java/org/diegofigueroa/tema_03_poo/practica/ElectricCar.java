package org.diegofigueroa.tema_03_poo.practica;

public class ElectricCar extends Car implements Electric{
    private int batteryLevel;

    public ElectricCar(String brand, String model, int year, CarType type, int batteryLevel) {
        super(brand, model, year, type);
        this.batteryLevel = batteryLevel;
    }

    @Override
    public void chargeBattery() {
        this.batteryLevel = 100;
        System.out.println("La bateria esta cargada al 100%");
    }

    @Override
    public String toString() {
        return "ElectricCar{" + super.toString() +
                "batteryLevel=" + batteryLevel +
                '}';
    }
}
