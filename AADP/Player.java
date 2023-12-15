/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aadp_lab_soccersimulator;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author morga
 */
public class Player {
    
    private static void displayPlayerData(Connection conn, String teamName) throws SQLException {
    Statement stmt = conn.createStatement();
    ResultSet rs = stmt.executeQuery("SELECT * from " + teamName + ";");
 String name;
                                int number;
                                String birth;
                                String position;
                                int goalsScored;
                                String background;
                                while (rs.next()) {
                                    name = rs.getString("name");
                                    number = rs.getInt("number");
                                    birth = rs.getString("birth");
                                    position = rs.getString("position");
                                    goalsScored = rs.getInt("goalsScored");
                                    background = rs.getString("background");
                                    System.out.println(String.format("Name: %s -- Number: %d -- DoB: %s -- Position: %s -- Number of goals scored: %d", name, number, birth, position, goalsScored));
                                    System.out.println("Background:");
                                    System.out.println(background);
                                }

    // constructor, getters, and setters
}

    Player() {
    }
}


