package org.diegofigueroa.tema_07_mvc.vista;

import org.diegofigueroa.tema_07_mvc.controlador.TaskController;
import org.diegofigueroa.tema_07_mvc.excepciones.TaskException;
import org.diegofigueroa.tema_07_mvc.excepciones.TaskValidationException;
import org.diegofigueroa.tema_07_mvc.modelo.Task;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class TaskView {
    private final TaskController taskController;
    private final Scanner scanner;

    public TaskView(TaskController taskController) {
        this.taskController = taskController;
        this.scanner = new Scanner(System.in);
    }

    public void showMenu(){
        while (true){
            System.out.println("\n Gestion de tareas");
            System.out.println("1. Agregar tarea");
            System.out.println("2. Eliminar tarea");
            System.out.println("3. Actualizar tarea");
            System.out.println("4, Mostrar tareas");
            System.out.println("5. Salir");

            String option = scanner.nextLine();
            switch (option){
                case "1":
                    addTaskView();
                    break;
                case "2":
                    removeTaskView();
                    break;
                case "3":
                    updateTaskView();
                    break;
                case "4":
                    showTaskView();
                    break;
                case "5":
                    System.out.println("Saliendo del sistema");
                    return;
                default:
                    System.out.println("Selecciona una opcion valida");
            }
        }
    }

    public void addTaskView(){
        try {
            Task task = getTaskInput();
            taskController.addTask(task.getId(), task.getTitle(), task.getDescription(), task.getCompleted());
        } catch (TaskException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e){
            System.out.println("Error inesperado");
            e.printStackTrace();
        }
    }

    public void removeTaskView(){

        try {
            System.out.println("Ingrese el Id a eliminar");
            String id = scanner.nextLine();
            this.taskController.removeTask(id);
            System.out.println("Tarea eliminada correctamente");
        } catch (TaskException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e){
            System.out.println("Error inesperado");
            e.printStackTrace();
        }
    }

    public void showTaskView(){
        try {
            System.out.println("\n Lista de tareas: ");
            this.taskController.showTasks();
        } catch (TaskValidationException e){
            System.out.println("Error inesperado");
            e.printStackTrace();
        }
    }

    public void updateTaskView(){
        try {
            Task task = getTaskInput();
            taskController.updateTask(task.getId(), task.getTitle(), task.getDescription(), task.getCompleted());
        } catch (TaskException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e){
            System.out.println("Error inesperado");
            e.printStackTrace();
        }
    }

    private Task getTaskInput(){
        System.out.println("Ingresar ID");
        String id = scanner.nextLine();

        System.out.println("Ingrese el titulo");
        String title = scanner.nextLine();

        System.out.println("Ingresar descripcion");
        String description = scanner.nextLine();

        System.out.println("Esta completa? true/false");
        Boolean completed = Boolean.parseBoolean(scanner.nextLine());

        return new Task(id, title, description, completed);
    }
}
