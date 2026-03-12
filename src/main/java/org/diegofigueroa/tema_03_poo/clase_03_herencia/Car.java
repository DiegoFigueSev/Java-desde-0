package org.diegofigueroa.tema_03_poo.clase_03_herencia;

class Car extends Vehicle {

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
