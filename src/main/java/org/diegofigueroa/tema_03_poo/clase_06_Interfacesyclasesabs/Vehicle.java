package org.diegofigueroa.tema_03_poo.clase_06_Interfacesyclasesabs;

/// Una clase abstracta no se puede instanciar nos ayuda a definir las reglas o mi contrato en mi proyecto
public abstract class Vehicle {
    private String model; /// Lo encapsulamos
    private int year;
    private String brand;

    public Vehicle(String model, int year, String brand) {
        this.model = model;
        this.year = year;
        this.brand = brand;
    }

    abstract void drive();

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
