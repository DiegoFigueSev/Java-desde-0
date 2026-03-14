package org.diegofigueroa;

import org.diegofigueroa.tema_06_jsons.clase_04_escribiryguardarlistas.MyPerson;
import org.diegofigueroa.tema_06_jsons.clase_04_escribiryguardarlistas.MyPersonReader;
import org.diegofigueroa.tema_06_jsons.clase_04_escribiryguardarlistas.MyPersonWriter;
import org.diegofigueroa.tema_07_mvc.controlador.TaskController;
import org.diegofigueroa.tema_07_mvc.modelo.TaskRepository;
import org.diegofigueroa.tema_07_mvc.vista.TaskView;
import org.diegofigueroa.tema_08_lombok.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    static void main() {
        /*
        TaskRepository repository = new TaskRepository();
        TaskController controller = new TaskController(repository);
        TaskView view = new TaskView(controller);

        view.showMenu();

         */

        Person person = Person.builder().name("Diego").lastName("Figueroa").age(32).build();
        System.out.println(person);
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



