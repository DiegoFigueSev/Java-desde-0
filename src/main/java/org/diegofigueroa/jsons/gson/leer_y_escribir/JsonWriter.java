package org.diegofigueroa.jsons.gson.leer_y_escribir;

import com.google.gson.Gson;
import org.diegofigueroa.jsons.gson.Person;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class JsonWriter {
    {
        Person person = new Person("Juan", 23, true);
        Gson gson = new Gson();



        try(FileWriter writer = new FileWriter("person.json")){
            gson.toJson(person, writer);
            System.out.println("La persona fue guardada con exito");
        }
        catch (FileNotFoundException e){
            System.out.println("El archivo no existe");
        }
        catch (IOException e){
            System.out.println("Error escribiendo sobre el archivo");
        }
        System.out.println("App finalizada");


        try(FileReader reader = new FileReader("person.json")){
            Person personFromJson = gson.fromJson(reader, Person.class);
            System.out.println("La persona fue leida con exito: " + personFromJson);
        }
        catch (FileNotFoundException e){
            System.out.println("El archivo no existe");
        }
        catch (IOException e){
            System.out.println("Error escribiendo sobre el archivo");
        }
    }
}
