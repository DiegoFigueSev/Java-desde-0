package org.diegofigueroa.tema_04_estructuras_de_datos.clase_02_arraylist;

import java.util.ArrayList;
import java.util.List;

public class MyArrayList {
    {
        /// Una lista es una coleccion ordenada de elementos mutable con metodos para editar los datos

        List<Integer> myList = new ArrayList<>(); //? Es mejor usar la clase abstracta porque podemos englobar mas clases

        // Crea un array de 10, al crecer crea un array 50% mas grande

        myList.add(25);
        myList.add(100);
        myList.add(303);

        System.out.println(myList);

        System.out.println(myList.get(0));

        System.out.println(myList.remove(1));

        System.out.println(myList);

        myList.set(1, 100000);
        System.out.println(myList);

        myList.add(2, 0);
        System.out.println(myList);

    }
}
