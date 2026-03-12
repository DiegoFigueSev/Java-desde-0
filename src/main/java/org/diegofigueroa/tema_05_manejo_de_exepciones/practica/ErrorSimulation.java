package org.diegofigueroa.manejo_de_exepciones.practica;

import javax.xml.transform.Source;

public class ErrorSimulation {
    public static void simulateError() {
        try {
            causeError();
        } catch (Exception e) {
            System.out.println("Se detecto el error");
            System.out.println(e.getMessage());
            StackTraceElement[] stack = e.getStackTrace();
            for (StackTraceElement aux : stack){
                System.out.println(aux.getClassName());
                System.out.println(aux.getFileName());
                System.out.println(aux.getLineNumber());
                System.out.println(aux.getMethodName());
            }
        }
    }

    private static void causeError() throws Exception{
        throw new Exception("Se ah producido una excepcion en tiempo de ejecucion");
    }
}
