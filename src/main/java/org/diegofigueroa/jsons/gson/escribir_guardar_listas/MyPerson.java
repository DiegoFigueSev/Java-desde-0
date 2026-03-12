package org.diegofigueroa.jsons.gson.escribir_guardar_listas;

import java.util.List;

public class MyPerson {
    private String name;
    private Integer age;
    private boolean student;
    private List<String> hobbies;

    public MyPerson(String name, Integer age, boolean student, List<String> hobbies) {
        this.name = name;
        this.age = age;
        this.student = student;
        this.hobbies = hobbies;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public boolean isStudent() {
        return student;
    }

    public void setStudent(boolean student) {
        this.student = student;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    @Override
    public String toString() {
        return "MyPerson{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", student=" + student +
                ", hobbies=" + hobbies +
                '}';
    }
}

