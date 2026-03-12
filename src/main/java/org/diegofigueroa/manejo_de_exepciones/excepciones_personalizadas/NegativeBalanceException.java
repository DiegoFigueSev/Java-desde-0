package org.diegofigueroa.manejo_de_exepciones.excepciones_personalizadas;

public class NegativeBalanceException extends RuntimeException {
    public NegativeBalanceException(String message) {
        super(message);
    }
}
