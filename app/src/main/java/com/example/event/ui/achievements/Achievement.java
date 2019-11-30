package com.example.event.ui.achievements;

public class Achievement {

    private int icon;
    private String name;
    private String description;

    public Achievement(int ic_menu_send, String achivochka, String description) {
    }

    public Achievement(String name, String description, int icon) {
        this.icon = icon;
        this.name = name;
        this.description = description;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
