package org.diegofigueroa.tema_05_manejo_de_exepciones.proyecto;

public class DuplicateStudentException extends RuntimeException {
    public DuplicateStudentException() {
        super("El estudiante ya existe");
    }
}
