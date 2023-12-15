/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.*;
/**
 *
 * @author morga
 */


interface DatabaseConnector {
    Connection connect() throws SQLException;
}

class MySqlConnector implements DatabaseConnector {
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

class DatabaseInitializer {
    public static void initializeDatabase(DatabaseConnector connector, String dbName, String[] teams) throws SQLException {
        try (Connection conn = connector.connect(); Statement stmt = conn.createStatement()) {
            stmt.execute("CREATE SCHEMA IF NOT EXISTS " + dbName + ";");
            stmt.execute("USE " + dbName + ";");
            for (String team : teams) {
                stmt.execute("CREATE TABLE IF NOT EXISTS " + team + " ("
                        + "name VARCHAR(30) NOT NULL,"
                        + "number INT NOT NULL PRIMARY KEY,"
                        + "birth VARCHAR(30),"
                        + "position VARCHAR(30),"
                        + "goalsScored INT,"
                        + "background TEXT(1000));"
                );
            }
        }
    }

    private DatabaseInitializer() {
    }
}
