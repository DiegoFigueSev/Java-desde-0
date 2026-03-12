package org.diegofigueroa.tema_03_poo.practica;

public class program {
    static void main() {
        Vehicle myCar = new Car("Fiat Duna", "Duna", 3000, CarType.SEDAN);
        Vehicle myElectricCar = new ElectricCar("Testa", "Model 3", 3000, CarType.SEDAN, 100);
        myCar.start();
        myElectricCar.start();
        ((ElectricCar) myElectricCar).chargeBattery();
        System.out.println(myCar);
        System.out.println(myElectricCar);
    }
}
