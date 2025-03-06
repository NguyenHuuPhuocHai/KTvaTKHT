package org.example.factory;

public class MySQLDatabase implements Database{
    public void connect() {
        System.out.println(" Connected to MySQL");
    }
}
