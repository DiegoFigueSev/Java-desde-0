package org.diegofigueroa.manejo_de_exepciones.excepciones_personalizadas;

public record BankAccount(double balance) {
    public void withdraw(double amount) throws RuntimeException{
        if (amount > balance) throw new NegativeBalanceException("Fondos insuficientes");
    }
}
