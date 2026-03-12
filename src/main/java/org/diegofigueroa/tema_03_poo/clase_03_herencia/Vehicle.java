package org.diegofigueroa.tema_03_poo.clase_03_herencia;

///  La herencia se usa cuando dos clases comaprtes comportamiento y atributos
///  Nos bascamos en un padre que heredara su identidad a los hijos
///
//? Nos ayuda a representar una relacion del tipo ES UN
//? Se lo usa cuando queremos reutilizar codigo y organizar mejor el modelo y darle las funcionalidad

class Vehicle {
    private String brand;
    private String model;
    private int year;

    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

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
}
