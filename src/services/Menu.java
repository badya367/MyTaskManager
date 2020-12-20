package services;

public interface Menu {
    void showOptions();
    Menu executeOption(String option);
    String getTitle();
}
