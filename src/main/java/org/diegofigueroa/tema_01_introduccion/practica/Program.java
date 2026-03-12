package org.diegofigueroa.tema_01_introduccion.practica;

import java.util.Arrays;
import java.util.Scanner;

public class Program {

    Scanner scanner;

    public void execute() {
        boolean continueProgram;
        scanner = new Scanner(System.in);
        do {
            logic();
            continueProgram = askForContinue();
        } while (continueProgram);
    }

    private boolean askForContinue(){
        int option;
        System.out.println("Deseas generar otro resultado? (1: si ; 0: no)");
        option = scanner.nextInt();
        scanner.nextLine();
        switch (option){
            case 1:
                return true;
            case 0:
                scanner.close();
                return false;
            default:
                askForContinue();
        }
        return false;
    }

    private void logic(){
        int age = getAge();
        double[] notes = getNotes();
        double average = getAverage(notes);
        getResultMessage(average);
    }



    private int getAge(){
        try {
            System.out.print("Ingresa tu edad: ");
            int age = scanner.nextInt();
            scanner.nextLine();
            return age;
        }catch (Exception e){
            System.out.println("El dato que ingresate no es un numero entero");
            return getAge();
        }
    }

    private double[] getNotes(){
        try {
            System.out.print("Ingresa tus notas separados por un espacio (nota: la calificacion va de 0 - 6): ");
            String[] input = scanner.nextLine().split(" ");
            double[] notes = new double[input.length];
            int i = 0;
            for (String val : input){
                notes[i] = Double.parseDouble(val);
                if (notes[i] >= 10 || notes[i] <= 0){
                    throw new RuntimeException("Ingreso una nota incorrecta");
                }
                i++;
            }
            return notes;
        }
        catch (RuntimeException e){
            System.out.println("Una de las notas que ingresaste no es correcta");
            return getNotes();
        }
        catch (Exception e){
            System.out.println("Error al leer los datos");
            return getNotes();
        }
    }

    private double getAverage(double[] notes){
        double sumNotes = Arrays.stream(notes).sum();
        int countNotes = notes.length;
        return sumNotes / countNotes;
    }

    private void getResultMessage(double average){
        System.out.println("Tu promedio es de; " + average + " usted esta:");
        if (average >= 6){
            System.out.println("Aprobado");
        } else {
            System.out.println("Reprobado");
        }
    }

}
