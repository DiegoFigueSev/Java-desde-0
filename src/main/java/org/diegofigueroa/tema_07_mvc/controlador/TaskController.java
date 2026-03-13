package org.diegofigueroa.tema_07_mvc.controlador;

import org.diegofigueroa.tema_07_mvc.excepciones.TaskException;
import org.diegofigueroa.tema_07_mvc.excepciones.TaskValidationException;
import org.diegofigueroa.tema_07_mvc.modelo.Task;
import org.diegofigueroa.tema_07_mvc.modelo.TaskRepository;

import java.util.List;

public class TaskController {
    private final TaskRepository repository;

    public TaskController(TaskRepository repository) {
        this.repository = repository;
    }

    public void addTask(String id, String title, String description, Boolean completed) throws TaskException {
        try {
            validateTaskData(id, title, description, completed);
            Task task = new Task(id, title, description, completed);
            this.repository.save(task);
            System.out.println("La tarae fue agregada exitosamente");
        } catch (TaskValidationException e){
            System.out.println(e.getMessage());
        }
    }

    public void removeTask(String id) throws TaskException {
        this.repository.remove(id);
    }

    public void showTasks() throws TaskValidationException{
        List<Task> tasks = this.repository.showAll();
        if (tasks.isEmpty()) throw new TaskValidationException("La lista no puede estar vacio");
        for (Task task : tasks){
            System.out.println(task);
        }
    }

    public void updateTask(String id, String title, String description, Boolean completed) throws TaskException {
        try {
            validateTaskData(id, title, description, completed);
            Task updateTask = new Task(id, title, description, completed);
            this.repository.updateTask(updateTask);
        }catch (TaskValidationException e){
            System.out.println(e.getMessage());
        }
    }

    private void validateTaskData(String id, String title, String description, Boolean completed) throws TaskValidationException {
        if (id==null || id.trim().isEmpty()) throw new TaskValidationException("El id no puede ser nulo ni vacio");
        if (title==null || title.trim().isEmpty()) throw new TaskValidationException("El titulo no puede ser nulo ni vacio");
        if (description==null || description.trim().isEmpty()) throw new TaskValidationException("La descripcion no puede ser nulo ni vacio");
        if (completed == null) throw new TaskValidationException("El estado no puede ser null");
    }
}
