package org.example;

public class TeamTest {
    public static void main(String[] args) {
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beck = new SoccerPlayer("Beck");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        Team<SoccerPlayer> liverpool = new Team<>("Liverpool");
        Team<FootballPlayer> barca = new Team<>("Barcelona");
        Team<BaseballPlayer> baseballPlayerTeam = new Team<>("BaseBall");

        barca.addPlayer(joe);
        baseballPlayerTeam.addPlayer(pat);
        liverpool.addPlayer(beck);
        liverpool.addPlayer(beckham);
        System.out.println(liverpool.numberOfPlayers());
    }
}
