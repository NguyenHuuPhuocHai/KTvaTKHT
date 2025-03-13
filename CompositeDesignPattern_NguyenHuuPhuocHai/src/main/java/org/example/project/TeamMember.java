package org.example.project;

import org.example.observer.Observer;

public class TeamMember implements Observer {
    private String name;

    public TeamMember(String name) {
        this.name = name;
    }

    @Override
    public void receiveNotification(String message) {
        System.out.println("📩 Thành viên " + name + " nhận thông báo: " + message);
    }
}
