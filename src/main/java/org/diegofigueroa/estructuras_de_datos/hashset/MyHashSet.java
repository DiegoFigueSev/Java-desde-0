package org.diegofigueroa.estructuras_de_datos.hashset;

import java.util.HashSet;
import java.util.Set;

public class MyHashSet {
    {
        /**
         * Hasset es una Coleccion de elementos MUTABLE, NO INDEXABLE, NO ORDENADO, PERO ES ITERABLE.
         */

        Set<Integer> numbers = new HashSet<>();

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
        Set<Person> persons = new HashSet<>();
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


