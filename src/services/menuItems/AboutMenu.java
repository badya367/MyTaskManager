package services.menuItems;

public class AboutMenu extends UserMenu {
    public AboutMenu(String title) {
        super(title);
    }

    @Override
    public void showOptions() {
        super.showOptions();
        System.out.println("Проектная задача для учебного центра компании 'NetCracker' \n"
                + "'My Task Manager' создан для того, чтобы добавлять, хранить, удалять задачи. \n"
                + "Также 'My Task Manager' уведомит Вас о ближажайшей задаче");
    }
}
