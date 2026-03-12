package org.diegofigueroa.tema_02_clases_y_objetos.clase_01_atributosymetodos;

// * CREACION DEL MOLDE/CLASE HOUSE
class House {
    // ? ATRIBUTOS
    int doors;
    int windows;
    double size;

    // * Nos permite crear muchos objetos del mismo tipo pero con diferentes caracteristicas

    // ? METODOS

    void openDoor() {
        System.out.println("La puerta esta abierta");
    }

    double calculateArea() {
        return size * size;
    }
}
