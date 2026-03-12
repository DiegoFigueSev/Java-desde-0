package org.diegofigueroa.tema_01_introduccion.clase_06_IO;

import java.util.Scanner;

public class ClaseScanner {
    {
        getNumber();
    }

    public int getNumber(){
        Scanner scanner = new Scanner(System.in);
        try {
            int a = scanner.nextInt();
            System.out.println("Imprimir: " + a);
            return a;
        } catch (Exception e) {
            System.out.println(e);
            return getNumber();
        } finally {
            scanner.close();
        }
    }
}
