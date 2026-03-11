package org.diegofigueroa.estructuras_de_datos.iteradores;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Iteradores {
    {
        List<String> names = new ArrayList<>(Arrays.asList("Diego", "Hernan", "Figueroa", "Sevillano"));

        /*
        Cuando tratamos de editar la lista durante su iteracion en un for nos mandara un error
        Porque internamente se esta confundiendo

        El foreach no soporta modificaciones

        for (String name : names){
            if (name.startsWith("A") || name.startsWith("H")) names.remove(name);
        }

         */

        // Para realizarl lo anterior debemos definir un iterador
        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()){
            String name = iterator.next();
            if (name.startsWith("H")) iterator.remove();
        }

        System.out.println(names);
    }

}
