package org.diegofigueroa.clases_y_objetos;

public class AtributosYMetodos {

    {

        // * Instanciamos la clase al crear un objeto con esa clase o molde
        House house = new House();
        house.size = 32;

        House house2 = new House();
        house2.size = 32;

        house.openDoor();

        System.out.println(house2.calculateArea());

    }

}

// * CREACION DEL MOLDE/CLASE HOUSE
class House {
    // ? ATRIBUTOS
    int doors;
    int windows;
    double size;

    // * Nos permite crear muchos objetos del mismo tipo pero con diferentes caracteristicas

    // ? METODOS

    void openDoor(){
        System.out.println("La puerta esta abierta");
    }

    double calculateArea(){
        return size * size;
    }
}
