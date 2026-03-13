package org.diegofigueroa;

import org.diegofigueroa.tema_06_jsons.clase_04_escribiryguardarlistas.MyPerson;
import org.diegofigueroa.tema_06_jsons.clase_04_escribiryguardarlistas.MyPersonReader;
import org.diegofigueroa.tema_06_jsons.clase_04_escribiryguardarlistas.MyPersonWriter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    static void main() {
        MyPersonWriter.toJson("people.json", new ArrayList<>(Arrays.asList(
                new MyPerson("Diego", 23, true, new ArrayList<>(Arrays.asList("programar"))),
                new MyPerson("Roberto", 15, true, new ArrayList<>(Arrays.asList("dibujar", "leer"))),
                new MyPerson("Daniela", 30, false, new ArrayList<>(Arrays.asList())),
                new MyPerson("Celeste", 21, false, new ArrayList<>(Arrays.asList("estudiar", "chambear")))

        )));

        List<MyPerson> people = MyPersonReader.fromJson("people.json");
        if (people == null) return;
        for (MyPerson person : people){
            System.out.println(person);
        }
    }
}

/**
 *
 * Como compila el codigo:
 *
 * Por consola es lo sgte:
 *
 * 1ro: Cra el archivo .java (con touch, nano, etc)
 * 2do: Convertimos ese archivo .java a bytecode intermedio. De .java pasa a .class
 *  Esto se logra ejecutando: javac [nombre de nuestro archivo].java
 * 3ro: Ejecutamos el bytecode: java [nombre del archivo](sin extension)
 *
 * El flujo es el siguiente:
 *  archivo .java -> (javac) lo convertimos a bytecode -> Lo ejecutamos con el JVM (java)
 */



