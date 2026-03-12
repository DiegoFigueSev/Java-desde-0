package org.diegofigueroa.tema_04_estructuras_de_datos.clase_05_linkedhashset;

import org.diegofigueroa.tema_04_estructuras_de_datos.clase_04_hashset.Person;

import java.util.LinkedHashSet;
import java.util.Set;

public class MyLinkedHashSet {
    {
        /**
         * LinkedHashSet es una lista ordenada doblemente enlazada basada en nodos, no indexable, iterable y mutable,
         */

        Set<Integer> numbers = new LinkedHashSet<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
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
        Set<Person> persons = new LinkedHashSet<>();
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
