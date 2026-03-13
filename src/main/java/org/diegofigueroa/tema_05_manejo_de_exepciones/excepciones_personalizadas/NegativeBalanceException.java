package org.diegofigueroa.tema_05_manejo_de_exepciones.excepciones_personalizadas;

public class NegativeBalanceException extends RuntimeException {
    public NegativeBalanceException(String message) {
        super(message);
    }
}
