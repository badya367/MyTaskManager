package services.taskServices;

import entities.Task;
import services.taskServices.TaskService;

import java.util.ArrayList;
import java.util.List;

public class TestTaskService implements TaskService {
private List<Task> tasks =new ArrayList<>();

    public TestTaskService() {
        Task task1 = new Task();
        task1.setTaskName("TestTask1");
        task1.setDescription("Test1Descrip");
        task1.setContacts("2313124214");
        tasks.add(task1);
    }

    @Override
    public Task createTask() {
        return null;
    }

    @Override
    public void saveTask(Task task) {

    }

    @Override
    public List<Task> getAllTasks() {
        return tasks;
    }
}
