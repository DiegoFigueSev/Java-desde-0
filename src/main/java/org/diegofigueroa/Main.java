package org.diegofigueroa;

import org.diegofigueroa.clasesyobjetos.practica.BankAccount;
import org.diegofigueroa.clasesyobjetos.practica.BankApp;

public class Main {
    static void main() {
        BankApp bankApp = new BankApp(new BankAccount("Diego Figueroa", 0.0));
    }
}

/**
 *
 * Como compila el codigo:
 *
 * Por consola es lo sgte:
 *
 * 1ro: Cra el archivo .java (con touch, nano, etc)
 * 2do: Convertimos ese archivo .java a bytecode intermedio. De .java pasa a .class
 *  Esto se logra ejecutando: javac [nombre de nuestro archivo].java
 * 3ro: Ejecutamos el bytecode: java [nombre del archivo](sin extension)
 *
 * El flujo es el siguiente:
 *  archivo .java -> (javac) lo convertimos a bytecode -> Lo ejecutamos con el JVM (java)
 */



