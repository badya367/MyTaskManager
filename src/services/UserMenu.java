package services;

import entities.Task;
import entities.TaskJournal;

import java.util.Scanner;

public class UserMenu {

    private void printMenu() {
        System.out.println("1- Просмотреть задачи.");
        System.out.println("2- Добавить задачу.");
        System.out.println("3- Помощь.");
        System.out.println("4- О программе.");
        System.out.println("5- Вывести срочную задачу.");
        System.out.println("6- Выход");
    }

    private void selectMenu(int numberMenu) {

        switch (numberMenu) {
            case 1:
                System.out.println("***Посмотрим все задачи***");
                ConsoleTaskServiceImpl bla = new ConsoleTaskServiceImpl();
                //bla.showTaskList(allTask);
                break;
            case 2:
                TaskService taskService = new ConsoleTaskServiceImpl();
                Task task = taskService.createTask();
                taskService.saveTask(task);
                break;
            case 3:
                System.out.println("Бог в помощь");
                break;
            case 4:
                System.out.println("Проектная задача для учебного центра компании 'NetCracker' \n"
                        + "'My Task Manager' создан для того, чтобы добавлять, хранить, удалять задачи. \n"
                        + "Также 'My Task Manager' уведомит Вас о ближажайшей задаче");
                break;
            case 5:
                System.out.println("***Выводится срочная задача***");
                break;
            case 6:
                System.out.println("До свиданиия! Вы всё успеете ;-)");
        }
    }

    public void startMenu() {
        Scanner userInput = new Scanner(System.in);
        printMenu();
        while (userInput.hasNext()) {
            selectMenu(userInput.nextInt());
        }
    }
}
