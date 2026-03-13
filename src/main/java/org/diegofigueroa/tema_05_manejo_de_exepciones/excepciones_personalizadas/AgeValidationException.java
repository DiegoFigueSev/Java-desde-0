package org.diegofigueroa.tema_05_manejo_de_exepciones.excepciones_personalizadas;

// * Excepcion del tipo CHECKED
public class AgeValidationException extends Exception {
    public AgeValidationException(String message) {
        super(message);
    }
}
