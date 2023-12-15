/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aadp_lab_soccersimulator;

import java.util.Scanner;

/**
 *
 * @author morga
 */
public class AADP_Lab_SoccerSimulator2 {
   public static void main(String[] args) {
        String dbName = "world_cup";
        String[] teams = {"Ireland", "Brazil", "Argentina", "Japan", "Mexico", "Senegal", "Tunisia", "Qatar"};

        // Initialize database
        
     
        int option;
        boolean exit = false;
        Scanner sc = new Scanner(System.in);
        TeamManager teamManager = new TeamManager(teams);
        PlayerDataInput playerDataInput = new ConsolePlayerDataInput(sc);

        // Rest of the main method...
    }

    private static class MySqlConnector {

        public MySqlConnector(String dbName) {
        }
    }
}