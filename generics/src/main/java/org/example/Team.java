package org.example;

import java.util.ArrayList;

public class Team<T extends Player> {

    private String teamName;
    private ArrayList<T> members = new ArrayList<>();

    public String getTeamName() {
        return teamName;
    }

    public Team(String teamName) {
        this.teamName = teamName;
    }

    public boolean addPlayer(T player) {
        if (members.contains(player)) {
            System.out.println(player.getName() + " is already on this team");
            return false;
        } else {
            members.add(player);
            System.out.println(player.getName() + " picked for a team " + this.teamName);
            return true;
        }
    }

    public int numberOfPlayers() {
        return this.members.size();
    }
}
