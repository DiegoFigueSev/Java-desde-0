package org.diegofigueroa.poo;

/// El polimorfismo nos ayuda a imlpementar mismo concepto pero con diferente funcinalidad
///
/// Un metodo puede tener diferentes comportamiento segun la clase q lo implemente
public class Polimorfismo {

    /// Polimorfismo por inclusion
    Car3 car = new Car3("Motorola", 3);
    Vehicle3 vehicle3 = new Vehicle3("Samsung", 3);

    public void printVehicle(Vehicle3 vehicle){
        System.out.println(vehicle.toString());
    }


    {
        printVehicle(car);
        printVehicle(vehicle3);
    }


}

class Vehicle3{

    private String branc;
    private int year;

    public Vehicle3(String branc, int year) {
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
    public void start(){
        System.out.println("Encendido del vehiculo");
    }

    /// Sobrecarga
    public void start(boolean silentMode){
        System.out.println("Encendido del vehiculo en modo silencioso");
    }

    /// Ejemplo de que en la sobrecarga no afecta solo el numero de parametros si no tambien su tipo
    public void start(int silentMode){
        System.out.println("Encendido del vehiculo en modo silencioso");
    }
}

class Car3 extends Vehicle3 {

    public Car3(String branc, int year) {
        super(branc, year);
    }

    // ? Sobreescritura: Redefinimos un metodo que estaba definido en el padre
    @Override
    public void start() {
        super.start(); /// Llamamos la funcionalidad del padre
        System.out.println("Metodo sobrescrito");
    }
}



