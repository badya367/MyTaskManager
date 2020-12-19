package users;

import services.ConsoleTaskServiceImpl;
import services.TaskService;
import services.UserMenu;

/*
@Class UserInterface
класс для работы с пользователем (через консоль)
 */
public class UserInterface {
    private TaskService taskService = new ConsoleTaskServiceImpl();

    public void startTaskManager() {
        System.out.println("Добро пожаловать в MyTaskManager");
        UserMenu startUserMenu = new UserMenu();
        startUserMenu.startMenu();
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