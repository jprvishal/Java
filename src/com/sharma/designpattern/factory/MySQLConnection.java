package com.sharma.designpattern.factory;

public class MySQLConnection extends DBConnection {

    @Override
    public String getDescription() {
        return "MySQL";
    }
}
