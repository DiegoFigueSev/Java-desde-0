package org.diegofigueroa.tema_02_clases_y_objetos.clase_05_string;

public class ClaseString {

    {
        // ? String es una cadena de caracteres
        // El string  no es un tipo de dato primitivo

        String str = "abc";

        // ? Es lo mismo que:
        char[] data = {'a', 'b', 'c'};
        String newStr = new String(data);

        // * Un String es inmutable (como en python) el String no tiene metodos void para editar el valor
        // * Tiene metodos que nos regresan otro String

        /**
         * JAVA TIENE UN POOL DE STRINGs
         *
         * Cuando nosotros repetimos valores, esa variable apunta a la misma direccion de memoria
         */

        String name = "Diego";
        String name2 = "Diego";
        // ? Java no repite datos en memoria

        System.out.println(name == name2);


        // * METODOS MAS IMPORTANTES DE STRING
        // Método length()
        String text = "Hola, mundo!";
        System.out.println("Longitud: " + text.length()); // 12

        // Método charAt(int index)
        System.out.println("Carácter en la posición 2: " + text.charAt(2)); // 'l'

        // Método substring(int beginIndex, int endIndex)
        System.out.println("Subcadena: " + text.substring(0, 5)); // "Hola,"

        // Métodos toUpperCase() y toLowerCase()
        System.out.println("Mayúsculas: " + text.toUpperCase()); // "HOLA, MUNDO!"
        System.out.println("Minúsculas: " + text.toLowerCase()); // "hola, mundo!"

        // Método equals(Object obj)
        String text1 = "Hola";
        String text2 = "hola";
        System.out.println("¿Son iguales? " + text1.equals(text2)); // false

        // Método equalsIgnoreCase(String str)
        System.out.println("¿Son iguales (ignorando mayúsculas)? " + text1.equalsIgnoreCase(text2)); // true

        // Método contains(CharSequence s)
        System.out.println("¿Contiene 'mundo'? " + text.contains("mundo")); // true

        // Método replace(char oldChar, char newChar)
        System.out.println("Reemplazado: " + text.replace('o', 'a')); // "Hala, munda!"

        // Método trim()
        String textWithSpaces = "   Hola, mundo!   ";
        System.out.println("Trimmed: " + textWithSpaces.trim()); // "Hola, mundo!"

        // Método split(String regex)
        String csvText = "Uno,Dos,Tres";
        String[] parts = csvText.split(",");
        String[] parts2 = {"Uno", "Dos", "Tres", "Cuatro"};
        System.out.println("Dividido:");

        for (String part : parts) {
            System.out.println(part);
        }

        // Salida:
        // Uno
        // Dos
        // Tres
    }

}
