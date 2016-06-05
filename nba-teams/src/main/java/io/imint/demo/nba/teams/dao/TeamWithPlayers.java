package io.imint.demo.nba.teams.dao;

import java.util.List;

/**
 * Created by ivan on 01/06/2016.
 */
public class TeamWithPlayers extends Team {
    private List<Player> players;

    public TeamWithPlayers(Team team, List<Player> players) {
        super(team.getId(), team.getName(), team.getZone(), team.getDivision(), team.getCity());
        this.players = players;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }
}
