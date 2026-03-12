package org.diegofigueroa.tema_01_introduccion.clase_05_bucles;

public class BucleWhileDoWhile {
    {
        // ? Sentencia

        int counter = 0;
        int acumulador = 0;
        while (counter < 5){
            System.out.println("Counter: " + counter);
            counter++;
        }


        // * Do While -> Hacer mientras
        // ? Esto primero ejecuta UNA VEZ la condificon y ejecuta el buble despues
        int counter2 = 0;
        do{
            System.out.println("Counter 2: " + counter2);
            counter2++;
        } while (counter2 < 5);
    }
}
