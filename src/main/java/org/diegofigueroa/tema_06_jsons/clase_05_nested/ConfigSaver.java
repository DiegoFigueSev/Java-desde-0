package org.diegofigueroa.tema_06_jsons.clase_05_nested;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class ConfigSaver {
    public static void saveConfig(String filePath, AppConfig config){
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        try(FileWriter writer = new FileWriter(filePath)){
            gson.toJson(config, writer);
            System.out.println("Configuracion guardada");
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
