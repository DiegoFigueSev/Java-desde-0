package org.diegofigueroa.tema_03_poo.clase_04_polimorfismo;

class Vehicle {

    private String branc;
    private int year;

    public Vehicle(String branc, int year) {
        this.branc = branc;
        this.year = year;
    }

    public String getBranc() {
        return branc;
    }

    public void setBranc(String branc) {
        this.branc = branc;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // ? Varios metodos con el mismo nombre pero con distintos parametros

    ///  Metodo
    public void start() {
        System.out.println("Encendido del vehiculo");
    }

    /// Sobrecarga
    public void start(boolean silentMode) {
        System.out.println("Encendido del vehiculo en modo silencioso");
    }

    /// Ejemplo de que en la sobrecarga no afecta solo el numero de parametros si no tambien su tipo
    public void start(int silentMode) {
        System.out.println("Encendido del vehiculo en modo silencioso");
    }
}
