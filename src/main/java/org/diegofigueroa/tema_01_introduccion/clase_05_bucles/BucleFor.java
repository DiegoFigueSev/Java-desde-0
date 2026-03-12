package org.diegofigueroa.tema_01_introduccion.clase_05_bucles;


import java.util.ArrayList;
import java.util.Arrays;

// ? SIEMPRE Q DEFINIMOS UNA CLASE ES 1RA LETRA EN MAYUSCULA Y EN SINGULAR
public class BucleFor {
    {
        /**
         *
         */

        // ? Typea fori en intelliJ y te dara el constructor del bucle for de una
        for (int i = 0; i < 10; i++) {

        }
        // ? A diferencia de python un for es un iterador aritmetico y no un iterador de valores

        ArrayList<Integer> aux = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        for (int val : aux){
            if (val == 3){
                continue;
            }
            if (val == 4){
                System.out.println(val);
                break;
            }
            System.out.println(val);
        }
    }
}
