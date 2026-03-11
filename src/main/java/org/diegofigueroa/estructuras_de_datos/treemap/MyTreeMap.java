package org.diegofigueroa.estructuras_de_datos.treemap;

import com.sun.source.tree.Tree;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MyTreeMap {
    {
        /**
         * Los elementos de un treemap tienen un orden alfabetico
         * Pero es eficiente en busqueda
         */

        //Crear
        Map<String, Integer> productPrices = new TreeMap<>();
        productPrices.put("Laptop", 32);
        productPrices.put("Mouse", 12);
        productPrices.put("Laptop", 312);
        productPrices.put("Tablet", 32);

        //Obtener
        System.out.println(productPrices);

        //Editar
        productPrices.put("Tablet", 1234);

        //Eliminar
        productPrices.remove("Tablet");
        System.out.println(productPrices);
    }
}
