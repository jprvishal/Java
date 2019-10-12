package com.sharma.designpattern.factory;

public class ConnectionWithOutFactory {

    private class DBConnection{

    }

    private class OracleConnection extends DBConnection {

    }

    private class SQLServerConnection extends DBConnection  {

    }

    private class MySQLConnection extends DBConnection  {

    }

    /*
    * With out factor pattern code in the following method will be duplicated in every method that
    * seeks to retrieve data  from the database or we can say that following code will be part of the core code.
    * In future if our application start storing data in another database this code needs to change in all
    * the class so this is the volatile code.
    *
    * Factory pattern says you should move your volatile code into a separate class called factory and any class that
    * need to read data from database need to get connection object from the Factory. This way in case we need to add
    * another database only Factory need to change to create new connection of new database type.
    *
    * */
    public DBConnection retrieveDataDatabase(String databaseType, String sqlString) {

        DBConnection connection;

        if ("Oracle".equals(databaseType)) {
            connection = new OracleConnection();
        } else if ("SQLServer".equals(databaseType)) {
            connection = new SQLServerConnection();
        } else {
            connection = new MySQLConnection();
        }

        return connection;
    }
}
