package services.menuItems;

import entities.Task;
import services.Menu;
import services.taskServices.TaskService;
import services.taskServices.TaskServiceFactory;

import java.util.List;

public class ShowAllTasksMenu extends UserMenu {
    public ShowAllTasksMenu(String title) {
        super(title);
    }

    @Override
    public void showOptions() {
        super.showOptions();
        TaskService taskService = TaskServiceFactory.getTaskService();
        List<Task> allTasks = taskService.getAllTasks();
        for (Task allTask : allTasks) {
         int i=   getMenus().size()+allTasks.indexOf(allTask);
            System.out.println(i+". "+allTask.getTaskName());
        }
    }

    @Override
    public Menu executeOption(String option) {
        int size = getMenus().size();
        int i = Integer.parseInt(option);
        if (i<size){
            return getMenus().get(i);
        }
        int i1 = i - size;
        Task task = TaskServiceFactory.getTaskService().getAllTasks().get(i1);
        return new ShowTask(task.getTaskName(),task);
    }
}
