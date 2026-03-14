package org.diegofigueroa.tema_08_lombok;

import lombok.*;

/**
 * Que es una anotacion?
 * Es una etiqueta q anade funcionalidad al codigo
 * Es una meta etiqueta
 * Agrega informacion al codigo
 */

@Data
@Builder
public class Person {
    private String name;
    private int age;
    private String lastName;
}
