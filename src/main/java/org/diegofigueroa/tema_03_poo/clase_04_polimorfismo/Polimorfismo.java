package org.diegofigueroa.tema_03_poo.clase_04_polimorfismo;

/// El polimorfismo nos ayuda a imlpementar mismo concepto pero con diferente funcinalidad
///
/// Un metodo puede tener diferentes comportamiento segun la clase q lo implemente
public class Polimorfismo {

    /// Polimorfismo por inclusion
    Car car = new Car("Motorola", 3);
    Vehicle vehicle3 = new Vehicle("Samsung", 3);

    public void printVehicle(Vehicle vehicle){
        System.out.println(vehicle.toString());
    }


    {
        printVehicle(car);
        printVehicle(vehicle3);
    }


}



