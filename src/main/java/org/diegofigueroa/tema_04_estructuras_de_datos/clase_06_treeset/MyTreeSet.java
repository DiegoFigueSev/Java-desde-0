package org.diegofigueroa.tema_04_estructuras_de_datos.clase_06_treeset;

import org.diegofigueroa.tema_04_estructuras_de_datos.clase_04_hashset.Person;

import java.util.Set;
import java.util.TreeSet;

public class MyTreeSet {
    {
        /**
         * Los Tree son mas eficientes en bsuquedas
         * A medida q ingresamos los datos los va ordenando
         *
         * Es una lista basada en arboles de datos ordenados
         *
         * Es un arbol binario balanceado
         *
         * Es mucho mas eficiente en busquedas
         * Insercion es mas lenta
         */

        Set<Integer> numbers = new TreeSet<>();

        numbers.add(10);
        numbers.add(4);
        numbers.add(21);
        numbers.add(12);
        numbers.add(90);
        numbers.add(60);

        System.out.println(numbers);

        numbers.remove(30);

        System.out.println(numbers);

        numbers.remove(60);
        numbers.add(90);

        for (Integer number : numbers){
            System.out.println(number);
        }

        //create
        Set<Person> persons = new TreeSet<>();
        persons.add(new Person("Diego", "123"));
        persons.add(new Person("Diego", "456"));

        //read
        System.out.println(persons);

        for (Person person : persons){
            System.out.println(person.name());
        }

        System.out.println(new Person("Diego", "123").equals(new Person("Diego", "123")));

        //delete
        persons.remove(new Person("Diego", "123"));
        System.out.println(persons);

        //update
        persons.add(new Person("Diego", "123"));
        System.out.println(persons);


    }
}
