package org.diegofigueroa.jsons.gson.leer_y_escribir;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.diegofigueroa.jsons.gson.Person;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JsonWriterReaderList {
    {

        Gson gson = new Gson();

        List<Person> people = new ArrayList<>(Arrays.asList(
                new Person("Diego Figueroa", 23, true),
                new Person("Roberto Figueroa", 16, false),
                new Person("Daniela Figueroa", 30, true)
        ));

        try(FileWriter writer = new FileWriter("person.json")) {
            gson.toJson(people, writer);
            System.out.println("Las personas fueron grabadas con exito");
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

        try(FileReader reader = new FileReader("person.json")){
            Type listType = new TypeToken<List<Person>>(){}.getType();
            //? Este JSON es una lista de PERSON conviertelo correctamente
            people = gson.fromJson(reader, listType);
            System.out.println(people);
        } catch (IOException e){
            System.out.println(e.getMessage());
        }

        for (Person aux : people){
            System.out.println(aux);
        }
    }
}
