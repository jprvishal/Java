package com.sharma.designpattern.factory;

public class SQLServerConnection extends DBConnection {

    @Override
    public String getDescription() {
        return "SQLServer";
    }
}
