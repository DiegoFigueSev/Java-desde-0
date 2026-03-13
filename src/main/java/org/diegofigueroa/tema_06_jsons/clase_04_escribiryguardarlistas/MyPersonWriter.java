package org.diegofigueroa.tema_06_jsons.clase_04_escribiryguardarlistas;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class MyPersonWriter {
    public static void toJson(String file, List<MyPerson> people){
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        try(FileWriter writer = new FileWriter(file)){
            gson.toJson(people, writer);
            System.out.println(gson.toJson(people));
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
