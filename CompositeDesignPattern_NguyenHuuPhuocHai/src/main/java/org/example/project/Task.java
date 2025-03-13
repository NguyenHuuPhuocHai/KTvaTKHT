package org.example.project;


import org.example.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class Task {
    private String taskName;
    private String status;
    private List<Observer> observers = new ArrayList<>();

    public Task(String taskName) {
        this.taskName = taskName;
        this.status = "To-Do";
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void changeStatus(String newStatus) {
        System.out.println("\n🔔 Công việc [" + taskName + "] thay đổi trạng thái: " + status + " → " + newStatus);
        this.status = newStatus;
        notifyObservers();
    }

    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.receiveNotification("📌 Công việc [" + taskName + "] đã chuyển sang trạng thái: " + status);
        }
    }
}
