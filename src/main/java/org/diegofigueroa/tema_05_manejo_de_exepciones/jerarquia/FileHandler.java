package org.diegofigueroa.tema_05_manejo_de_exepciones.jerarquia;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileHandler {
    {
        try {
            readFile("holamundo");
        }
        catch (FileNotFoundException e){
            System.out.println("Archivo no encontrado: ");
            System.out.println(e.getMessage());
        }
        catch (IOException e) {
            System.out.println("Error de padre mas arriba; ");
            System.out.println(e.getMessage());
        }

        System.out.println("El codigo termina aqui");
    }

    public static void readFile(String param) throws IOException {
        FileReader fileReader = new FileReader(param);
        BufferedReader reader = new BufferedReader(fileReader);
        reader.close();
    }
}
