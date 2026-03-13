package org.diegofigueroa.tema_05_manejo_de_exepciones.clase_03_excepciones_personalizadas;

public class PerExcep {
    Person person;

    {
        try {
            person = Person.create("Diego Figueroa", 13);
        } catch (AgeValidationException e) {
            System.out.println(e.getMessage());
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        try {
            BankAccount account = new BankAccount(500);
            account.withdraw(400);
        } catch (NegativeBalanceException e){
            System.out.println(e.getMessage());
        }
    }
}
