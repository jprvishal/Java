package com.sharma.designpattern.factory;

public class OracleConnection extends DBConnection {

    @Override
    public String getDescription() {
        return "Oracle";
    }
}
