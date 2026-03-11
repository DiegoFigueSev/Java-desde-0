package org.diegofigueroa.estructuras_de_datos.linkedlists;

import java.util.LinkedList;
import java.util.List;

public class MyLinkedList {
    {
        /**
         * Un linked list son listas BASADAS EN NODOS
         * Son listas doblemente enlazadas
         *
         * Cada elemento sabra que hay delante y que hay detras
         */

        List<String> cities = new LinkedList<>();
        cities.add("Buenos Aires");
        cities.add("Paris");
        cities.add("New York");

        ((LinkedList)cities).addFirst("London");
        ((LinkedList)cities).addFirst("Berlin");

        System.out.println(cities);

        cities.set(1, "Madrid");

        cities.remove("London");

        System.out.println(cities);

        ((LinkedList)cities).removeFirst();
        ((LinkedList)cities).removeLast();

        System.out.println(cities);

        /**
         * Acceder al primero y al ultio es de O(1)
         * Acceder a. un elemento del medio O(n) porque recorremos los nodos
         *
         * Util cuando realizamos inserciones o eliminaciones en el medio
         * - No necesitamos desplazar elementos, SOLO EDITAR EL NODO
         */

    }
}
