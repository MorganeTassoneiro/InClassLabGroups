/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.sql.Connection;
 import java.sql.*;

/**
 *
 * @author morga
 */

    
   

interface DatabaseInitializer {
    Connection connect() throws SQLException;
}

class MySqlConnector implements DatabaseInitializer {
    private final String USER = "football";
    private final String PASS = "Java is almost as good as football";
    private final String dbName;

    public MySqlConnector(String dbName) {
        this.dbName = dbName;
    }

        @Override
    public Connection connect() throws SQLException {
        return DriverManager.getConnection("jdbc:mysql://localhost/", USER, PASS);
    }

}
