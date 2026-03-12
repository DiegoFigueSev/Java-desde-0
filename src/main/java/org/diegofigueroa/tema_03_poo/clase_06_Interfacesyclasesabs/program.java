package org.diegofigueroa.tema_03_poo.clase_06_Interfacesyclasesabs;

public class program {
    static void main() {
        Vehicle vehicle = new Vehicle("diego", 32, "32") {
            @Override
            void drive() {

            }
        };
    }
}
