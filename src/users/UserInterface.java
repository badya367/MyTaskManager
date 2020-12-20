package users;

import services.ConsoleTaskServiceImpl;
import services.Menu;
import services.menuItems.GoToParent;
import services.menuItems.HelpMenu;
import services.menuItems.ShowAllTasksMenu;
import services.taskServices.TaskService;
import services.menuItems.UserMenu;

import java.util.Scanner;

/*
@Class UserInterface
класс для работы с пользователем (через консоль)
 */
public class UserInterface {
    private TaskService taskService = new ConsoleTaskServiceImpl();

    public void startTaskManager() {

        UserMenu startUserMenu = new UserMenu("Добро пожаловать в MyTaskManager");
        HelpMenu helpInfo = new HelpMenu("help info");
        GoToParent goToParent = new GoToParent(startUserMenu);
        helpInfo.addChild(goToParent);
        ShowAllTasksMenu showTasks = new ShowAllTasksMenu("Show Tasks");
        showTasks.addChild(goToParent);
        startUserMenu.addChild(showTasks);
        startUserMenu.addChild(helpInfo);

        Menu menu = startUserMenu;

        while (true){
        menu.showOptions();
        String input = getInput();
        menu = menu.executeOption(input);

        }


    }
    public String getInput() {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        return i + "";
    }
}


/*
        System.out.println("Для просмотра доступных команд введите в консоль '/help'");
        System.out.println("Введите нужную команду:");
        String command;
        Scanner userCommand = new Scanner(System.in);
        command = userCommand.nextLine();

        if (command.equals("/help")) {
            for (UserCommand all : UserCommand.values())
                System.out.println(all);
            System.out.println("Введите нужную команду");
            command = userCommand.nextLine();
        }
        if (command.equals(UserCommand.ADD.name())) {
            Task task = taskService.createTask();
            taskService.saveTask(task);
        }
*/