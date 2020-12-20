package services.menuItems;

import services.Menu;

public class ExitMenu implements Menu {

    @Override
    public void showOptions() {
        System.exit(0);
    }

    @Override
    public Menu executeOption(String option) {
        return null;
    }

    @Override
    public String getTitle() {
        return "exit";
    }
}
