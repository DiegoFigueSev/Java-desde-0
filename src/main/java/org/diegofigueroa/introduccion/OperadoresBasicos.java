package org.diegofigueroa.introduccion;

public class OperadoresBasicos {

    /**
     * Que son?
     *
     * Son simbolos que permiten realizar multiples operaciones
     *
     * No podemos programar sin operadores
     *
     * Sus categorias son:
     *  - Relacioneales
     *  - Logicos
     *  - Ternarios
     *  - Inc ; Dec
     *  - Asignacion
     *  - Aritmeticos
     */

    // * Operadores de asignacion
    //Me ayudan a asignar nombres a variables

    // ? Bloque de inicializacion, este bloque se ejecutara cuando instanciemos la clase, como un constructor sin serlo
    {
        int a = 10;
        a += 5;
        a -= 3;
        a *= 2;
        a /= 4;
        a %= 3;
    }

    // * Operadores Aritmeticos
    {
        int a = 10;
        int b = 5;
        a = a + b; //suma
        a = a - b; //resta
        a = a * b; //multiplicacion
        a = a / b; //division
        a = a % b; //resto de la division / division entera
    }

    // * Operadores relacionales
    // ? Compara valores y nos regresa tru o false
    {
        int a = 10;
        int b = 15;
        boolean response;

        response = a == b;
        response = a != b;
        response = a > b;
        response = a < b;
        response = a >= b;
        response = a <= b;
    }

    // * Operadores logicos
    // ? Permite comparar/combinar expresiones booleanas.
    // ? Nos ayuda a manipular los operadores logicos
    {
        boolean a = true;
        boolean b = false;
        boolean response;

        response = a && b; //AND
        response = a || b; //OR
        response = !a; //NOT
    }

    // * Operadores Unarios
    // ? Se aplican a un solo operando
    {
        int a = 5;
        int b = -a; //Negacion unaria
        boolean flag = true;
        Object aux;

        //Negacion unaria
        aux = -b;

        // Post Imcremento
        a++;
        // Pre incremento
        ++a;

        //Post decremento
        a--;
        //Pre decremento
        --a;
    }

}
