package org.diegofigueroa.tema_05_manejo_de_exepciones.clase_05_debugging;

public class DebuggingDeExep {
    {
        try {
           int[] n = new int[4];
           System.out.println(n[10]);
        } catch (ArrayIndexOutOfBoundsException e){
            // Imprime el stack trace del error
            e.printStackTrace();
            System.out.println("--------------");
            // ? Nos retorna el stack de la ruta hacia el error
            StackTraceElement[] stack = e.getStackTrace();
            for (StackTraceElement element : stack){
                System.out.println("Clase " + element.getClassLoaderName());
                System.out.println("Clase " + element.getClassName());
                System.out.println("Metodo: " + element.getMethodName());
                System.out.println("Archivo: " + element.getFileName());
                System.out.println("Line: " + element.getLineNumber());
                System.out.println("Tipo de dato: " + element.getClass());
            }
        }
    }
}
