package services;

import entities.Task;
/*
@interface
Интерфейс для добавления/сохрания/изменения/удаления задачи
 */
public interface TaskService {

    Task createTask();

    void saveTask(Task task);
}
