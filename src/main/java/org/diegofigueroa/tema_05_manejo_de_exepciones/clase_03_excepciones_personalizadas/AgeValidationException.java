package org.diegofigueroa.tema_05_manejo_de_exepciones.clase_03_excepciones_personalizadas;

// * Excepcion del tipo CHECKED
public class AgeValidationException extends Exception {
    public AgeValidationException(String message) {
        super(message);
    }
}