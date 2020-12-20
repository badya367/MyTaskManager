package services.taskServices;

public class TaskServiceFactory {
    public static final TaskService getTaskService() {
        return new TestTaskService();
    }
}
