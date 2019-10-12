package com.sharma.designpattern.factory;

public class ConnectionFactory {

    String type;

    ConnectionFactory(String databaseType) {
        this.type = databaseType;
    }

    public DBConnection createConnection() {
        DBConnection connection;

        if ("Oracle".equals(type)) {
            connection = new OracleConnection();
        } else if ("SQLServer".equals(type)) {
            connection = new SQLServerConnection();
        } else if ("MySQL".equals(type)) {
            connection = new MySQLConnection();
        } else {
            connection = new DBConnection();
        }

        return connection;
    }

}
