package services.menuItems;

import services.Menu;

public class GoToParent implements Menu {
    private Menu parent;

    public GoToParent(Menu parent) {
        this.parent = parent;
    }

    @Override
    public void showOptions() {

    }

    @Override
    public Menu executeOption(String option) {
        return parent;
    }

    @Override
    public String getTitle() {
        return "Вернуться в предыдущее меню";
    }

}
