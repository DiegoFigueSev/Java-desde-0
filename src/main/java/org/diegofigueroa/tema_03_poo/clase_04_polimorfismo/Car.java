package org.diegofigueroa.tema_03_poo.clase_04_polimorfismo;

class Car extends Vehicle {

    public Car(String branc, int year) {
        super(branc, year);
    }

    // ? Sobreescritura: Redefinimos un metodo que estaba definido en el padre
    @Override
    public void start() {
        super.start(); /// Llamamos la funcionalidad del padre
        System.out.println("Metodo sobrescrito");
    }
}
