package org.example.factory;

public class DatabaseFactory {
    public static Database createDatabase(String type) {
        if (type.equalsIgnoreCase("mysql")) {
            return new MySQLDatabase();
        }
        return null;
    }
}
