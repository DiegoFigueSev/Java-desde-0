package org.diegofigueroa.tema_04_estructuras_de_datos.extra;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class streams {
    {

        /**
         * Los Streams en java es una foram de procesar coleeciones de datos de manera declarativa
         * Podemos:
         * - filtrar
         * - transformar
         * - ordenar
         * - agrupar
         * - recudir
         *
         * Un STREAM no es una lista si no una utilidad para manipular listas de manera mas sencilla
         */

        List<String> list = new ArrayList<>(Arrays.asList("Diego", "Roberto", "Daniela", "Celeste"));

        Stream<String> stream = list.stream()
                .filter(value -> value.length() > 3)
                .map(value -> value.toUpperCase());

        list = stream.toList();

        System.out.println(list);

        /**
         * Tenemos dos tipos de streams
         *
         * Stream
         *
         * ParallelStrem -> Procesa en paralelo
         */

        /**
         * filter      : filtra elementos según una condición.
         * map         : transforma cada elemento en otro valor.
         * flatMap     : aplana estructuras anidadas en una sola secuencia.
         * distinct    : elimina elementos duplicados.
         * sorted      : ordena los elementos.
         * limit       : limita la cantidad de elementos.
         * skip        : salta una cantidad de elementos al inicio.
         * peek        : inspecciona elementos durante el flujo, útil para depuración.
         * forEach     : recorre cada elemento y ejecuta una acción.
         * collect     : reúne los resultados en una colección u objeto final.
         * toList      : convierte el stream en una lista.
         * count       : cuenta cuántos elementos hay.
         * findFirst   : obtiene el primer elemento si existe.
         * findAny     : obtiene algún elemento, útil en streams paralelos.
         * anyMatch    : verifica si al menos un elemento cumple una condición.
         * allMatch    : verifica si todos los elementos cumplen una condición.
         * noneMatch   : verifica si ningún elemento cumple una condición.
         * reduce      : combina todos los elementos en un único resultado.
         * min         : obtiene el menor elemento.
         * max         : obtiene el mayor elemento.
         * mapToInt    : transforma elementos a int.
         * mapToLong   : transforma elementos a long.
         * mapToDouble : transforma elementos a double.
         */
    }
}
