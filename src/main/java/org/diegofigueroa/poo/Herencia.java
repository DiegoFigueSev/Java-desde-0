package org.diegofigueroa.poo;

public class Herencia {
    {

    }
}

///  La herencia se usa cuando dos clases comaprtes comportamiento y atributos
///  Nos bascamos en un padre que heredara su identidad a los hijos

class Vehicle2 {
    private String brand;
    private String model;
    private int year;

    public Vehicle2(String brand, String model, int year) {
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

class Car extends Vehicle2 {

    private int doors;

    public Car(String brand, String model, int year, int doors) {
        super(brand, model, year); // Asocia los atributos con el padre
        this.doors = doors; // Crea un nuevo atirbuto propio de la clase
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }
}

class Motorcycle extends Vehicle2 {
    private boolean hasSidecar;

    public Motorcycle(String brand, String model, int year, boolean hasSidecar) {
        super(brand, model, year);
        this.hasSidecar = hasSidecar;
    }

    public void popWheelie(){
        System.out.println("La moto esta loca!");
    }

    public boolean isHasSidecar() {
        return hasSidecar;
    }

    public void setHasSidecar(boolean hasSidecar) {
        this.hasSidecar = hasSidecar;
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "hasSidecar=" + hasSidecar +
                '}' + super.toString(); // Para acceder a la informacion del padre desde el hijo usamos el metodo super
    }
}