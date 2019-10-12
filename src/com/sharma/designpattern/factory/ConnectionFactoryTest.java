package com.sharma.designpattern.factory;

public class ConnectionFactoryTest {

    public static void main(String[] args) {

        ConnectionFactory factory = new ConnectionFactory("test");

        DBConnection connection = factory.createConnection();
        System.out.println(connection.getDescription());

        ConnectionFactory oracleConnFactory = new ConnectionFactory("Oracle");

        DBConnection oracleConnection = oracleConnFactory.createConnection();
        System.out.println(oracleConnection.getDescription());

        ConnectionFactory mySqlConnFactory = new ConnectionFactory("MySQL");

        DBConnection mySQLConnection = mySqlConnFactory.createConnection();
        System.out.println(mySQLConnection.getDescription());

    }
}
