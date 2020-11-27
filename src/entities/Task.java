package entities;

import java.io.Serializable;
/*
@class Task
Модель описывающая конкретную задачу
 */
public class Task implements Serializable {
    private Long id;
    private String taskName;
    private String description;
    private int time;
    private String contacts;


    @Override
    public String toString() {
        return "Ваша задача: " + '\n' +
                "{" + '\n' +
                "Название: " + this.taskName + '\n' +
                "Описание: " + description + '\n' +
                "Время: " + time + '\n' +
                "Контакты: " + contacts + '\n' +
                '}';
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTaskName(String task_name) {
        this.taskName = task_name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts;
    }

    public String getTaskName() {
        return taskName;
    }

    public String getDescription() {
        return description;
    }

    public int getTime() {
        return time;
    }

    public String getContacts() {
        return contacts;
    }




}
