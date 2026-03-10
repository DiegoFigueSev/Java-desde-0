package org.diegofigueroa.poo;

public class AbstraccionYEncapsulacion {
    static {

    }
}

class Vehicle {
    private String model; /// Lo encapsulamos
    private int year;
    private String brand;

    public Vehicle(String model, int year, String brand) {
        this.model = model;
        this.year = year;
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    ///  Un set nos ayuda a dar mas logica al momento de setear el atributo
    /// Podemos poner cierta validacion y operacion para asegurar el correcto flujo
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

