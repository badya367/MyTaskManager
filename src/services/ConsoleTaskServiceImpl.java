package services;

import entities.Task;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.Scanner;

public class ConsoleTaskServiceImpl implements TaskService {

    /*
    @method createTask
    Создаёт новую задачу, ввод данных осуществляется с консоли
     */
    @Override
    public Task createTask() {
        Task task = new Task();
        Scanner in_task_name = new Scanner(System.in);
        System.out.println("Введите название задачи: ");
        String taskNameImpl = in_task_name.nextLine();


        Scanner in_task_description = new Scanner(System.in);
        System.out.println("Введите описание задачи: ");
        String descriptionImpl = in_task_description.nextLine();

        Scanner in_task_time = new Scanner(System.in);
        System.out.println("Время на выполнение задачи: ");
        int timeImpl = in_task_time.nextInt();

        Scanner in_task_contact = new Scanner(System.in);
        System.out.println("Контакты: ");
        String contactsImpl = in_task_contact.nextLine();

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
}
