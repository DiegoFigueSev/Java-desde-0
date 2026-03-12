package org.diegofigueroa.manejo_de_exepciones.proyecto;

public class StudentNotFoundException extends RuntimeException {
    public StudentNotFoundException() {
        super("Estudiante no encontrado");
    }
}
