/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.Scanner;

/**
 *
 * @author morga
 */
class ConsolePlayerDataInput extends PlayerDataInput {
    private final Scanner scanner;

    public ConsolePlayerDataInput(Scanner scanner) {
        this.scanner = scanner;
    }

    public Player enterPlayerData(String teamName) {
        // Input logic for player data using the scanner
        // ...

        return new Player(); // Return the player object
    }
}