package services.taskServices;

import entities.Task;

import java.util.List;

/*
@interface
Интерфейс для добавления/сохрания/изменения/удаления задачи
 */
public interface TaskService {

    Task createTask();

    void saveTask(Task task);

    List<Task> getAllTasks();
}
