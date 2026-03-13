package org.diegofigueroa.tema_07_mvc.excepciones;

public class TaskValidationException extends Exception {
    public TaskValidationException(String message) {
        super(message);
    }
}
