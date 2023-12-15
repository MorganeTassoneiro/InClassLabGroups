/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author morga
 */
public class DatabaseOperation {
   public static void main(String[] args, Iterable<String> teams) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
    for (String team : teams) {
                stmt.execute(
                        "CREATE TABLE IF NOT EXISTS "+ team + " ("
                                + "name VARCHAR(30) NOT NULL,"
                                + "number INT NOT NULL PRIMARY KEY,"
                                + "birth VARCHAR(30),"
                                + "position VARCHAR(30),"
                                + "goalsScored INT,"
                                + "background TEXT(1000));"
                );                
            }
}

private static void insertPlayerData(Connection conn, String teamName, String name, int number, String birth, String position, int goalsScored, String background) throws SQLException {
    Statement stmt = conn.createStatement();
    stmt.execute(String.format("INSERT INTO %s (name, number, birth, position, goalsScored, background) "
                    + "VALUES (\"%s\", %d, \"%s\", \"%s\", %d,  \"%s\") ;",
            teamName, name, number, birth, position, goalsScored, background)
    
    );
}


    private DatabaseOperation() {
    }

    
}