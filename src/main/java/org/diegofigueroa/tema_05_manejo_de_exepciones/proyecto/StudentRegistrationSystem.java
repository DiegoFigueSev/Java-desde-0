package org.diegofigueroa.tema_05_manejo_de_exepciones.proyecto;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class StudentRegistrationSystem {
    private final Map<String, Student> students;

    public StudentRegistrationSystem() {
        this.students = new HashMap<>();
    }

    public void addStudent(Student newStudent) throws DuplicateStudentException {
        if (newStudent == null) {
            throw new IllegalArgumentException("El estudiante no puede ser nulo");
        }

        if (students.containsKey(newStudent.getId())) {
            throw new DuplicateStudentException();
        }

        students.put(newStudent.getId(), newStudent);
    }

    public void removeStudent(String studentId) throws StudentNotFoundException {
        if (studentId == null || studentId.isBlank()) {
            throw new IllegalArgumentException("El id no puede ser nulo ni vacío");
        }

        if (!students.containsKey(studentId)) {
            throw new StudentNotFoundException();
        }

        students.remove(studentId);
    }

    public List<Student> getAllStudents() {
        return new ArrayList<>(students.values());
    }
}