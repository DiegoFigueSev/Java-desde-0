package org.diegofigueroa.tema_01_introduccion.clase_04_condificonales;

public class CondicionalesIfSwitch {

    {
        // * Los flujos de control nos permiten tomar decisiones

        int age = 17;

        if (age > 18){
            System.out.println("Es mayor");
        } else if (age == 18) {
            System.out.println("Tiene justamente 18");
        } else {
            System.out.println("Es menor de 18");
        }

        final boolean isNotAdult = !(age>18);
        // ? Recordemos un poco sobre operadores logicos
        if (age == 18 || age > 18){
            System.out.println("Es un adulto");
        } else if (isNotAdult){
            System.out.println("No es un adulto");
        } else{
            System.out.println("Hola xd");
        }


        // * Switch
        int day = 3;

        switch (day){
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            default:
                System.out.println("Otro dia");
                break;
        }
    }
}
