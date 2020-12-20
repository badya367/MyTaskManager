package services;

import entities.Task;
import org.xml.sax.SAXException;
import services.taskServices.TaskService;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class ConsoleTaskServiceImpl implements TaskService {

    /*
    @method createTask
    Создаёт новую задачу, ввод данных осуществляется с консоли
     */
    @Override
    public Task createTask() {
        Task task = new Task();
        Scanner inTaskName = new Scanner(System.in);
        System.out.println("Введите название задачи: ");
        String taskNameImpl = inTaskName.nextLine();


        Scanner inTaskDescription = new Scanner(System.in);
        System.out.println("Введите описание задачи: ");
        String descriptionImpl = inTaskDescription.nextLine();

        Scanner inTaskTime = new Scanner(System.in);
        System.out.println("Время на выполнение задачи: ");
        int timeImpl = inTaskTime.nextInt();

        Scanner inTaskContact = new Scanner(System.in);
        System.out.println("Контакты: ");
        String contactsImpl = inTaskContact.nextLine();

        task.setTaskName(taskNameImpl);
        task.setDescription(descriptionImpl);
        task.setTime(timeImpl);
        task.setContacts(contactsImpl);
        return task;
    }

    /*
    @method saveTask
    Сохраняет созданную задачу
     */
    @Override
    public void saveTask(Task task) {
        TaskLogJob taskLogJob = new TaskLogJob();
        try {
            taskLogJob.addNewTaskInLog(task);
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Task> getAllTasks() {
        return null;
    }

    public void showTaskList(Task task) {
        task.getTaskName();

    }
}
