package org.diegofigueroa.estructuras_de_datos.hashset;

import java.util.Objects;

public record Person(String name, String dni) implements Comparable<Person>{

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(dni, person.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(dni);
    }

    @Override
    public int compareTo(Person o) {
        return this.dni.compareTo(o.dni);
    }
}
