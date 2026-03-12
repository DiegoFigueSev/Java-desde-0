package org.diegofigueroa.tema_02_clases_y_objetos.practica;

public class BankAccount {

    private String accountOwner;
    private double mount;

    public BankAccount(String accountOwner, double mount) {
        this.accountOwner = accountOwner;
        this.mount = mount;
    }

    public String getAccountOwner() {
        return accountOwner;
    }

    public void setAccountOwner(String accountOwner) {
        this.accountOwner = accountOwner;
    }

    public double getMount() {
        return mount;
    }

    public void setMount(double mount) {
        this.mount = mount;
    }

    public void deposit(double amount) throws Exception {
        if (isValidMount(amount)){
            this.mount += amount;
        } else {
            throw new Exception("El monto es menor a 0");
        }
    }

    public void withdraw(double amount) throws Exception{
        if (isValidMount(amount) && amount < this.mount){
            this.mount -= amount;
        } else {
            throw new Exception("El monto que deseas retirar supera tu monto en la cuenta");
        }
    }

    private boolean isValidMount(double amount){
        return amount > 0;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "mount=" + mount +
                ", accountOwner='" + accountOwner + '\'' +
                '}';
    }
}
