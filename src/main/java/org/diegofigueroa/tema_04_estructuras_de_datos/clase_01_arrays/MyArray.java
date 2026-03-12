package org.diegofigueroa.tema_04_estructuras_de_datos.clase_01_arrays;

public class MyArray {

    {
        ///  Un array es una coleccion estatica
        ///  Sus ventajas es q es mas rapida

        // ? Inicializamos el arreglo con 0 al ser un dato primitivo
        int[] numbersPrimitive = new int[5];

        //? Inicializamos el arreglo con NULL al ser una clase
        Integer[] numbersWrapper = new Integer[5];

        numbersPrimitive[0] = 10;
        numbersPrimitive[1] = 20;

        for(int number : numbersPrimitive){
            System.out.print(" Dato primitivo: "+ number);
        }

        System.out.println("\n");

        numbersWrapper[0] = 30;
        numbersWrapper[1] = 40;

        for(Integer number : numbersWrapper){
            System.out.print(" Dato wrapper: "+ number );
        }
    }
}
