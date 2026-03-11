package org.diegofigueroa.estructuras_de_datos.iteradores;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class MyListIterator {
    {
        List<String> names = new ArrayList<>( Arrays.asList("Diego", "Hernan", "Roberto", "Alejandro", "Daniela", "Gedaly"));


        System.out.println("names = " + names);

        addName(names, "Carlos");
        readName(names);

        updateName(names, "Ana", "Alejandro");
        readName(names);

        removeName(names, "Daniela");
        readName(names);




    }

    public static void addName(List<String> names, String newName){
        ListIterator<String> iterator = names.listIterator();
        while (iterator.hasNext()){
            String name = iterator.next();
            if (name.equals("Roberto")) iterator.add(newName);
        }
    }

    public static void updateName(List<String> names, String newName, String oldName){
        ListIterator<String> iterator = names.listIterator();
        while (iterator.hasNext()){
            if (iterator.next().equals(oldName)) iterator.set(newName);
        }
    }

    public static void removeName(List<String> names, String nameToDelete){
        ListIterator<String> iterator = names.listIterator();
        while (iterator.hasNext()){
            if (iterator.next().equals(nameToDelete)) iterator.remove();
        }
    }

    public static void readName(List<String> names){
        ListIterator<String> iterator = names.listIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next() + " ");
        }
    }

}
