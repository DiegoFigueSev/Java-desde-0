package org.diegofigueroa.tema_05_manejo_de_exepciones.proyecto;

import java.util.List;
import java.util.Scanner;

public class Program {
    private final StudentRegistrationSystem system;
    private Scanner scn;

    public Program() {
        this.system = new StudentRegistrationSystem();
    }

    private void welcomeMessage() {
        System.out.println("Bienvenido al sistema de registro de estudiantes");
    }

    private void optionsMessage() {
        System.out.println("""
                1. Registrar estudiante
                2. Eliminar estudiante
                3. Mostrar todos los estudiantes
                4. Salir
                """);
    }

    private int requestOptionMessage() {
        while (true) {
            try {
                System.out.print("Seleccione una opción: ");
                return Integer.parseInt(scn.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Ingresa una opción válida.");
            }
        }
    }

    private String requestNameMessage() {
        while (true) {
            System.out.print("Nombre: ");
            String name = scn.nextLine().trim();

            if (!name.isEmpty()) {
                return name;
            }

            System.out.println("El nombre no puede estar vacío.");
        }
    }

    private byte requestAgeMessage() {
        while (true) {
            try {
                System.out.print("Edad: ");
                byte age = Byte.parseByte(scn.nextLine().trim());
                return age;
            } catch (NumberFormatException e) {
                System.out.println("Ingresa una edad válida.");
            }
        }
    }

    private String requestStudentId() {
        while (true) {
            System.out.print("ID del estudiante: ");
            String id = scn.nextLine().trim();

            if (!id.isEmpty()) {
                return id;
            }

            System.out.println("El ID no puede estar vacío.");
        }
    }

    private void showAllStudents() {
        List<Student> students = system.getAllStudents();

        if (students.isEmpty()) {
            System.out.println("No hay estudiantes registrados.");
            return;
        }

        for (Student student : students) {
            System.out.println(student);
        }
    }

    private void logic(int option) {
        switch (option) {
            case 1 -> {
                try {
                    Student student = Student.createEntity(
                            requestNameMessage(),
                            requestAgeMessage()
                    );
                    system.addStudent(student);
                    System.out.println("Estudiante registrado correctamente.");
                } catch (RuntimeException e) {
                    System.out.println(e.getMessage());
                }
            }
            case 2 -> {
                try {
                    system.removeStudent(requestStudentId());
                    System.out.println("Estudiante eliminado correctamente.");
                } catch (RuntimeException e) {
                    System.out.println(e.getMessage());
                }
            }
            case 3 -> showAllStudents();
            case 4 -> System.out.println("Finalizando programa...");
            default -> System.out.println("Ingresa una opción correcta.");
        }
    }

    public void execute() {
        scn = new Scanner(System.in);
        welcomeMessage();
        int option;
        do {
            optionsMessage();
            option = requestOptionMessage();
            logic(option);
        } while (option != 4);
        scn.close();
    }
}