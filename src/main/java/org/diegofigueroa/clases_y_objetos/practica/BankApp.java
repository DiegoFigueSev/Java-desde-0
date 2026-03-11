package org.diegofigueroa.clases_y_objetos.practica;

import java.util.Scanner;

public class BankApp {

    BankAccount account;
    Scanner scn;

    public BankApp(BankAccount account) {
        this.account = account;
        scn = new Scanner(System.in);
        runnable();
    }



    private void optionsMessage(){
        System.out.println("Que operacion deseas realizar: \n 1: Depositar dinero \n 2: Retirar dinero \n 3: Mostrar saldo \n 4: Salir");
    }

    private int getUserOption(){
        return scn.nextInt();
    }

    private double getInputData(){
        return scn.nextDouble();
    }

    private boolean logicProgram(int option) throws Exception {
        switch (option){
            case 1:
                System.out.println("Ingresa el monto de tu operacion: ");
                this.account.deposit(getInputData());
                break;
            case 2:
                System.out.println("Ingresa el monto de tu operacion: ");
                this.account.withdraw(getInputData());
                break;
            case 3:
                System.out.println(this.account.toString());
                break;
            default:
                return false;
        }
        return true;
    }

    private void runnable(){
        int option;
        optionsMessage();
        boolean hasConti;
        try {
            do {
                option = getUserOption();
                hasConti = logicProgram(option);
                optionsMessage();
            } while (hasConti);
        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
            runnable();
        } finally {
            scn.close();
        }
    }
}
