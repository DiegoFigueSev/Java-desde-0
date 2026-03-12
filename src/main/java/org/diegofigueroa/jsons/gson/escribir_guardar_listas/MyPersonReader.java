package org.diegofigueroa.jsons.gson.escribir_guardar_listas;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.internal.GsonBuildConfig;
import com.google.gson.reflect.TypeToken;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

public class MyPersonReader {

    public static List<MyPerson> fromJson(String fileName){
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        try(FileReader reader = new FileReader(fileName)){
            Type myPersonListType = new TypeToken<List<MyPerson>>(){}.getType();
            List<MyPerson> myPeople = gson.fromJson(reader, myPersonListType);
            System.out.println("Lectura realizada con exito");
            return myPeople;
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
        return null;
    }

}
