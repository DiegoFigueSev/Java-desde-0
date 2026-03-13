package org.diegofigueroa.tema_06_jsons.clase_01_serializacionydeserializacion;

import com.google.gson.Gson;
import org.diegofigueroa.tema_06_jsons.Person;

public class SerializerAndDeserializer {
    {
        Person person = new Person("Diego", 25, true);
        Gson gson = new Gson();
        String json = gson.toJson(person);

        System.out.println(json);

        json = "{\"name\":\"Diego\",\"age\":25,\"student\":true}"; //Usamos barra de escape cuando queremos " dentro del string

        Person personFromJson = gson.fromJson(json, Person.class);

        System.out.println(Person.class);

        System.out.println(personFromJson);
    }
}
