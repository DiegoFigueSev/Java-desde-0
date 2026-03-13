package org.diegofigueroa.tema_05_manejo_de_exepciones.proyecto;

import java.util.Objects;
import java.util.UUID;

public class Student {
    private final String name;
    private final byte age;
    private final String id;

    private Student(String name, byte age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public static Student createEntity(String name, byte age) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede ser nulo ni vacío");
        }

        if (age < 17 || age > 100) {
            throw new IllegalArgumentException("La edad debe estar entre 17 y 100");
        }

        String normalizedName = name.trim();
        String randomId = UUID.randomUUID().toString();

        return new Student(normalizedName, age, randomId);
    }

    public String getName() {
        return name;
    }

    public byte getAge() {
        return age;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id='" + id + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;
        return Objects.equals(id, student.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}