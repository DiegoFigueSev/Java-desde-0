package org.diegofigueroa.tema_02_clases_y_objetos.clase_01_atributosymetodos;

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

