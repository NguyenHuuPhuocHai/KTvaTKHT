package org.example;

import org.example.project.Task;
import org.example.project.TeamMember;
import org.example.stock.Investor;
import org.example.stock.Stock;

public class Main {
    public static void main(String[] args) {

        Stock stock = new Stock("Apple", 150.0);
        Investor investor1 = new Investor("Nguyen Van A");
        Investor investor2 = new Investor("Le Thi B");

        CompositeObserver investorGroup = new CompositeObserver();
        investorGroup.addObserver(investor1);
        investorGroup.addObserver(investor2);

        stock.addObserver(investorGroup);
        stock.setPrice(155.0); // 🔔 Giá thay đổi
        stock.setPrice(160.0);


        Task task = new Task("Phát triển tính năng đăng nhập");
        TeamMember member1 = new TeamMember("Hoang Minh");
        TeamMember member2 = new TeamMember("Tran Thi Lan");

        CompositeObserver teamGroup = new CompositeObserver();
        teamGroup.addObserver(member1);
        teamGroup.addObserver(member2);

        task.addObserver(teamGroup);
        task.changeStatus("In Progress"); 
        task.changeStatus("Completed");

    }
}