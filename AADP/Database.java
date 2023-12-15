/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author morga
 */
public class Database {
    
    private static Connection getDatabaseConnection(String dbName, String user, String password) throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException {
    String DB_URL = "jdbc:mysql://localhost/" + dbName;
    Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
    return DriverManager.getConnection(DB_URL, user, password);
}

    private Database() {
    }

}
