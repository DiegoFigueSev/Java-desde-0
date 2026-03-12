package org.diegofigueroa.tema_02_clases_y_objetos.clase_07_constructores;

public class Constructores {

    {

        // * Instanciamos la clase al crear un objeto con esa clase o molde
        HouseB house = new HouseB();
        house.size = 32;

        HouseB house2 = new HouseB(4, 6, 6);

        house.openDoor();

        System.out.println(house2.calculateArea());

    }

}

