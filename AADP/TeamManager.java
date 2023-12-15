/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aadp_lab_soccersimulator;

/**
 *
 * @author morga
 */
class TeamManager {

 
    private final String[] teams;

    public TeamManager(String[] teams) {
        this.teams = teams;
    }

    public boolean isValidTeam(String teamName) {
        for (String team : teams) {
            if (teamName.equalsIgnoreCase(team)) {
                return true;
            }
        }
        return false;
    }
}

