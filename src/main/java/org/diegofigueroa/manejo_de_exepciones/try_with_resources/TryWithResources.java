package org.diegofigueroa.manejo_de_exepciones.try_with_resources;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResources {
    {
        //* Nosotros podemos definir una operacion obligatorio a cumplirse dentro del try
        //* Si salta una exception no ejecutara el codigo dentro
        //? La gran ventaja que tiene esto es que lo que abrimos en los parametros del try se autocierran
        try(
                BufferedReader reader = new BufferedReader(new FileReader("example.txt"));
                BufferedReader readerAux = new BufferedReader(new FileReader("example2.txt"))
        ){
            String line;
            while ((line = reader.readLine()) != null){
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("El archivo no fue encontrado");
        } catch (IOException e) {
            System.out.println("Error en la lectura del archivo");
        }
    }
}
