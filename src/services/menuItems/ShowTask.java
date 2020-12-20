package services.menuItems;

import entities.Task;

public class ShowTask extends UserMenu {
    private Task task;
    public ShowTask(String title, Task task) {
        super(title);
        this.task = task;
    }
}
