package org.diegofigueroa.tema_05_manejo_de_exepciones.clase_00_introduccion;

public class Introduccion {
    {
        /**
         * Las excepcion nos ayuadn a manejar errores de manera controlada
         *
         * Cuando no manejamos errores, el programa colapsa y se detiene
         *
         * Lo ideal es que nosotro controlemos la sitaucion y lo manejemos
         */
/*
        int result = 10/0;
        System.out.println(result);


 */
        ///  Las excepciones son eventos que ocurren durante la ejecucion/compilacion de un programa y que interrumpen el flujo del codigo

        ///  ERRORES != EXEPCIONES
        //? Los errores estan a nivel de sistema o del JVM y son CRITICOS

        try {
            int result = 3/0;
            System.out.println(result);
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
        } catch (Exception e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Se ejecuto");
        }
    }

    //! Este es un error!
    public static void recursive(){
        recursive();

        /**
         * La jerarquia es la sgte
         *
         * Throwable
         * -- Exception (CheckedException) -> Exepciones en tiempo de compilacion : EL IDE nos recomienda agregar exception
         * -- RuntimeException (UncheckedException) -> Exepciones en tiempo de ejecucion : No sabemos si tendremos problemas o no
         */


    }
}
